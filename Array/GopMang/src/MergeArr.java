import java.util.Arrays;
import java.util.Scanner;

public class MergeArr {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int [] array1;
        System.out.println("Nhap so phan tu cua mang 1:");
        int number1 = input.nextInt();
        array1 = new int[number1];
        for (int i = 0; i < array1.length; i++) {
            System.out.println("Nhap so phan tu: " + i + "  ");
            array1[i] = input.nextInt();
        }

        int [] array2;
        System.out.println("Nhap so phan tu cua mang 2: ");
        int number2 = input.nextInt();
        array2 = new int[number2];
        for (int i = 0; i < array2.length; i++) {
            System.out.println("Nhap phan tu: " + i + " ");
            array2[i] = input.nextInt();
        }

        int [] array3 = new int[number1 + number2];
        for ( int i =0; i < array1.length; i++) {
            array3[i] = array1[i];
        }
        for (int i = 0; i< array2.length; i++) {
            array3[i + number1] = array2[i];
        }
        System.out.println("Mang moi: " + Arrays.toString(array3) );
        
    }
}
