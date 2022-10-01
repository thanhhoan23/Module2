package animalAbstract;

import interfaceEx.Flyable;

public class Bird extends Animal implements Flyable {

    public Bird() {
    }
    public Bird(String color) {
        super(color);
    }
    @Override
    public String eat() {
        return "Mo";
    }

    @Override
    public String fly() {
        return "Chim thi bay duoc ma";
    }
}
