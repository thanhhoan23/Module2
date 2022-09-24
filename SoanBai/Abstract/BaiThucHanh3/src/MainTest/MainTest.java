package MainTest;

import Interface.Colorable;
import Type.Rectangle;
import Type.Shape;
import Type.Square;

public class MainTest {
    public static void main(String[] args) {
        Colorable h1 = new Square(2);
        System.out.println(h1.HowToColor());

        Rectangle h2 = new Square(5);
//        h2.setLength();
        System.out.println(h2.getArea());
//        System.out.println(h1.);

    }
}
