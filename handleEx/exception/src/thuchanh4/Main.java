package thuchanh4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        IllegalTriangleCheck checkNumber = new IllegalTriangleCheck();

        try {

            System.out.println("Nhập cạnh a: ");
            int a = input.nextInt();
            System.out.println("Nhập cạnh b: ");
            int b = input.nextInt();
            System.out.println("Nhập cạnh c: ");
            int c = input.nextInt();
            try {
                checkNumber.check(a, b, c);
            } catch (IllegalTriangleException e) {
                System.out.println(e.getMessage());
            } catch (MyTriangleException e) {
                System.out.println(e.getMessage());
            }
        } catch (Exception e) {
            System.out.println("Không đúng định dạng");

        }

//        if (a < 0 || b < 0 || c < 0) {
//            System.out.println("Vui lòng nhập lại số dương");
//
//        } else
//        if (a+b < c || a +c < b || c + b <a) {
//            System.out.println("Không thể có 2 cạnh nào cộng lại bé hơn 1 cạnh");
//        }

    }
}
