package productOrder;

import java.util.ArrayList;

public class MainTest {
    public static void main(String[] args) {
        Product p1 = new Product(1,"ip10", 23000, 5, "Xinh", "dep qua");
        Product p2 = new Product(2,"ip13", 43000, 5, "xau", "dep qua");
        Product p3 = new Product(3,"ip5", 25000, 5, "qua xinh", "dep qua");
        Product p4 = new Product(4,"ip15", 3000, 5, "chan ghe", "dep qua");
        ArrayList<Product> list = new ArrayList<>();
        list.add(p1);
        list.add(p2);
        list.add(p3);
        list.add(p4);

        Order order = new Order();
        order.setLisProduct(list);


    }
}
