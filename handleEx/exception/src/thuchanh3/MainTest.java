package thuchanh3;

import java.util.Scanner;

public class MainTest {
    public static void main(String[] args) {
        CalculationExample calculationExample;
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập số đầu tiên:");
        int x = input.nextInt();
        System.out.println("Nhập số thứ 2");
        int y = input.nextInt();
        calculationExample = new CalculationExample(x,y);
        calculationExample.calculate(x,y);

    }
}
