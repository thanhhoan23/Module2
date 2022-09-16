package Property;

public class MainCar {
    public static void main(String[] args) {
        Car.repl();
        Car car = new Car("Mazda", 10000, "white");
        Car car1 = new Car("Mazda", 10000, "white");
        Car car2 = new Car("Mazda", 10000, "white");

       car1.dis();
       car2.dis();

    }
}
