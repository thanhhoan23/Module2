import java.util.Arrays;
import java.util.Scanner;

public class CountStudentPass {
    public static void main(String[] args) {
      int [] arr;
      Scanner input = new Scanner(System.in);
        System.out.println("Nhập số lượng phần tử: ");
        int size = input.nextInt();
        arr = new int[size];
        for ( int i =0; i< arr.length; i++) {
            if (arr.length < 30) {
                System.out.println("Nhập từng đểm của học sinh : " + i + "  ");
                arr[i] = input.nextInt();
            };
        }
        System.out.println(Arrays.toString(arr));

        int count = 0;
        System.out.println("List of mark: ");
        for ( int j = 0; j < arr.length; j++) {
            System.out.println(arr[j]);
            if (arr[j] >= 5 && arr[j] <= 10 ) {
                count++;
            }
        }
        System.out.println("So hoc sinh pass" + count);

    }
}
