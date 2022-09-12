import java.util.Scanner;

public class TypeMenu {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

        System.out.println("1.Print the rectangle");
        System.out.println("2. Print the square triangle");
        System.out.println("3.Print isosceles triangle ");
        System.out.println("0: Exit");
        System.out.println("Input the number you want to choice: ");
        int number = input.nextInt();

        if (number == 1) {
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 4; j++) {
                    System.out.print("*");
                }
                System.out.println("\n");
            }
        } else if (number == 2 ) {
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j <= i; j++) {
                    System.out.print("*");

                }
                System.out.println("\n");
            }
        } else if (number == 3 ){
            for (int i = 5; i > 0; i--) {
                for (int j = 1; j <=i ; j++) {
                    System.out.print("*");
                }
                System.out.println("\n");
            }
        } else if (number == 0) {
            System.exit(0);
        }



    }
}
