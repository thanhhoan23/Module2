import java.util.Scanner;

public class NumberPrime {
    public static void main(String[] args) {
//      int count = 0;
//      xem so luong so nguyen to in ra da bang number chua
//      int number = 0;
//
//      for (int n = 2; n <20; n++ ){
//          if (count == number) {
//
//          }
//      }

        int number;
        int count = 0;
        int check = 0;
        for (number = 2; count <= 20; number++) {
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    check++;
                }
            }
            if (check == 0) {
                System.out.println(number);
                count++;
            }
            check = 0;
        }
    }
}
