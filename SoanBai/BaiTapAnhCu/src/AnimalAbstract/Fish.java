package AnimalAbstract;

public class Fish extends Animal{
    public Fish() {
    }
    public Fish(String color) {
        super(color);
    }
    @Override
    public String howToEat() {
        return "An gi biet dau";
    }
    public String swimable() {
        return "Co the boi";
    }
}
