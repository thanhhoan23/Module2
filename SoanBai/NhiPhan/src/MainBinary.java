import com.sun.org.apache.xpath.internal.SourceTree;
import com.sun.org.apache.xpath.internal.objects.XNumber;

import java.util.Scanner;

public class MainBinary {
    public static void main(String[] args) {
        BinarySearch bi = new BinarySearch();
        int[] arr;
        Scanner input = new Scanner(System.in);
        System.out.println("Input the total of element for the array: ");
        int colum = input.nextInt();
        arr = new int[colum];
        for ( int i = 0; i < colum;  i++) {
            System.out.println("Input the number: ");
            arr[i] = input.nextInt();
        }
        for (int i = 0; i < colum; i++) {
            System.out.print(" " + arr[i]);
        }
        System.out.println("");

        System.out.println("Input the number you find: ");
        int number = input.nextInt();

        System.out.println("Vi tri: " + bi.binary(arr, number ));
    }

}
