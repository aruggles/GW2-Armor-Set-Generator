package Model;

/**
 * Created by Adam on 8/15/2015.
 */
public class Build {
    private Profession profession;
    private Armor helm;
    private Armor shoulders;
    private Armor coat;
    private Armor gloves;
    private Armor leggings;
    private Armor boots;
    private Accessory amulet;
    private Accessory ring1;
    private Accessory ring2;
    private Accessory earring1;
    private Accessory earring2;
    private Accessory back;
    private Weapon mainHand;
    private Weapon offHand;
    private double effectivePower = 0;
    private BuildEvaluation eval;

    public Build() {}

    public Build(Build b) {
        this.profession = b.getProfession();
        this.helm = b.getHelm();
        this.shoulders = b.getShoulders();
        this.coat = b.getCoat();
        this.gloves = b.getGloves();
        this.leggings = b.getLeggings();
        this.boots = b.getBoots();
        this.amulet = b.getAmulet();
        this.ring1 = b.getRing1();
        this.ring2 = b.getRing2();
        this.earring1 = b.getEarring1();
        this.earring2 = b.getEarring2();
        this.back = b.getBack();
        this.mainHand = b.getMainHand();
        this.offHand = b.getOffHand();
    }

    public BuildEvaluation getEval() {
        return eval;
    }

    public void setEval(BuildEvaluation eval) {
        this.eval = eval;
    }

    public double getEffectivePower() {
        return effectivePower;
    }

    public void setEffectivePower(double effectivePower) {
        this.effectivePower = effectivePower;
    }

    public Profession getProfession() {
        return profession;
    }

    public void setProfession(Profession profession) {
        this.profession = profession;
    }

    public Armor getHelm() {
        return helm;
    }

    public void setHelm(Armor helm) {
        this.helm = helm;
    }

    public Armor getShoulders() {
        return shoulders;
    }

    public void setShoulders(Armor shoulders) {
        this.shoulders = shoulders;
    }

    public Armor getCoat() {
        return coat;
    }

    public void setCoat(Armor coat) {
        this.coat = coat;
    }

    public Armor getGloves() {
        return gloves;
    }

    public void setGloves(Armor gloves) {
        this.gloves = gloves;
    }

    public Armor getLeggings() {
        return leggings;
    }

    public void setLeggings(Armor leggings) {
        this.leggings = leggings;
    }

    public Armor getBoots() {
        return boots;
    }

    public void setBoots(Armor boots) {
        this.boots = boots;
    }

    public Accessory getAmulet() {
        return amulet;
    }

    public void setAmulet(Accessory amulet) {
        this.amulet = amulet;
    }

    public Accessory getRing1() {
        return ring1;
    }

    public void setRing1(Accessory ring1) {
        this.ring1 = ring1;
    }

    public Accessory getRing2() {
        return ring2;
    }

    public void setRing2(Accessory ring2) {
        this.ring2 = ring2;
    }

    public Accessory getEarring1() {
        return earring1;
    }

    public void setEarring1(Accessory earring1) {
        this.earring1 = earring1;
    }

    public Accessory getEarring2() {
        return earring2;
    }

    public void setEarring2(Accessory earring2) {
        this.earring2 = earring2;
    }

    public Accessory getBack() {
        return back;
    }

    public void setBack(Accessory back) {
        this.back = back;
    }

    public Weapon getMainHand() {
        return mainHand;
    }

    public void setMainHand(Weapon mainHand) {
        this.mainHand = mainHand;
    }

    public Weapon getOffHand() {
        return offHand;
    }

    public void setOffHand(Weapon offHand) {
        this.offHand = offHand;
    }
}
