package mainn;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double choose = 0;
        do {
            System.out.println("✛✛✛✛✛✛✛✛✛✛✛✛✛✛✛✛✛✛✛✛✛✛✛✛Menu✛✛✛✛✛✛✛✛✛✛✛✛✛✛✛✛✛✛");
            System.out.println("*           Vui lòng chọn chức năng          *");
            System.out.println("*   1. Thêm sản phẩm                         *");
            System.out.println("*   2. Chỉnh sửa sản phẩm theo id            *");
            System.out.println("*   3. Xóa một sản phẩm                      *");
            System.out.println("*   0. Thoát chương trình                    *");
            System.out.println("✛✛✛✛✛✛✛✛✛✛✛✛✛✛✛✛✛✛✛✛✛✛✛✛✛✛✛✛✛✛✛✛✛✛✛✛✛✛✛✛✛✛✛✛✛✛");
            choose = Double.parseDouble(input.nextLine());

            if (choose == 1) {

            } else if (choose == 2) {

            } else if (choose == 3) {
                do {
                    System.out.println("✛✛✛✛✛✛✛✛✛✛✛✛✛✛✛✛✛✛✛✛✛✛✛Menu✛✛✛✛✛✛✛✛✛✛✛✛✛✛✛✛✛✛ ");
                    System.out.println("*       Vui lòng chọn chức năng chỉnh sửa    *");
                    System.out.println("*   1. Chỉnh sửa tên sản phẩm theo id        *");
                    System.out.println("*   2. Chỉnh sửa giá sản phẩm theo id        *");
                    System.out.println("*   3. Chỉnh sửa id  sản phẩm theo id        *");
                    System.out.println("*   0. Thoát chương trình                    *");
                    System.out.println("✛✛✛✛✛✛✛✛✛✛✛✛✛✛✛✛✛✛✛✛✛✛✛✛✛✛✛✛✛✛✛✛✛✛✛✛✛✛✛✛✛✛✛✛✛✛");
                    choose = Double.parseDouble(input.nextLine());

                    if (choose == 1) {

                    } else if (choose ==2) {

                    } else if (choose ==3) {

                    }

                } while (choose != 0);
            }
        }  while (choose != 0) ;
    }
}
