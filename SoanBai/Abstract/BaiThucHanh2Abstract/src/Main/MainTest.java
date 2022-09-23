package Main;

import Compare.ComparableCircle;
import Type.Circle;

import java.util.Arrays;

public class MainTest {
    public static void main(String[] args) {
        ComparableCircle [] circles = new ComparableCircle[3];
        circles [0]= new ComparableCircle(3.6);
        circles [1] = new ComparableCircle();
        circles [2] = new ComparableCircle("White", true, 4);

        System.out.println("Pre-sort: ");
//        Duyet qua tang phan tu cua mang
        for (ComparableCircle circle : circles) {
            System.out.println(circle);
        }
//         sắp xếp tất cả các phần tử của mảng
        Arrays.sort(circles);

        System.out.println("After-sort:");
        for (ComparableCircle circle : circles) {
            System.out.println(circle);
        }
    }
}
