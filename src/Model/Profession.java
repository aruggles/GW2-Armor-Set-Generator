package Model;

import Model.*;

/**
 * Created by Adam on 8/15/2015.
 */
public class Profession {
    private String name;
    private String armorType;
    private int health;
    private Attributes attributes;

    public Profession() { }

    public Profession(String name, String armorType, Attributes attributes, int health) {
        this.name = name;
        this.armorType = armorType;
        this.health = health;
        this.attributes = attributes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArmorType() {
        return armorType;
    }

    public void setArmorType(String armorType) {
        this.armorType = armorType;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public Attributes getAttributes() {
        return attributes;
    }

    public void setAttributes(Attributes attributes) {
        this.attributes = attributes;
    }
}
