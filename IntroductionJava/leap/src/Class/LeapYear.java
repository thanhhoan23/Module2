package Class;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner numberYear = new Scanner(System.in);
        System.out.println("Input the number of the year: ");
        int year = numberYear.nextInt();
        boolean isLeapYear = false;

        if (year % 4 == 0 ){
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    isLeapYear = true;
                }
            } else {
                isLeapYear = true;
            }
        }
    }
}
