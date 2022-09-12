package Class;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.println("Input the number you want to check: ");
        int numberCheck = number.nextInt();
        int count = 0;
        int countUoc = 0;
         for (int i = 2; i <= numberCheck; i++) {
             for (int j = 1; j <= i; j++) {
                 if (i % j == 0 ) {
                     countUoc++;
                 }

             }
             if (countUoc == 2) {
                 System.out.println(numberCheck + "là số nguyên tố");
                 
             }
             countUoc = 0;
         }

    }
}
