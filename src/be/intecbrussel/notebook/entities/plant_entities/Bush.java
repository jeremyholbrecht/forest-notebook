package be.intecbrussel.notebook.entities.plant_entities;

public class Bush extends Plant {

    private String fruit;
    private LeafType leafType;


    public Bush(String name) {
        super(name);
    }

    public Bush(double height) {
        super(height);
    }

    public String getFruit() {
        return fruit;
    }

    public void setFruit(String fruit) {
        this.fruit = fruit;
    }

    public LeafType getLeafType() {
        return leafType;
    }

    public void setLeafType(LeafType leafType) {
        this.leafType = leafType;
    }

    @Override
    public String toString() {
        return getName() + "Bush{" +
                "fruit='" + fruit + '\'' +
                ", leafType=" + leafType +
                '}';
    }
}
