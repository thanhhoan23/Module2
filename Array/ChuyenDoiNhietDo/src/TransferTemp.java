import java.util.Scanner;

public class TransferTemp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1. Fahrenheit to Celsius");
        System.out.println("2. Celsius to Fahrenheit");
        System.out.println("0. Exit");
        System.out.println("Input the number you want: ");
        int choice = input.nextInt();

       switch (choice) {
           case 1:
               Scanner numberFa = new Scanner(System.in);
               System.out.println("Input the number of Fahrenheit: ");
               int number = numberFa.nextInt();
               System.out.println( "The result: " +(5.0 / 9) * (number - 32));
               break;
           case 2:
               Scanner numberCel = new Scanner(System.in);
               System.out.println("Input the number of Fahrenheit: ");
               int numberC = numberCel.nextInt();
               System.out.println( "The result: " + (9.0 / 5) * numberC + 32);
               break;
           default:
               System.exit(0);

       }
    }
}
