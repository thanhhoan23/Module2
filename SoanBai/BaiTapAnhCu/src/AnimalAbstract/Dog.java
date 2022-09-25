package AnimalAbstract;

import Interface.Run;

public class Dog extends Animal implements Run{
    public Dog() {
    }
    public Dog(String color) {
        super(color);
    }
    @Override
    public String howToEat() {
        return "an ngoam ngoam";
    }
    public String barkable() {
        return "Co the sua";
    }
    @Override
    public String runable() {
        return "Chay nhanh";
    }



}
