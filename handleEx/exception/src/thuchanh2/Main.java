package thuchanh2;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayExample arrayExample = new ArrayExample();
        Integer[] arr = arrayExample.creatRandom();
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập chỉ số phần tử: ");
        int x = input.nextInt();
        try {
            System.out.println("Chỉ số " + x + " " + "ở vị trí " + arr[x]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Chỉ số vượt quá mảng");

        } catch (InputMismatchException e) {
            System.out.println("Vui lòng nhâp số" );
        }
    }
}
