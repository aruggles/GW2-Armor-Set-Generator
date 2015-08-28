package Model;

/**
 * Created by Adam on 8/15/2015.
 */
public class Attributes {
    private int power = 0;
    private int toughness = 0;
    private int vitality = 0;
    private int precision = 0;
    private int ferocity = 0;
    private int conditionDmg = 0;
    private int healingPwr = 0;

    public Attributes() {

    }

    @Override
    public String toString() {
        return "Attributes {" +
                "power=" + power +
                ", toughness=" + toughness +
                ", vitality=" + vitality +
                ", precision=" + precision +
                ", ferocity=" + ferocity +
                ", conditionDmg=" + conditionDmg +
                ", healingPwr=" + healingPwr +
                '}';
    }

    public Attributes(int power, int toughness, int vitality, int precision, int ferocity, int conditionDmg, int healingPwr) {
        this.power = power;
        this.toughness = toughness;
        this.vitality = vitality;
        this.precision = precision;
        this.ferocity = ferocity;
        this.conditionDmg = conditionDmg;
        this.healingPwr = healingPwr;
    }

    public int getHealingPwr() {
        return healingPwr;
    }

    public void setHealingPwr(int healingPwr) {
        this.healingPwr = healingPwr;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getToughness() {
        return toughness;
    }

    public void setToughness(int toughness) {
        this.toughness = toughness;
    }

    public int getVitality() {
        return vitality;
    }

    public void setVitality(int vitality) {
        this.vitality = vitality;
    }

    public int getPrecision() {
        return precision;
    }

    public void setPrecision(int precision) {
        this.precision = precision;
    }

    public int getFerocity() {
        return ferocity;
    }

    public void setFerocity(int ferocity) {
        this.ferocity = ferocity;
    }

    public int getConditionDmg() {
        return conditionDmg;
    }

    public void setConditionDmg(int conditionDmg) {
        this.conditionDmg = conditionDmg;
    }
}
