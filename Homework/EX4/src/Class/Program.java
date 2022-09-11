package Class;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.println("Input the number you want to find: ");
        int numberFind = number.nextInt();
        int number2 = 20;

        for (int i = 0; i <= numberFind; i++) {
            if (numberFind == i) {
                for (int j = 0; j <= number2 ; j++ ) {
                    System.out.println(i + " x " + j + " = " + (i * j));
                }
            }
        }
        
    }
}
