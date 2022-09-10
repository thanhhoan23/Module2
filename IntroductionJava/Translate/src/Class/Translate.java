package Class;

import java.util.Scanner;

public class Translate {
    public static void main(String[] args) {
        Scanner numberMoney = new Scanner(System.in);
//        System.out.println("Input the USD: ");
//        int moneyUSD = numberMoney.nextInt();

        System.out.println("Input the USD you want to transfer: ");
        double moneyVND = numberMoney.nextInt();

        double totalUSD = moneyVND * 23000;
        System.out.println("The total have: " + totalUSD);


    }
}
