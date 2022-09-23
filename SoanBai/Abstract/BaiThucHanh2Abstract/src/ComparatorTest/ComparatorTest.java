package ComparatorTest;

import CircleComparator.CircleComparator;
import Type.Circle;

import java.util.Arrays;
import java.util.Comparator;

public class ComparatorTest {
    public static void main(String[] args) {
        Circle [] circles = new Circle[3];
        circles [1] = new Circle();
        circles [0] = new Circle(2.5);
        circles [2] = new Circle("Purple",false, 4.6);

        System.out.println("Pre-sort: ");
//        For-each: for(Kiểu dữ liệu <Tên biến> : <Tên mảng>

        for (Circle circle : circles) {
            System.out.println(circle);
        }
        Comparator circleComparator = new CircleComparator();
        Arrays.sort(circles,circleComparator);
//        Arrays.sort(circles);
        System.out.println("After-sort: ");

        for (Circle circle : circles) {
            System.out.println(circle);
        }
    }
}
