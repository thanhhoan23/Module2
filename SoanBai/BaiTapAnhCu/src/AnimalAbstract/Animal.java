package AnimalAbstract;

public abstract class Animal {
    private String color = "Black";

    public Animal() {}

    public Animal(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract String howToEat();
}
