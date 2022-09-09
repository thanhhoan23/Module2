package Class;

import java.util.Scanner;

public class DayInMonth {
    public static void main(String[] args) {
        Scanner numberMonth = new Scanner(System.in);
        System.out.println("Input the number of month: ");
        int month = numberMonth.nextInt();

        switch (month) {
            case 1:
            case 3:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("The month have 31 days");
                break;
            case 4:
            case 5:
            case 6:
            case 9:
            case 11:
                System.out.println("The month have 30 days");
                break;
            default:
                System.out.println("The month have 28 days");

        }
    }
}
