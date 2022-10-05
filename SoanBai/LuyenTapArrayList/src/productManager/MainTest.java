package productManager;

import java.util.ArrayList;
import java.util.Comparator;

public class MainTest {
    public static void main(String[] args) {
//        cách 1:
//        Product P1 = new Product(1, "ip1", 1300, 5);

//        Cách2:
//        Product P2 = new Product();
//        P2.setIdProduct(2);

//        Cách3: định nghĩa constructor cần thiết
//        Product p3 = new Product(3, "ip3", 3500, 5);

//        cách4:
//        Product p4 = new Product();
//        p4.set

        Product p1 = new Product(1, "ip1", 1300, 5, "Sản phẩm có màu xanh", "sản phẩm thân thiện với môi trường","sản phẩm");
        Product p4 = new Product(1, "ip1", 1000, 5, "Sản phẩm có màu xanh", "sản phẩm thân thiện với môi trường","sản phẩm");
        Product p2 = new Product(2, "aip5 nhgfvv", 4300, 5, "Sản phẩm", "hi", "bye");
        Product p3 = new Product(3, "ip3", 5300, 3);

        ArrayList<Product> list = new ArrayList<>();
        list.add(p1);
        list.add(p2);
        list.add(p3);
        list.add(p4);

        Order order = new Order();
        order.setListProduct(list);
        Comparator<Product> myComparator = new ComparatorImpl();
        order.arrangeProduct();
        System.out.println(order);
//        order.setIdOrder(3);
//        System.out.println(order);

//        System.out.println( order.searchProductByName("ip1"));
//        System.out.println("Vị trí: " + order.searchProductByName("hi"));
//        System.out.println(order.searchProductByName("ip5"));
//        System.out.println(order.searchProductByName("ip9"));
//        System.out.println(order.searchProduct("ip9", "hi"));

        System.out.println(order.search("ip5"));
        System.out.println(order.search("ip10"));

//        order.searchProductByName("ip5");
//        order.searchProduct("ip9", "đẹp");


    }
}
