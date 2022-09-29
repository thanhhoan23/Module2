package BaiTapSinhVien;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ListStudent danhSach = new ListStudent();
        int choose = 0;

        do {
            System.out.println("Menu_____________");
            System.out.println("Vui lòng chọn chức năng: ");
            System.out.println(
                    "1. Thêm sinh viên vào danh sách \n" +
                            "2. In danh sách sinh viên ra màn hình \n" +
                            "3. Kiểm tra danh sách có rỗng hay không \n" +
                            "4. Lấy ra số lượng sinh viên có trong danh sách \n" +
                            "5. Làm rỗng danh sách sinh viên \n" +
                            "6. Kiểm tra sinh viên có tồn tại trong danh sách hay không \n" +
                            "7.  Xóa một sinh ra khởi danh sách dựa trên mã sinh viên \n" +
                            "8. Tìm kiếm tất cả sinh viên dựa trên tên được nhập từ bàn phím \n" +
                            "9. Xuất ra danh sách sinh viên có điểm từ cao đến thấp \n" +
                            "0. Thoát chương trình \n");
            choose = input.nextInt();
            input.nextLine();
            
            if (choose == 1) {
//                1. Thêm sinh viên vào danh sách
                System.out.println("Nhập mã sinh viên: ");
                String maSinhVien = input.nextLine();
                System.out.println("Nhập tên sinh viên: ");
                String tenSinhVien = input.nextLine();
                System.out.println("Nhập năm sinh: ");
                int namsinh = input.nextInt();
                System.out.println("Nhập điểm trung bình");
                float diem = input.nextFloat();
                Student sv = new Student(maSinhVien, tenSinhVien, namsinh, diem);
                danhSach.themSinhVien(sv);
            } else if (choose == 2) {
//                2. In danh sách sinh viên ra màn hình
                danhSach.inDanhSach();
            } else if (choose == 3) {
//                3.Kiểm tra danh sách có rỗng hay không
                System.out.println("Danh sách sinh viên false là không rỗng còn true là rỗng" + danhSach.kiemTraRong());
                ;
            } else if (choose == 4) {
//                4.Lấy ra số lượng sinh viên có trong danh sách
                System.out.println("Số luợng sinh vien:" + danhSach.laySoLuongSinhVien());
                ;

            } else if (choose == 5) {
//                5. Làm rỗng danh sách sinh viên
                danhSach.lamRong();
            } else if (choose == 6) {
//               6. Kiểm tra sinh viên có tồn tại trong danh sách hay không
                System.out.println("Nhập mã sinh viên: "); String maSinhVien = input.nextLine();
                Student SV = new Student(maSinhVien);
                System.out.println(danhSach.kiemTraTonTai(SV));
            }  else if (choose == 7) {
//                7. Xóa một sinh viên ra khỏi danh sách dựa trên mã sinh viên
                System.out.println("Nhập mã sinh viên: "); String maSinhVien = input.nextLine();
                Student sv = new Student(maSinhVien);
                System.out.println(danhSach.xoaSinhVien(sv));
            } else if (choose ==8) {
//                8. Tìm kiếm tất cả sinh viên trên dựa vào Tên được nhập vào
                System.out.println("Nhập tên sinh viên cần tìm: "); String tenSinhVien = input.nextLine();
                Student sv = new Student(tenSinhVien);
                danhSach.timKiemSinhVien(String.valueOf(sv));
            } else {
//                9. Xuất ra danh sách sinh viên có điểm từ cao đến thấp
            }

        } while (choose != 0);
    }
}
