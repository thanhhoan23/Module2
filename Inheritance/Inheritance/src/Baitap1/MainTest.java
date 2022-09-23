package Baitap2;

public class MainTest {
    public static void main(String[] args) {
        Circle a = new Circle();
        System.out.println(a);
        Circle A2 = new Circle(3,"red",5);
        System.out.println(A2);

        Cylinder B2 = new Cylinder();
        System.out.println(B2);
        Cylinder B4 = new Cylinder(3,5,6,"yellow",9);
        System.out.println(B4);
    }
}
