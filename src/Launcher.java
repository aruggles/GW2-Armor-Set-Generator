import Model.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Adam on 8/15/2015.
 */
public class Launcher {
    private final static int HEALTH = 16500;
    private final static int ARMOR = 2400;
    private final static int HEALING_POWER = 0;


    private static List<Build> bestBuilds = Collections.synchronizedList(new ArrayList<Build>());

    private static BuildEvaluation evaluateBuild(final Build b) {
        int defense = 0;
        int health = 0;
        int armor = 0;

        double effectivePower = 0.0;
        double criticalDamage = 0.0;
        double criticalChance = 0.0;

        //double conditionDuration = 0.0;
        Attributes a = new Attributes();
        //a.setPower(150); // Added for infusion.
        //a.setToughness(35); // Added for infusion.
        //a.setVitality(175);
        //a.setToughness(a.getToughness() + 100);

        // Model.Profession attributes.
        if (b.getProfession() != null) {
            addAttributes(a, b.getProfession().getAttributes());
            if ("light".equalsIgnoreCase(b.getProfession().getArmorType())) {
                defense+=967;
            } else if ("medium".equalsIgnoreCase(b.getProfession().getArmorType())) {
                defense+=1118;
            } else {
                defense+=1271; // Ascended.
                //defense+=1211; // Exotic
            }
        }
        // Model attributes
        if (b.getHelm() != null) {
            addAttributes(a, b.getHelm().getAttributes());
        }
        if (b.getShoulders() != null) {
            addAttributes(a, b.getShoulders().getAttributes());
        }
        if (b.getCoat() != null) {
            addAttributes(a, b.getCoat().getAttributes());
        }
        if (b.getGloves() != null) {
            addAttributes(a, b.getGloves().getAttributes());
        }
        if (b.getLeggings() != null) {
            addAttributes(a, b.getLeggings().getAttributes());
        }
        if (b.getBoots() != null) {
            addAttributes(a, b.getBoots().getAttributes());
        }
        // Accessories attributes.
        if (b.getAmulet() != null) {
            addAttributes(a, b.getAmulet().getAttributes());
        }
        if (b.getRing1() != null) {
            addAttributes(a, b.getRing1().getAttributes());
        }
        if (b.getRing2() != null) {
            addAttributes(a, b.getRing2().getAttributes());
        }
        if (b.getEarring1() != null) {
            addAttributes(a, b.getEarring1().getAttributes());
        }
        if (b.getEarring2() != null) {
            addAttributes(a, b.getEarring2().getAttributes());
        }
        if (b.getBack() != null) {
            addAttributes(a, b.getBack().getAttributes());
        }
        // Weapon attributes.
        if (b.getMainHand() != null) {
            addAttributes(a, b.getMainHand().getAttributes());
        }
        if (b.getOffHand() != null) {
            addAttributes(a, b.getOffHand().getAttributes());
        }
        // Lemon Grass
        //a.setVitality(a.getVitality() + 70);
        // Maint. Oils
        a.setVitality(a.getVitality() + 100);
        a.setFerocity(a.getFerocity() + Math.round(a.getVitality() * .1f));
       // a.setPower(a.getPower() + Math.round(a.getToughness() * .06f) + Math.round(a.getVitality() * .04f));
        //a.setPower(a.getPower() + 100);
        //a.setPrecision(a.getPrecision() + 70);

        health = b.getProfession().getHealth() + ((a.getVitality() - 1000) * 10);
        armor = defense + a.getToughness();
        criticalChance = ((a.getPrecision() - 916) / 21.0) / 100.0;
        criticalDamage = 1.5 + ((a.getFerocity() / 15.0) / 100.0);
        effectivePower = a.getPower() * (1 + (criticalChance * (criticalDamage - 1)));
        BuildEvaluation eval = new BuildEvaluation();
        eval.setArmor(armor);
        eval.setAttributes(a);
        eval.setCriticalDamage(criticalDamage);
        eval.setDefense(defense);
        eval.setCriticalChance(criticalChance);
        eval.setEffectivePower(effectivePower);
        eval.setHealth(health);
        return eval;
    }

    private static float heuristic(final Build b) {
        BuildEvaluation eval = evaluateBuild(b);
        float value = 0.0f;
        value += eval.getEffectivePower() / 5000;
        value += eval.getEvaluatedHeath(HEALTH);
        value += eval.getEvaluatedArmor(ARMOR);
        value += eval.getEvaluatedHealingPower(HEALING_POWER);
        eval.setHeuristic(value);
        b.setEval(eval);
        return value;
    }

    private static boolean evaluateBuilds(final Build original, final Build updated) {
        if (original.getEval() == null) {
            BuildEvaluation originalEval = evaluateBuild(original);
            original.setEval(originalEval);
        }
        if (updated.getEval() == null) {
            BuildEvaluation updatedEval = evaluateBuild(updated);
            updated.setEval(updatedEval);
        }
        if (original.getEval().getEffectivePower() < updated.getEval().getEffectivePower()) {
            return true;
        }
        if (original.getEval().getEvaluatedHeath(HEALTH) < updated.getEval().getEvaluatedHeath(HEALTH)) {
            return true;
        }
        if (original.getEval().getEvaluatedArmor(ARMOR) < updated.getEval().getEvaluatedHeath(ARMOR)) {
            return true;
        }
        if (original.getEval().getEvaluatedHealingPower(HEALING_POWER) < updated.getEval().getEvaluatedHealingPower(HEALING_POWER)) {
            return true;
        }
        return false;
    }

    private static void testBuild(Build b) {

        BuildEvaluation eval = evaluateBuild(b);

        if (eval.getArmor() >= ARMOR && eval.getHealth() >= HEALTH
                && eval.getAttributes().getHealingPwr() >= HEALING_POWER) {
            b.setEval(eval);
            b.setEffectivePower(eval.getEffectivePower());
            synchronized (bestBuilds) {
                if (bestBuilds.isEmpty()) {
                    bestBuilds.add(b);
                } else {
                    // If build is the best.
                    if (bestBuilds.get(0).getEffectivePower() < eval.getEffectivePower()) {
                        Build old = bestBuilds.get(0);
                        bestBuilds.clear();
                        bestBuilds.add(b);
                        printBuild(b, old);
                    } else if (bestBuilds.get(0).getEffectivePower() == eval.getEffectivePower()) {
                        System.out.println("Adding Alternate.");
                        printBuild(b, null);
                        bestBuilds.add(b);
                    }
                }
            }
        }
    }
    private static void printBuild(Build b, Build old) {
        System.out.println("Helm: " + b.getHelm().getName());
        System.out.println("Shoulders: " + b.getShoulders().getName());
        System.out.println("Coat: " + b.getCoat().getName());
        System.out.println("Gloves: " + b.getGloves().getName());
        System.out.println("Leggings: " + b.getLeggings().getName());
        System.out.println("Boot: " + b.getBoots().getName());
        System.out.println("--");
        System.out.println("Amulet: " + b.getAmulet().getName());
        System.out.println("Ring1: " + b.getRing1().getName());
        System.out.println("Ring2: " + b.getRing2().getName());
        System.out.println("Earring1: " + b.getEarring1().getName());
        System.out.println("Earring2: " + b.getEarring2().getName());
        System.out.println("Back: " + b.getBack().getName());
        System.out.println("--");
        System.out.println("Main Hand: " + b.getMainHand().getName());
        if (b.getOffHand() != null) {
            System.out.println("Off Hand: " + b.getMainHand().getName());
        }
        System.out.println("Crit Chance: " + b.getEval().getCriticalChance() * 100);
        System.out.println("Crit Damage: " + b.getEval().getCriticalDamage() * 100);
        System.out.println("Health: " + b.getEval().getHealth());
        System.out.println("Model: " + b.getEval().getArmor());
        System.out.println(b.getEval().getAttributes());
        System.out.println("Effective Power: " + b.getEffectivePower());
        if (old != null) {
            System.out.println("Old Eff. Power:" + old.getEffectivePower());
        }
        System.out.println("----------------------------------------------");
    }
    private static void addAttributes(Attributes a1, Attributes a2) {
        a1.setConditionDmg(a1.getConditionDmg() + a2.getConditionDmg());
        a1.setFerocity(a1.getFerocity() + a2.getFerocity());
        a1.setHealingPwr(a1.getHealingPwr() + a2.getHealingPwr());
        a1.setPower(a1.getPower() + a2.getPower());
        a1.setPrecision(a1.getPrecision() + a2.getPrecision());
        a1.setToughness(a1.getToughness() + a2.getToughness());
        a1.setVitality(a1.getVitality() + a2.getVitality());
    }

    private static void testBuildWithAccessories(Build b, DataGenerator g) {
        List<Accessory> backpieces = g.getAccessoryMap().get("backpieces");
        List<Accessory> earrings = g.getAccessoryMap().get("earrings");
        List<Accessory> rings = g.getAccessoryMap().get("rings");
        List<Accessory> amulets = g.getAccessoryMap().get("amulets");
        Build b1 = new Build(b);
        for (Accessory back : backpieces) {
            b1.setBack(back); b1.setEval(null);
            if (evaluateBuilds(b, b1)) {
                Build b2 = new Build(b1);
                for (Accessory amulet : amulets) {
                    b2.setAmulet(amulet); b2.setEval(null);
                    if (evaluateBuilds(b1, b2)) {
                        Build b3 = new Build(b2);
                        for (Accessory earring1 : earrings) {
                            b3.setEarring1(earring1); b3.setEval(null);
                            if (evaluateBuilds(b2, b3)) {
                                Build b4 = new Build(b3);
                                for (Accessory earring2 : earrings) {
                                    b4.setEarring2(earring2); b4.setEval(null);
                                    if (evaluateBuilds(b3, b4)) {
                                        Build b5 = new Build(b4);
                                        for (Accessory ring1 : rings) {
                                            b5.setRing1(ring1); b5.setEval(null);
                                            if (evaluateBuilds(b4, b5)) {
                                                Build b6 = new Build(b5);
                                                for (Accessory ring2 : rings) {
                                                    b6.setRing2(ring2); b6.setEval(null);
                                                    if (evaluateBuilds(b5, b6)) {
                                                        Build testBuild = new Build(b6);
                                                        testBuild(testBuild);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public static void main(String[] args) {

        DataGenerator g = new DataGenerator();

        // Run through ele builds that meet the criteria.
        //Model.Profession p = g.getProfessionMap().get("warrior");
        Profession p = g.getProfessionMap().get("elementalist");
        //Model.Profession p = g.getProfessionMap().get("guardian");
        Build b = new Build();
        b.setProfession(p);
        List<Thread> workers = new ArrayList<Thread>();
        for (Armor helm : g.getArmorMap().get("helms")) {
            Thread t = new Thread(new Worker(b, helm, g));
            t.start();
            workers.add(t);
            if (workers.size() > 2) {
                Thread worker = workers.remove(0);
                if (worker.isAlive()) {
                    try {
                        worker.join();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        while (!workers.isEmpty()) {
            Thread worker = workers.remove(0);
            if (worker.isAlive()) {
                try {
                    worker.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

        //runHeuristic();

        System.out.println("----------------------------------------------");
        System.out.println("------------------BEST------------------------");
        System.out.println("----------------------------------------------");
        for (Build best : bestBuilds) {
            printBuild(best, null);
        }

    }
    private static void runHeuristic() {
        DataGenerator g = new DataGenerator();
        Profession p = g.getProfessionMap().get("elementalist");
        Build b = new Build();
        b.setProfession(p);
        List<Build> helmBuilds = getBest(b, "helms", g);
        for (Build helmBuild : helmBuilds) {
            List<Build> shouldBuilds = getBest(helmBuild, "shoulders", g);
            for (Build shoulderBuild : shouldBuilds) {
                List<Build> coatBuilds = getBest(shoulderBuild, "coats", g);
                for (Build coatBuild : coatBuilds) {
                    List<Build> gloveBuilds = getBest(coatBuild, "gloves", g);
                    for (Build gloveBuild : gloveBuilds) {
                        List<Build> leggingBuilds = getBest(gloveBuild, "leggings", g);
                        for (Build leggingBuild : leggingBuilds) {
                            List<Build> bootBuilds = getBest(leggingBuild, "boots", g);
                            for (Build bootBuild : bootBuilds) {
                                Build weaponBuild = new Build(bootBuild);
                                for (Weapon weapon : g.getWeaponMap().get("staffs")) {
                                    //System.out.println("Testing Mainhand Weapon: " + weapon.getName());
                                    weaponBuild.setMainHand(weapon);
                                    weaponBuild.setEval(null);
                                    testBuildWithAccessories(weaponBuild, g);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    private static List<Build> getBest(Build b, String type, DataGenerator g) {
        List<Build> selected = new ArrayList<Build>();
        for (Armor armor : g.getArmorMap().get(type)) {
            Build armorBuild = new Build(b);
            if ("helms".equals(type)) {
                armorBuild.setHelm(armor);
            } else if ("shoulders".equals(type)) {
                armorBuild.setShoulders(armor);
            } else if ("coats".equals(type)) {
                armorBuild.setCoat(armor);
            } else if ("gloves".equals(type)) {
                armorBuild.setGloves(armor);
            } else if ("leggings".equals(type)) {
                armorBuild.setLeggings(armor);
            } else if ("boots".equals(type)) {
                armorBuild.setBoots(armor);
            } else {
                System.err.println("Error occurred getting type");
                continue;
            }
            float v = heuristic(armorBuild);
            if (selected.isEmpty()) {
               selected.add(armorBuild);
            } else if (selected.size() == 4) {
                for (int i =0; i < 4; i++) {
                    if (selected.get(i).getEval().getHeuristic() <= v) {
                        selected.add(i, armorBuild);
                        selected.remove(4);
                        break;
                    }
                }
            } else {
                int size = selected.size();
                boolean added = false;
                for (int i =0; i < size; i++) {
                    if (selected.get(i).getEval().getHeuristic() <= v) {
                        selected.add(i, armorBuild);
                        added = true;
                        break;
                    }
                    if (!added) {
                        selected.add(armorBuild);
                    }
                }
            }
        }
        return selected;
    }

    private static class Worker implements Runnable {
        private Build b;
        private DataGenerator g;
        private Armor helm;

        public Worker(Build b, Armor helm, DataGenerator g) {
            this.g = g;
            this.b = b;
            this.helm = helm;
        }

        public void run() {
            Build b1 = new Build(b);
            b1.setHelm(this.helm);
            System.out.println("Testing Helm: " + helm.getName());

            Build b2 = new Build(b1);
            for (Armor shoulder : g.getArmorMap().get("shoulders")) {
                System.out.println("Testing Shoulder: " + shoulder.getName());
                b2.setShoulders(shoulder);

                Build b3 = new Build(b2);
                for (Armor coat : g.getArmorMap().get("coats")) {
                    System.out.println("Testing Coat: " + coat.getName());
                    b3.setCoat(coat);

                    Build b4 = new Build(b3);
                    for (Armor glove : g.getArmorMap().get("gloves")) {
                        System.out.println("Testing Gloves: " + glove.getName());
                        b4.setGloves(glove);

                        Build b5 = new Build(b4);
                        for (Armor legging : g.getArmorMap().get("leggings")) {
                            System.out.println("Testing Leggings: " + legging.getName());
                            b5.setLeggings(legging);

                            Build b6 = new Build(b5);
                            for (Armor boot : g.getArmorMap().get("boots")) {
                                System.out.println("Testing Boots: " + boot.getName());
                                b6.setBoots(boot); b6.setEval(null);

                                Build b7 = new Build(b6);
                                for (Weapon weapon : g.getWeaponMap().get("staffs")) {
                                    //System.out.println("Testing Mainhand Weapon: " + weapon.getName());
                                    b7.setMainHand(weapon); b7.setEval(null);

                                    testBuildWithAccessories(b7, g);


                                }

                            }

                        }

                    }

                }

            }

        }
    }
}
