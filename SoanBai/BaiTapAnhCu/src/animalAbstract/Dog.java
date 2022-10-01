package animalAbstract;

import interfaceEx.Barkable;
import interfaceEx.Runnable;

public class Dog extends Animal implements Runnable, Barkable {
    public Dog() {
    }
    public Dog(String color) {
        super(color);
    }
    @Override
    public String eat() {
        return "an ngoam ngoam";
    }

    @Override
    public String run() {
        return "Chay nhanh";
    }


    @Override
    public void bark() {
        System.out.println(" Cho co the sua");
    }
}
