package BaiTap1;

import java.util.Comparator;

public class Product implements Comparable<Product> {
    private String name;
    private int price;
    private int quantity;

    public Product () {};

    public Product(String name, int price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }

    @Override
    public int compareTo(Product o) {
        return quantity - o.quantity;
    }

//    @Override
//    public int compare(Product o1, Product o2) {
//        if (o1.getPrice()> o2.getPrice()) {
//            return 1;
//        } else if (o1.getPrice() == o2.getPrice()) {
//            return 0;
//        } else {
//            return -1;
//        }
//    }
}
