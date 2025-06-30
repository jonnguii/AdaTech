package Animals;

public abstract class Animal {

    protected String name;
    protected String color;
    protected int height;
    protected int weight;
    protected String stateOfMind;

    public Animal(String name, String color, double weight, int height) {
        this.name = name;
        this.color = color;
        this.weight = (int) weight;
        this.height = height;
        this.stateOfMind = stateOfMind;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getStateOfMind() {
        return stateOfMind;
    }

    public void setStateOfMind(String stateOfMind) {
        this.stateOfMind = stateOfMind;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void comer() {

    }
    public void dormir() {

    }
    public abstract void soar();
}

