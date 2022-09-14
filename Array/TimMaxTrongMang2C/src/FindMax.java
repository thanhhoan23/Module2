import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class FindMax {
    public static void main(String[] args) {
        Integer [] [] numbers;
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap so dong: ");
        int numberRow = input.nextInt();

        System.out.println("Nhap so cot: ");
        int numberColumn = input.nextInt();
        numbers = new Integer[numberRow][numberColumn] ;

        for (int i = 0; i < numberRow; i++) {
            for (int j =0; j < numberColumn; j++) {
                System.out.println("Nhap hang thu " + i + " cot thu " + j + ":");
                numbers[i][j] = input.nextInt();
            }
        }
        for (int i = 0; i < numberRow; i++) {
            for (int j = 0; j <numberColumn; j++) {
                System.out.print("[" + numbers[i][j] + "]");

            }
            System.out.println(" ");
        }

        int max = numbers[0][0];
        for ( int i = 0; i < numberRow; i++) {
            for (int j = 0; j <numberColumn; j ++) {
                if (numbers[i][j] > max) {
                    max = numbers[i][j];
                }
            }
        }
        System.out.println("So lon nhat: " + max);

        int min = numbers[0][0];
        for (int i = 0; i < numberRow; i++) {
            for (int j = 0; j < numberColumn; j++) {
                if (numbers[i][j] < min) {
                    min = numbers[i][j];
                }
            }
        }
        System.out.println("So nho nhat:" + min);



        
    }
}
