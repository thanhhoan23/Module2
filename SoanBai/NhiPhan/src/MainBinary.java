import java.util.Scanner;

public class MainBinary {
    public static void main(String[] args) {
        BinarySearch bi = new BinarySearch();
        int [] arrayBinary  = {1,5,7,9,10,15};

        System.out.println(bi.binary(arrayBinary, 2));

        System.out.println(bi.binary(arrayBinary, 10));
    }

}
