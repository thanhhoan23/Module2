package Class;

import java.util.Scanner;

public class Money {
    public static void main(String[] args) {
        double totalInterest = 0;
        Scanner money = new Scanner(System.in);
        System.out.println("Input the money borrow: ");
        float moneyBorrow = money.nextFloat();

        System.out.println("Input the interest rate of month: ");
        float interestRate = money.nextFloat();

        System.out.println("Input the month: ");
        int month = money.nextInt();
        System.out.println("total: " + moneyBorrow * (interestRate/100)/12 * month);
    }
}
