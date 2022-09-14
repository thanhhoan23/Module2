import java.util.Scanner;

public class Sum2C {
    public static void main(String[] args) {
        int [][] numbers;

        Scanner input = new Scanner(System.in);

        System.out.println("Nhap so dong: ");
        int row = input.nextInt();

        System.out.println("Nhap so cot:");
        int column = input.nextInt();

        numbers = new int[row][column];

        for (int i = 0; i< row; i++) {
            for (int j = 0; j< column; j++) {
                System.out.println("Dong thu " + i + "cot thu " + j + "  ");
                numbers[i][j] = input.nextInt();
            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print("[" + numbers[i][j] + "]");
            }
            System.out.println(" ");

        }

    }
}
