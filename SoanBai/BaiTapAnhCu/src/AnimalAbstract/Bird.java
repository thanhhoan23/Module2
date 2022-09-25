package AnimalAbstract;

import Interface.Flyable;

public class Bird extends Animal implements Flyable {

    public Bird() {
    }
    public Bird(String color) {
        super(color);
    }
    @Override
    public String howToEat() {
        return "Mo";
    }

    @Override
    public String flyable() {
        return "Chim thi bay duoc ma";
    }
}
