import java.util.Arrays;
import java.util.Scanner;

public class FindMin {
    public static void main(String[] args) {
        int [] arr;

        Scanner input = new Scanner(System.in);
        System.out.println("Nhập số lượng phần tử của mảng: ");
        int number = input.nextInt();
        arr = new int[number];

        for ( int i= 0; i< arr.length; i++) {
            System.out.println("Nhập số lượng từng phần tử" + i + " ");
            arr[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(arr));


        int numberFind = arr[0];
        for (int i = 0; i< arr.length; i++) {
            if (arr[i] < numberFind) {
                numberFind =arr[i];

            }
        }
        System.out.println(numberFind);
    }
}
