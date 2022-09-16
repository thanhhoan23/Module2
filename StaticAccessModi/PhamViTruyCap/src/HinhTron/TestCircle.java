package HinhTron;

public class TestCircle {
    public static void main(String[] args) {
        Circle cr = new Circle();
        Circle cr2 = new Circle(2);
        System.out.println(cr.getRadius());
        System.out.println( cr.getArea());

        System.out.println(cr2.getRadius());
        System.out.println(cr2.getArea());

    }
}
