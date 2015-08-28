package Model;


/**
 * Created by Adam on 8/15/2015.
 */
public class Accessory {
    private String name;
    private String type;
    private Attributes attributes;

    public Accessory() { }

    public Accessory(String name, String type, Attributes attributes) {
        this.name = name;
        this.type = type;
        this.attributes = attributes;
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
}
