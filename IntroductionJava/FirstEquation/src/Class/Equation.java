package Class;

import java.util.Scanner;

public class Equation {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.println("Input the number a: ");
        int numberA = number.nextInt();
        System.out.println("Input the number b: ");
        int numberB = number.nextInt();
        if (numberA == 0 ) {
            System.out.println("The equation has not be solution");
        } else if (numberA != 0 ) {
            System.out.println(" Valid equation is: " + (-numberB/ numberA));
        }
    }
}
