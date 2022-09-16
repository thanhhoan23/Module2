package Property;

public class Car {
    private String name;
    private int price;
    private String color;

    private static int quantity = 10;

    Car (String n, int p, String c) {
        this.name = n;
        this.price = p;
        this.color = c;
    }

    static void repl () {
        quantity = 20;
    }
    void dis () {
        System.out.println(name + price + color);
    }
}
