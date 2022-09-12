import java.util.Scanner;

public class Wish {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);

        System.out.println("Input the number A: ");
        int numberA = number.nextInt();
        System.out.println("Input the number B: ");
        int numberB = number.nextInt();
        numberA = Math.abs(numberA);
        numberB = Math.abs(numberB);

//        if ( numberA ==0 || numberB==0) {
//            System.out.println("No number is valid");
//        }
        while (numberA != numberB) {
            if ( numberA > numberB) {
                numberA = numberA - numberB;
            } else {
                numberB = numberB - numberA;
            }

        }
        System.out.println("uoc chung: " + numberA);
    }
}
