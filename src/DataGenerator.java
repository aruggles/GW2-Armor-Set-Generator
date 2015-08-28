/**
 * Created by Adam on 8/15/2015.
 */
import Model.*;

import java.util.*;

public class DataGenerator {
    private Map<String, List<Armor>> armorMap = new HashMap<String, List<Armor>>();
    private Map<String, List<Accessory>> accessoryMap = new HashMap<String, List<Accessory>>();
    private Map<String, List<Weapon>> weaponMap = new HashMap<String, List<Weapon>>();
    private Map<String, Profession> professionMap = new HashMap<>();

    private void generateHelms() {
        List<Armor> helms = new ArrayList<Armor>();
        // Exotic.
        //helms.add(new Model("Berserker", "helm", new Attributes(60, 0, 0, 43, 43, 0, 0), 77, 102, 121));
        //helms.add(new Model("Soldier", "helm", new Attributes(60, 43, 43, 0, 0, 0, 0), 77, 102, 121));
        //helms.add(new Model("Valkyrie", "helm", new Attributes(60, 0, 43, 0, 43, 0, 0), 77, 102, 121));
        //helms.add(new Model("Knight", "helm", new Attributes(43, 60, 0, 43, 0, 0, 0), 77, 102, 121));
        // Ascended.
        helms.add(new Armor("Berserker", "helm", new Attributes(63, 0, 0, 45, 45, 0, 0), 77, 102, 127));
        helms.add(new Armor("Soldier", "helm", new Attributes(63, 45, 45, 0, 0, 0, 0), 77, 102, 127));
        helms.add(new Armor("Valkyrie", "helm", new Attributes(63, 0, 45, 0, 45, 0, 0), 77, 102, 127));
//        helms.add(new Model("Zealot", "helm", new Attributes(63, 0, 0, 45, 0, 0, 45), 77, 102, 127));
        helms.add(new Armor("Assassin", "helm", new Attributes(45, 0, 0, 63, 45, 0, 0), 77, 102, 127));
//        helms.add(new Model("Rampager", "helm", new Attributes(45, 0, 0, 63, 0, 45, 0), 77, 102, 127));
        //helms.add(new Model("Cavalier", "helm", new Attributes(45, 63, 0, 0, 45, 0, 0), 77, 102, 127));
        //helms.add(new Model("Knight", "helm", new Attributes(45, 63, 0, 45, 0, 0, 0), 77, 102, 127));
//        helms.add(new Model("Nomad", "helm", new Attributes(0, 63, 45, 0, 0, 0, 45), 77, 102, 127));
//        helms.add(new Model("Settler", "helm", new Attributes(0, 63, 0, 0, 0, 45, 45), 77, 102, 127));
//        helms.add(new Model("Sentinel", "helm", new Attributes(45, 45, 63, 0, 0, 0, 0), 77, 102, 127));
//        helms.add(new Model("Shaman", "helm", new Attributes(0, 0, 63, 0, 0, 45, 45), 77, 102, 127));
//        helms.add(new Model("Carrion", "helm", new Attributes(45, 0, 45, 0, 0, 63, 0), 77, 102, 127));
//        helms.add(new Model("Dire", "helm", new Attributes(0, 45, 45, 0, 0, 63, 0), 77, 102, 127));
//        helms.add(new Model("Rabid", "helm", new Attributes(0, 45, 0, 45, 0, 63, 0), 77, 102, 127));
//        helms.add(new Model("Sinister", "helm", new Attributes(45, 0, 0, 45, 0, 63, 0), 77, 102, 127));
//        helms.add(new Model("Apothecary", "helm", new Attributes(0, 45, 0, 0, 0, 45, 63), 77, 102, 127));
        //helms.add(new Model("Cleric", "helm", new Attributes(45, 45, 0, 0, 0, 0, 63), 77, 102, 127));
//        helms.add(new Model("Magi", "helm", new Attributes(0, 0, 45, 45, 0, 0, 63), 77, 102, 127));
        //helms.add(new Model("Celestial", "helm", new Attributes(30, 30, 30, 30, 30, 30, 30), 77, 102, 127));
        //Collections.reverse(helms);
        armorMap.put("helms", helms);
    }

    private void generateShoulders() {
        List<Armor> shoulders = new ArrayList<Armor>();
        // Exotic.
        //shoulders.add(new Model("Berserker", "shoulder", new Attributes(45, 0, 0, 32, 32, 0, 0), 77, 102, 121));
        //shoulders.add(new Model("Soldier", "shoulder", new Attributes(45, 32, 32, 0, 0, 0, 0), 77, 102, 121));
        //shoulders.add(new Model("Valkyrie", "shoulder", new Attributes(45, 0, 32, 0, 32, 0, 0), 77, 102, 121));
        //shoulders.add(new Model("Knight", "shoulder", new Attributes(32, 45, 0, 32, 0, 0, 0), 77, 102, 121));

        // Ascended.
        shoulders.add(new Armor("Berserker", "shoulder", new Attributes(47, 0, 0, 34, 34, 0, 0), 77, 102, 127));
        shoulders.add(new Armor("Soldier", "shoulder", new Attributes(47, 34, 34, 0, 0, 0, 0), 77, 102, 127));
        shoulders.add(new Armor("Valkyrie", "shoulder", new Attributes(47, 0, 34, 0, 34, 0, 0), 77, 102, 127));
//        shoulders.add(new Model("Zealot", "shoulder", new Attributes(47, 0, 0, 34, 0, 0, 34), 77, 102, 127));
        shoulders.add(new Armor("Assassin", "shoulder", new Attributes(34, 0, 0, 47, 34, 0, 0), 77, 102, 127));
//        shoulders.add(new Model("Rampager", "shoulder", new Attributes(34, 0, 0, 47, 0, 34, 0), 77, 102, 127));
        //shoulders.add(new Model("Cavalier", "shoulder", new Attributes(34, 47, 0, 0, 34, 0, 0), 77, 102, 127));
        //shoulders.add(new Model("Knight", "shoulder", new Attributes(34, 47, 0, 34, 0, 0, 0), 77, 102, 127));
//        shoulders.add(new Model("Nomad", "shoulder", new Attributes(0, 47, 34, 0, 0, 0, 34), 77, 102, 127));
//        shoulders.add(new Model("Settler", "shoulder", new Attributes(0, 47, 0, 0, 0, 34, 34), 77, 102, 127));
//        shoulders.add(new Model("Sentinel", "shoulder", new Attributes(34, 34, 47, 0, 0, 0, 0), 77, 102, 127));
//        shoulders.add(new Model("Shaman", "shoulder", new Attributes(0, 0, 47, 0, 0, 34, 34), 77, 102, 127));
//        shoulders.add(new Model("Carrion", "shoulder", new Attributes(34, 0, 34, 0, 0, 47, 0), 77, 102, 127));
//        shoulders.add(new Model("Dire", "shoulder", new Attributes(0, 34, 34, 0, 0, 47, 0), 77, 102, 127));
//        shoulders.add(new Model("Rabid", "shoulder", new Attributes(0, 34, 0, 34, 0, 47, 0), 77, 102, 127));
//        shoulders.add(new Model("Sinister", "shoulder", new Attributes(34, 0, 0, 34, 0, 47, 0), 77, 102, 127));
//        shoulders.add(new Model("Apothecary", "shoulder", new Attributes(0, 34, 0, 0, 0, 34, 47), 77, 102, 127));
        //shoulders.add(new Model("Cleric", "shoulder", new Attributes(34, 34, 0, 0, 0, 0, 47), 77, 102, 127));
//        shoulders.add(new Model("Magi", "shoulder", new Attributes(0, 0, 34, 34, 0, 0, 47), 77, 102, 127));
        //shoulders.add(new Model("Celestial", "shoulder", new Attributes(22, 22, 22, 22, 22, 22, 22), 77, 102, 127));
        //Collections.reverse(shoulders);
        armorMap.put("shoulders", shoulders);
    }

    private void generateCoats() {
        List<Armor> coats = new ArrayList<Armor>();
        // Exotic.
        //coats.add(new Model("Berserker", "coat", new Attributes(134, 0, 0, 96, 96, 0, 0), 330, 355, 363));
        //coats.add(new Model("Soldier", "coat", new Attributes(134, 96, 96, 0, 0, 0, 0), 330, 355, 363));
        //coats.add(new Model("Valkyrie", "coat", new Attributes(134, 0, 96, 0, 96, 0, 0), 330, 355, 363));
        //coats.add(new Model("Knight", "coat", new Attributes(96, 134, 0, 96, 0, 0, 0), 330, 355, 363));

        // Ascended.
        coats.add(new Armor("Berserker", "coat", new Attributes(141, 0, 0, 101, 101, 0, 0), 330, 355, 381));
        coats.add(new Armor("Soldier", "coat", new Attributes(141, 101, 101, 0, 0, 0, 0), 330, 355, 381));
        coats.add(new Armor("Valkyrie", "coat", new Attributes(141, 0, 101, 0, 101, 0, 0), 330, 355, 381));
//        coats.add(new Model("Zealot", "coat", new Attributes(141, 0, 0, 101, 0, 0, 101), 330, 355, 381));
        coats.add(new Armor("Assassin", "coat", new Attributes(101, 0, 0, 141, 101, 0, 0), 330, 355, 381));
//        coats.add(new Model("Rampager", "coat", new Attributes(101, 0, 0, 141, 0, 101, 0), 330, 355, 381));
        //coats.add(new Model("Cavalier", "coat", new Attributes(101, 141, 0, 0, 101, 0, 0), 330, 355, 381));
//        coats.add(new Model("Knight", "coat", new Attributes(101, 141, 0, 101, 0, 0, 0), 330, 355, 381));
//        coats.add(new Model("Nomad", "coat", new Attributes(0, 141, 101, 0, 0, 0, 101), 330, 355, 381));
//        coats.add(new Model("Settler", "coat", new Attributes(0, 141, 0, 0, 0, 101, 101), 330, 355, 381));
//        coats.add(new Model("Sentinel", "coat", new Attributes(101, 101, 141, 0, 0, 0, 0), 330, 355, 381));
//        coats.add(new Model("Shaman", "coat", new Attributes(0, 0, 141, 0, 0, 101, 101), 330, 355, 381));
//        coats.add(new Model("Carrion", "coat", new Attributes(101, 0, 101, 0, 0, 141, 0), 330, 355, 381));
//        coats.add(new Model("Dire", "coat", new Attributes(0, 101, 101, 0, 0, 141, 0), 330, 355, 381));
//        coats.add(new Model("Rabid", "coat", new Attributes(0, 101, 0, 101, 0, 141, 0), 330, 355, 381));
//        coats.add(new Model("Sinister", "coat", new Attributes(101, 0, 0, 101, 0, 141, 0), 330, 355, 381));
//        coats.add(new Model("Apothecary", "coat", new Attributes(0, 101, 0, 0, 0, 101, 141), 330, 355, 381));
//        coats.add(new Model("Cleric", "coat", new Attributes(101, 101, 0, 0, 0, 0, 141), 330, 355, 381));
//        coats.add(new Model("Magi", "coat", new Attributes(0, 0, 101, 101, 0, 0, 141), 330, 355, 381));
//        coats.add(new Model("Celestial", "coat", new Attributes(67, 67, 67, 67, 67, 67, 67), 330, 355, 381));
        //Collections.reverse(coats);
        armorMap.put("coats", coats);
    }

    private void generateGloves() {
        List<Armor> gloves = new ArrayList<Armor>();
        // Exotic.
        //gloves.add(new Model("Berserker", "glove", new Attributes(45, 0, 0, 32, 32, 0, 0), 140, 165, 182));
        //gloves.add(new Model("Soldier", "glove", new Attributes(45, 32, 32, 0, 0, 0, 0), 140, 165, 182));
        //gloves.add(new Model("Valkyrie", "glove", new Attributes(45, 0, 32, 0, 32, 0, 0), 140, 165, 182));
        //gloves.add(new Model("Knight", "glove", new Attributes(32, 45, 0, 32, 0, 0, 0), 140, 165, 182));

        // Ascended.
        gloves.add(new Armor("Berserker", "glove", new Attributes(47, 0, 0, 34, 34, 0, 0), 140, 165, 191));
        gloves.add(new Armor("Soldier", "glove", new Attributes(47, 34, 34, 0, 0, 0, 0), 140, 165, 191));
        gloves.add(new Armor("Valkyrie", "glove", new Attributes(47, 0, 34, 0, 34, 0, 0), 140, 165, 191));
//        gloves.add(new Model("Zealot", "glove", new Attributes(47, 0, 0, 34, 0, 0, 34), 140, 165, 191));
        gloves.add(new Armor("Assassin", "glove", new Attributes(34, 0, 0, 47, 34, 0, 0), 140, 165, 191));
//        gloves.add(new Model("Rampager", "glove", new Attributes(34, 0, 0, 47, 0, 34, 0), 140, 165, 191));
       // gloves.add(new Model("Cavalier", "glove", new Attributes(34, 47, 0, 0, 34, 0, 0), 140, 165, 191));
//        gloves.add(new Model("Knight", "glove", new Attributes(34, 47, 0, 34, 0, 0, 0), 140, 165, 191));
//        gloves.add(new Model("Nomad", "glove", new Attributes(0, 47, 34, 0, 0, 0, 34), 140, 165, 191));
//        gloves.add(new Model("Settler", "glove", new Attributes(0, 47, 0, 0, 0, 34, 34), 140, 165, 191));
//        gloves.add(new Model("Sentinel", "glove", new Attributes(34, 34, 47, 0, 0, 0, 0), 140, 165, 191));
//        gloves.add(new Model("Shaman", "glove", new Attributes(0, 0, 47, 0, 0, 34, 34), 140, 165, 191));
//        gloves.add(new Model("Carrion", "glove", new Attributes(34, 0, 34, 0, 0, 47, 0), 140, 165, 191));
//        gloves.add(new Model("Dire", "glove", new Attributes(0, 34, 34, 0, 0, 47, 0), 140, 165, 191));
//        gloves.add(new Model("Rabid", "glove", new Attributes(0, 34, 0, 34, 0, 47, 0), 140, 165, 191));
//        gloves.add(new Model("Sinister", "glove", new Attributes(34, 0, 0, 34, 0, 47, 0), 140, 165, 191));
//        gloves.add(new Model("Apothecary", "glove", new Attributes(0, 34, 0, 0, 0, 34, 47), 140, 165, 191));
//        gloves.add(new Model("Cleric", "glove", new Attributes(34, 34, 0, 0, 0, 0, 47), 140, 165, 191));
//        gloves.add(new Model("Magi", "glove", new Attributes(0, 0, 34, 34, 0, 0, 47), 140, 165, 191));
//        gloves.add(new Model("Celestial", "glove", new Attributes(22, 22, 22, 22, 22, 22, 22), 140, 165, 191));
        //Collections.reverse(gloves);
        armorMap.put("gloves", gloves);
    }

    private void generateLeggings() {
        List<Armor> leggings = new ArrayList<Armor>();
        // Exotic.
        //leggings.add(new Model("Berserker", "legging", new Attributes(90, 0, 0, 64, 64, 0, 0), 203, 229, 242));
        //leggings.add(new Model("Soldier", "legging", new Attributes(90, 64, 64, 0, 0, 0, 0), 203, 229, 242));
        //leggings.add(new Model("Valkyrie", "legging", new Attributes(90, 0, 64, 0, 64, 0, 0), 203, 229, 242));
        //leggings.add(new Model("Knight", "legging", new Attributes(64, 90, 0, 64, 0, 0, 0), 203, 229, 242));

        // Ascended.
        leggings.add(new Armor("Berserker", "legging", new Attributes(94, 0, 0, 67, 67, 0, 0), 203, 229, 254));
        leggings.add(new Armor("Soldier", "legging", new Attributes(94, 67, 67, 0, 0, 0, 0), 203, 229, 254));
        leggings.add(new Armor("Valkyrie", "legging", new Attributes(94, 0, 67, 0, 67, 0, 0), 203, 229, 254));
//        leggings.add(new Model("Zealot", "legging", new Attributes(94, 0, 0, 67, 0, 0, 67), 203, 229, 254));
        leggings.add(new Armor("Assassin", "legging", new Attributes(67, 0, 0, 94, 67, 0, 0), 203, 229, 254));
//        leggings.add(new Model("Rampager", "legging", new Attributes(67, 0, 0, 94, 0, 67, 0), 203, 229, 254));
        //leggings.add(new Model("Cavalier", "legging", new Attributes(67, 94, 0, 0, 67, 0, 0), 203, 229, 254));
//        leggings.add(new Model("Knight", "legging", new Attributes(67, 94, 0, 67, 0, 0, 0), 203, 229, 254));
//        leggings.add(new Model("Nomad", "legging", new Attributes(0, 94, 67, 0, 0, 0, 67), 203, 229, 254));
//        leggings.add(new Model("Settler", "legging", new Attributes(0, 94, 0, 0, 0, 67, 67), 203, 229, 254));
        //leggings.add(new Model("Sentinel", "legging", new Attributes(67, 67, 94, 0, 0, 0, 0), 203, 229, 254));
//        leggings.add(new Model("Shaman", "legging", new Attributes(0, 0, 94, 0, 0, 67, 67), 203, 229, 254));
//        leggings.add(new Model("Carrion", "legging", new Attributes(67, 0, 67, 0, 0, 94, 0), 203, 229, 254));
//        leggings.add(new Model("Dire", "legging", new Attributes(0, 67, 67, 0, 0, 94, 0), 203, 229, 254));
//        leggings.add(new Model("Rabid", "legging", new Attributes(0, 67, 0, 67, 0, 94, 0), 203, 229, 254));
//        leggings.add(new Model("Sinister", "legging", new Attributes(67, 0, 0, 67, 0, 94, 0), 203, 229, 254));
//        leggings.add(new Model("Apothecary", "legging", new Attributes(0, 67, 0, 0, 0, 67, 94), 203, 229, 254));
//        leggings.add(new Model("Cleric", "legging", new Attributes(67, 67, 0, 0, 0, 0, 94), 203, 229, 254));
//        leggings.add(new Model("Magi", "legging", new Attributes(0, 0, 67, 67, 0, 0, 94), 203, 229, 254));
//        leggings.add(new Model("Celestial", "legging", new Attributes(44, 44, 44, 44, 44, 44, 44), 203, 229, 254));
        //Collections.reverse(leggings);
        armorMap.put("leggings", leggings);
    }

    private void generateBoots() {
        List<Armor> boots = new ArrayList<Armor>();
        //Exotic.
        //boots.add(new Model("Berserker", "boot", new Attributes(45, 0, 0, 32, 32, 0, 0), 140, 165, 182));
        //boots.add(new Model("Soldier", "boot", new Attributes(45, 32, 32, 0, 0, 0, 0), 140, 165, 182));
        //boots.add(new Model("Valkyrie", "boot", new Attributes(45, 0, 32, 0, 32, 0, 0), 140, 165, 182));
        //boots.add(new Model("Knight", "boot", new Attributes(32, 45, 0, 32, 0, 0, 0), 140, 165, 182));

        //Ascended.
        boots.add(new Armor("Berserker", "boot", new Attributes(47, 0, 0, 34, 34, 0, 0), 140, 165, 191));
        boots.add(new Armor("Soldier", "boot", new Attributes(47, 34, 34, 0, 0, 0, 0), 140, 165, 191));
        boots.add(new Armor("Valkyrie", "boot", new Attributes(47, 0, 34, 0, 34, 0, 0), 140, 165, 191));
//        boots.add(new Model("Zealot", "boot", new Attributes(47, 0, 0, 34, 0, 0, 34), 140, 165, 191));
        boots.add(new Armor("Assassin", "boot", new Attributes(34, 0, 0, 47, 34, 0, 0), 140, 165, 191));
//        boots.add(new Model("Rampager", "boot", new Attributes(34, 0, 0, 47, 0, 34, 0), 140, 165, 191));
        //boots.add(new Model("Cavalier", "boot", new Attributes(34, 47, 0, 0, 34, 0, 0), 140, 165, 191));
//        boots.add(new Model("Knight", "boot", new Attributes(34, 47, 0, 34, 0, 0, 0), 140, 165, 191));
//        boots.add(new Model("Nomad", "boot", new Attributes(0, 47, 34, 0, 0, 0, 34), 140, 165, 191));
//        boots.add(new Model("Settler", "boot", new Attributes(0, 47, 0, 0, 0, 34, 34), 140, 165, 191));
        //boots.add(new Model("Sentinel", "boot", new Attributes(34, 34, 47, 0, 0, 0, 0), 140, 165, 191));
//        boots.add(new Model("Shaman", "boot", new Attributes(0, 0, 47, 0, 0, 34, 34), 140, 165, 191));
//        boots.add(new Model("Carrion", "boot", new Attributes(34, 0, 34, 0, 0, 47, 0), 140, 165, 191));
//        boots.add(new Model("Dire", "boot", new Attributes(0, 34, 34, 0, 0, 47, 0), 140, 165, 191));
//        boots.add(new Model("Rabid", "boot", new Attributes(0, 34, 0, 34, 0, 47, 0), 140, 165, 191));
//        boots.add(new Model("Sinister", "boot", new Attributes(34, 0, 0, 34, 0, 47, 0), 140, 165, 191));
//        boots.add(new Model("Apothecary", "boot", new Attributes(0, 34, 0, 0, 0, 34, 47), 140, 165, 191));
//        boots.add(new Model("Cleric", "boot", new Attributes(34, 34, 0, 0, 0, 0, 47), 140, 165, 191));
//        boots.add(new Model("Magi", "boot", new Attributes(0, 0, 34, 34, 0, 0, 47), 140, 165, 191));
//        boots.add(new Model("Celestial", "boot", new Attributes(22, 22, 22, 22, 22, 22, 22), 140, 165, 191));
        //Collections.reverse(boots);
        armorMap.put("boots", boots);
    }

    private void generateAmulets() {
        List<Accessory> accessories = new ArrayList<>();
        accessories.add(new Accessory("Berserker","amulet", new Attributes(157, 0, 0, 108, 108, 0, 0)));
        accessories.add(new Accessory("Berserker+Valkyrie","amulet", new Attributes(157, 0, 18, 90, 108, 0, 0)));
        accessories.add(new Accessory("Soldier","amulet", new Attributes(157, 108, 108, 0, 0, 0, 0)));
        //accessories.add(new Accessory("Zealot","amulet", new Attributes(157, 0, 0, 108, 0, 0, 108)));
        accessories.add(new Accessory("Captain","amulet", new Attributes(108, 108, 0, 157, 0, 0, 0)));
        //accessories.add(new Accessory("Rampager","amulet", new Attributes(108, 0, 0, 157, 0, 108, 0)));
        //accessories.add(new Accessory("Cavalier","amulet", new Attributes(108, 157, 0, 0, 108, 0, 0)));
        //accessories.add(new Accessory("Knight","amulet", new Attributes(108, 157, 0, 108, 0, 0, 0)));
        //accessories.add(new Accessory("Nomad","amulet", new Attributes(0, 157, 108, 0, 0, 0, 108)));
        //accessories.add(new Accessory("Dire+Rabid","amulet", new Attributes(0, 108, 90, 18, 0, 157, 0)));
        //accessories.add(new Accessory("Rabid","amulet", new Attributes(0, 108, 0, 108, 0, 157, 0)));
        //accessories.add(new Accessory("Rabid+Apothecary","amulet", new Attributes(0, 108, 0, 90, 0, 143, 32)));
        //accessories.add(new Accessory("Sinister","amulet", new Attributes(108, 0, 0, 108, 0, 157, 0)));
        //accessories.add(new Accessory("Apothecary","amulet", new Attributes(0, 108, 0, 0, 0, 108, 157)));
        //accessories.add(new Accessory("Cleric","amulet", new Attributes(108, 108, 0, 0, 0, 0, 157)));
        //accessories.add(new Accessory("Celestial","amulet", new Attributes(72, 72, 72, 72, 72, 72, 72)));
        accessoryMap.put("amulets", accessories);
    }

    private void generateRings() {
        List<Accessory> accessories = new ArrayList<>();
        accessories.add(new Accessory("Berserker","ring", new Attributes(126, 0, 0, 85, 85, 0, 0)));
        accessories.add(new Accessory("Berserker+Valkyrie","ring", new Attributes(126, 0, 18, 67, 85, 0, 0)));
        accessories.add(new Accessory("Soldier","ring", new Attributes(126, 85, 85, 0, 0, 0, 0)));
        //accessories.add(new Accessory("Zealot","ring", new Attributes(126, 0, 0, 85, 0, 0, 85)));
        accessories.add(new Accessory("Captain","ring", new Attributes(85, 85, 0, 126, 0, 0, 0)));
        //accessories.add(new Accessory("Rampager","ring", new Attributes(85, 0, 0, 126, 0, 85, 0)));
        //accessories.add(new Accessory("Cavalier","ring", new Attributes(85, 126, 0, 0, 85, 0, 0)));
        //accessories.add(new Accessory("Knight","ring", new Attributes(85, 126, 0, 85, 0, 0, 0)));
        //accessories.add(new Accessory("Nomad","ring", new Attributes(0, 126, 85, 0, 0, 0, 85)));
        //accessories.add(new Accessory("Dire+Rabid","ring", new Attributes(0, 85, 67, 18, 0, 126, 0)));
        //accessories.add(new Accessory("Rabid","ring", new Attributes(0, 85, 0, 85, 0, 126, 0)));
        //accessories.add(new Accessory("Rabid+Apothecary","ring", new Attributes(0, 85, 0, 67, 0, 112, 32)));
        //accessories.add(new Accessory("Sinister","ring", new Attributes(85, 0, 0, 85, 0, 126, 0)));
        //accessories.add(new Accessory("Apothecary","ring", new Attributes(0, 85, 0, 0, 0, 85, 126)));
        //accessories.add(new Accessory("Cleric","ring", new Attributes(85, 85, 0, 0, 0, 0, 126)));
        //accessories.add(new Accessory("Celestial","ring", new Attributes(57, 57, 57, 57, 57, 57, 57)));
        accessoryMap.put("rings", accessories);
    }

    private void generateEarrings() {
        List<Accessory> accessories = new ArrayList<>();
        accessories.add(new Accessory("Berserker","earring", new Attributes(110, 0, 0, 74, 74, 0, 0)));
        accessories.add(new Accessory("Berserker+Valkyrie","earring", new Attributes(110, 0, 18, 56, 74, 0, 0)));
        accessories.add(new Accessory("Soldier","earring", new Attributes(110, 74, 74, 0, 0, 0, 0)));
        //accessories.add(new Accessory("Zealot","earring", new Attributes(110, 0, 0, 74, 0, 0, 74)));
        accessories.add(new Accessory("Assassin","earring", new Attributes(74, 0, 0, 110, 74, 0, 0)));
        accessories.add(new Accessory("Captain","earring", new Attributes(74, 74, 0, 110, 0, 0, 0)));
        //accessories.add(new Accessory("Rampager","earring", new Attributes(74, 0, 0, 110, 0, 74, 0)));
        //accessories.add(new Accessory("Cavalier","earring", new Attributes(74, 110, 0, 0, 74, 0, 0)));
        //accessories.add(new Accessory("Knight","earring", new Attributes(74, 110, 0, 74, 0, 0, 0)));
        //accessories.add(new Accessory("Nomad","earring", new Attributes(0, 110, 74, 0, 0, 0, 74)));
        //accessories.add(new Accessory("Sentinel","earring", new Attributes(74, 74, 110, 0, 0, 0, 0)));
        //accessories.add(new Accessory("Dire+Rabid","earring", new Attributes(0, 74, 56, 18, 0, 110, 0)));
        //accessories.add(new Accessory("Carrion","earring", new Attributes(74, 0, 74, 0, 0, 110, 0)));
        //accessories.add(new Accessory("Rabid","earring", new Attributes(0, 74, 0, 74, 0, 110, 0)));
        //accessories.add(new Accessory("Rabid+Apothecary","earring", new Attributes(0, 74, 0, 56, 0, 96, 32)));
        //accessories.add(new Accessory("Sinister","earring", new Attributes(74, 0, 0, 74, 0, 110, 0)));
        //accessories.add(new Accessory("Apothecary","earring", new Attributes(0, 74, 0, 0, 0, 74, 110)));
        //accessories.add(new Accessory("Cleric","earring", new Attributes(74, 74, 0, 0, 0, 0, 110)));
        //accessories.add(new Accessory("Magi","earring", new Attributes(0, 0, 74, 74, 0, 0, 110)));
        //accessories.add(new Accessory("Celestial","earring", new Attributes(50, 50, 50, 50, 50, 50, 50)));
        accessoryMap.put("earrings", accessories);
    }

    private void generateBackpieces() {
        List<Accessory> accessories = new ArrayList<>();
        accessories.add(new Accessory("Berserker","back", new Attributes(63, 0, 0, 40, 40, 0, 0)));
        accessories.add(new Accessory("Berserker+Valkyrie","back", new Attributes(63, 0, 18, 22, 40, 0, 0)));
        accessories.add(new Accessory("Soldier","back", new Attributes(63, 40, 40, 0, 0, 0, 0)));
        accessories.add(new Accessory("Valkyrie","back", new Attributes(63, 0, 40, 0, 40, 0, 0)));
        //accessories.add(new Accessory("Captain","back", new Attributes(40, 40, 0, 63, 0, 0, 0)));
        //accessories.add(new Accessory("Rampager","back", new Attributes(40, 0, 0, 63, 0, 40, 0)));
        //accessories.add(new Accessory("Cavalier","back", new Attributes(40, 63, 0, 0, 40, 0, 0)));
        //accessories.add(new Accessory("Knight","back", new Attributes(40, 63, 0, 40, 0, 0, 0)));
        //accessories.add(new Accessory("Dire+Rabid","back", new Attributes(0, 40, 22, 18, 0, 63, 0)));
        //accessories.add(new Accessory("Rabid","back", new Attributes(0, 40, 0, 40, 0, 63, 0)));
        //accessories.add(new Accessory("Rabid+Apothecary","back", new Attributes(0, 40, 0, 22, 0, 49, 32)));
        //accessories.add(new Accessory("Apothecary","back", new Attributes(0, 40, 0, 0, 0, 40, 63)));
        //accessories.add(new Accessory("Cleric","back", new Attributes(40, 40, 0, 0, 0, 0, 63)));
        //accessories.add(new Accessory("Celestial","back", new Attributes(28, 28, 28, 28, 28, 28, 28)));
        accessoryMap.put("backpieces", accessories);
    }

    private void generateWeapons() {
        List<Weapon> staffs = new ArrayList<>();
        // Exotic.
        //staffs.add(new Weapon("Berserker", "staff", new Attributes(239, 0, 0, 171, 171, 0, 0)));
        //staffs.add(new Weapon("Soldier", "staff", new Attributes(239, 171, 171, 0, 0, 0, 0)));
        //staffs.add(new Weapon("Valkyrie", "staff", new Attributes(239, 0, 171, 0, 171, 0, 0)));
        //staffs.add(new Weapon("Knight", "staff", new Attributes(171, 239, 0, 171, 0, 0, 0)));
        // Ascended.

        staffs.add(new Weapon("Berserker", "staff", new Attributes(251, 0, 0, 179, 179, 0, 0)));
        staffs.add(new Weapon("Soldier", "staff", new Attributes(251, 179, 179, 0, 0, 0, 0)));
        staffs.add(new Weapon("Valkyrie", "staff", new Attributes(251, 0, 179, 0, 179, 0, 0)));
        //staffs.add(new Weapon("Zealot", "staff", new Attributes(251, 0, 0, 179, 0, 0, 179)));
        //staffs.add(new Weapon("Assassin", "staff", new Attributes(179, 0, 0, 251, 179, 0, 0)));
        //staffs.add(new Weapon("Rampager", "staff", new Attributes(179, 0, 0, 251, 0, 179, 0)));
        //staffs.add(new Weapon("Cavalier", "staff", new Attributes(179, 251, 0, 0, 179, 0, 0)));
        //staffs.add(new Weapon("Knight", "staff", new Attributes(179, 251, 0, 179, 0, 0, 0)));
        //staffs.add(new Weapon("Nomad", "staff", new Attributes(0, 251, 179, 0, 0, 0, 179)));
        //staffs.add(new Weapon("Settler", "staff", new Attributes(0, 251, 0, 0, 0, 179, 179)));
        //staffs.add(new Weapon("Sentinel", "staff", new Attributes(179, 179, 251, 0, 0, 0, 0)));
        //staffs.add(new Weapon("Shaman", "staff", new Attributes(0, 0, 251, 0, 0, 179, 179)));
        //staffs.add(new Weapon("Carrion", "staff", new Attributes(179, 0, 179, 0, 0, 251, 0)));
        //staffs.add(new Weapon("Dire", "staff", new Attributes(0, 179, 179, 0, 0, 251, 0)));
        //staffs.add(new Weapon("Giver", "staff", new Attributes(0, 0, 179, 179, 0, 0, 0)));
        //staffs.add(new Weapon("Rabid", "staff", new Attributes(0, 179, 0, 179, 0, 251, 0)));
        //staffs.add(new Weapon("Sinister", "staff", new Attributes(179, 0, 0, 179, 0, 251, 0)));
        //staffs.add(new Weapon("Apothecary", "staff", new Attributes(0, 179, 0, 0, 0, 179, 251)));
        //staffs.add(new Weapon("Cleric", "staff", new Attributes(179, 179, 0, 0, 0, 0, 251)));
        //staffs.add(new Weapon("Magi", "staff", new Attributes(0, 0, 179, 179, 0, 0, 251)));
        //staffs.add(new Weapon("Celestial", "staff", new Attributes(118, 118, 118, 118, 118, 118, 118)));
        weaponMap.put("staffs", staffs);
    }

    private void generateProfessions() {
        professionMap.put("elementalist",  new Profession("elementalist", "light", new Attributes(1000, 1000, 1000, 1000, 0, 0, 0), 11645));
        professionMap.put("thief",  new Profession("thief", "medium", new Attributes(1000, 1000, 1000, 1000, 0, 0, 0), 11645));
        professionMap.put("guardian",  new Profession("guardian", "heavy", new Attributes(1000, 1000, 1000, 1000, 0, 0, 0), 11645));

        professionMap.put("engineer",  new Profession("engineer", "medium", new Attributes(1000, 1000, 1000, 1000, 0, 0, 0), 15922));
        professionMap.put("ranger",  new Profession("ranger", "medium", new Attributes(1000, 1000, 1000, 1000, 0, 0, 0), 15922));
        professionMap.put("mesmer",  new Profession("mesmer", "light", new Attributes(1000, 1000, 1000, 1000, 0, 0, 0), 15922));
        professionMap.put("revenant",  new Profession("revenant", "heavy", new Attributes(1000, 1000, 1000, 1000, 0, 0, 0), 15922));

        professionMap.put("warrior",  new Profession("warrior", "heavy", new Attributes(1000, 1000, 1000, 1000, 0, 0, 0), 19212));
        professionMap.put("necromancer",  new Profession("necromancer", "light", new Attributes(1000, 1000, 1000, 1000, 0, 0, 0), 19212));
    }

    public DataGenerator() {
        generateAmulets();
        generateBackpieces();
        generateBoots();
        generateCoats();
        generateEarrings();
        generateGloves();
        generateHelms();;
        generateLeggings();
        generateProfessions();
        generateRings();
        generateShoulders();
        generateWeapons();
    }

    public Map<String, List<Armor>> getArmorMap() {
        return armorMap;
    }

    public Map<String, List<Accessory>> getAccessoryMap() {
        return accessoryMap;
    }

    public Map<String, List<Weapon>> getWeaponMap() {
        return weaponMap;
    }

    public Map<String, Profession> getProfessionMap() {
        return professionMap;
    }
}
