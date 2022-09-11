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





//        int [] [] mul = new int [20][10];
//        for (int i = 1; i <= mul.length; i++) {
//
//            for (int j = 0;  j <= mul[i].length ; j++) {
//                System.out.print(i + "*" + j + "=" + i *j);
//            }
//            System.out.println("\n");
//        }
    }
}
