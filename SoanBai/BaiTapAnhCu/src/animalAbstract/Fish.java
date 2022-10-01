package animalAbstract;

import interfaceEx.Swimable;

public class Fish extends Animal implements Swimable {
    public Fish() {
    }
    public Fish(String color) {
        super(color);
    }
    @Override
    public String eat() {
        return "An gi biet dau";
    }

    @Override
    public void swim() {
        System.out.println("Ca co the boi");
    }
}
