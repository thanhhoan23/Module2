package Class;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
       Scanner area = new Scanner( System.in );
        System.out.println(" Input the height: ");
        int height = area.nextInt();

        System.out.println("Input the width: ");
        int width = area.nextInt();

        System.out.println("Rectangle:" + height * width);
    }
}
