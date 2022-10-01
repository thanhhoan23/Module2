package main;

import animalAbstract.Animal;
import animalAbstract.Dog;
import interfaceEx.Barkable;
import interfaceEx.Flyable;
import interfaceEx.Runnable;
import machine.Airline;

public class MainTest {
    public static void main(String[] args) {
//        Flyable này là interface của lớp bird và lớp Arline
        Flyable f = new Airline();
        System.out.println(f.fly());

//        Animal này là abstract của lớp dog, bird, fish

        Animal a = new Dog();
        System.out.println("Dog này là màu mac định : " + a.getColor());

        Animal c = new Dog();
        System.out.println("DOG " + c.eat());

        Barkable d = new Dog();
        d.bark();

        Animal b = new Dog("yellow");
        System.out.println("Dog has a " + b.getColor() + "color");

//        lớp run này là lớp interface
        Runnable a1 = new Dog();
        System.out.println("Con chó " + a1.run());
    }
}
