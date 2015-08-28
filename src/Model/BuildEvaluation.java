package Model;

import Model.Attributes;

/**
 * Created by adam on 8/17/15.
 */
public class BuildEvaluation {
    private double effectivePower;
    private double criticalDamage;
    private double criticalChance;
    private int defense;
    private int health;
    private int armor;
    private float heuristic;
    private Attributes attributes;

    public float getHeuristic() {
        return heuristic;
    }

    public void setHeuristic(float heuristic) {
        this.heuristic = heuristic;
    }

    public double getEffectivePower() {
        return effectivePower;
    }

    public void setEffectivePower(double effectivePower) {
        this.effectivePower = effectivePower;
    }

    public double getCriticalDamage() {
        return criticalDamage;
    }

    public void setCriticalDamage(double criticalDamage) {
        this.criticalDamage = criticalDamage;
    }

    public double getCriticalChance() {
        return criticalChance;
    }

    public void setCriticalChance(double criticalChance) {
        this.criticalChance = criticalChance;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public Attributes getAttributes() {
        return attributes;
    }

    public void setAttributes(Attributes attributes) {
        this.attributes = attributes;
    }

    public float getEvaluatedHeath(int value) {
        float h = (float) this.health;
        if (h < value) {
            return h / value;
        }
        return 1.0f;
    }

    public float getEvaluatedArmor(int value) {
        float a = (float) this.armor;
        if (a < value) {
            return a / value;
        }
        return 1.0f;
    }

    public float getEvaluatedHealingPower(int value) {
        float h = (float) this.attributes.getHealingPwr();
        if (h < value) {
            return h / value;
        }
        return 1.0f;
    }
}
