import com.sun.glass.ui.Accessible;

import java.util.Arrays;
import java.util.Scanner;

public class AddNumberForArr {
    public static void main(String[] args) {
        Integer [] numbers;

        Scanner input = new Scanner(System.in);
        System.out.println("Nhap so luong phan tu: ");
        int quantityNum = input.nextInt();
        numbers = new Integer[quantityNum];
        for ( int i = 0; i< numbers.length-1; i++) {
            System.out.println("Nhap so tai vi tri : " + i + " ");
            numbers[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(numbers));

        System.out.println("Nhap so ban muon chen: ");
        int numberAdd = input.nextInt();

        System.out.println("Nhap vi tri ban muon chen: ");
        int indexAdd = input.nextInt();

        while (indexAdd<= -1 && indexAdd>= numbers.length-1) {
            System.out.println("Khong the chen phan tu vao duoc!");
            System.out.println("Vui long nhap lai vi tri: ");
            indexAdd = input.nextInt();
        }

        for (int i = numbers.length-2 ; i>= indexAdd; i--){
            numbers[i + 1] = numbers[i];
//            System.out.println(i);
        }
        numbers[indexAdd] = numberAdd;

        System.out.println(Arrays.toString(numbers));

    }
}
