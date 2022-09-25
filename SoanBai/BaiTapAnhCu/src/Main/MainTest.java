package Main;

import AnimalAbstract.Animal;
import AnimalAbstract.Dog;
import Interface.Flyable;
import Interface.Run;
import Machine.Airline;

public class MainTest {
    public static void main(String[] args) {
//        Flyable này là interface của lớp bird và lớp Arline
        Flyable f = new Airline();
        System.out.println(f.flyable());

//        Animal này là abstract của lớp dog, bird, fish

        Animal a = new Dog();
        System.out.println("Dog này là màu mac định : " + a.getColor());

        Animal c = new Dog();
        System.out.println("DOG " + c.howToEat());

        Animal b = new Dog("yellow");
        System.out.println("Dog has a " + b.getColor() + "color");

//        lớp run này là lớp interface
        Run a1 = new Dog();
        System.out.println("Con chó" + a1.runable());
    }
}
