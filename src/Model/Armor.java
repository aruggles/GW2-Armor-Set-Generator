package Model;

/**
 * Created by Adam on 8/15/2015.
 */
public class Armor {
    private String name;
    private String type;
    private Attributes attributes;
    private int heavyDefense;
    private int lightDefense;
    private int mediumDefense;

    public Armor() { }

    public Armor(String name, String type, Attributes attributes,
                 int lightDefense, int mediumDefense, int heavyDefense) {
        this.name = name;
        this.type = type;
        this.attributes = attributes;
        this.heavyDefense = heavyDefense;
        this.lightDefense = lightDefense;
        this.mediumDefense = mediumDefense;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Attributes getAttributes() {
        return attributes;
    }

    public void setAttributes(Attributes attributes) {
        this.attributes = attributes;
    }

    public int getHeavyDefense() {
        return heavyDefense;
    }

    public void setHeavyDefense(int heavyDefense) {
        this.heavyDefense = heavyDefense;
    }

    public int getLightDefense() {
        return lightDefense;
    }

    public void setLightDefense(int lightDefense) {
        this.lightDefense = lightDefense;
    }

    public int getMediumDefense() {
        return mediumDefense;
    }

    public void setMediumDefense(int mediumDefense) {
        this.mediumDefense = mediumDefense;
    }
}
