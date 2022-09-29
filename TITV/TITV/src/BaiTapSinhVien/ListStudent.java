package BaiTapSinhVien;

import java.awt.*;
import java.util.ArrayList;

public class ListStudent {
   private ArrayList<Student> list;
   public ListStudent () {
       this.list = new ArrayList<Student>();
   }

    public ListStudent(ArrayList<Student> list) {
        this.list = list;
    }

//    them sinh vien vao danh sach
    public void themSinhVien(Student sv) {
       this.list.add(sv);
    }

//    In ra danh sách sinh viên

    public void inDanhSach () {
       for (Student sv : list) {
           System.out.println(sv);
       }
    }
//    Kiểm tra danh sách có rỗng hay không
    public boolean kiemTraRong() {
      return this.list.isEmpty();
    }

//    Lấy ra số lượng sinh viên có trong danh sách
    public int laySoLuongSinhVien () {
       return this.list.size();
    }
//    làm rỗng danh sách sinh viên
    public void lamRong() {
        System.out.println(this.list.removeAll(list));
    }
//    Kiểm tra sinh viên có tồn tại trong danh sách hay không
    public boolean kiemTraTonTai(Student sv) {
        return this.list.contains(sv);
    }

//    Xóa một sinh ra khởi danh sách dựa trên mã sinh viên
    public boolean xoaSinhVien (Student sv) {
       return this.list.remove(sv);
    }

//    Tìm kiếm tất cả sinh viên trên dựa vào Tên được nhập vào
    public void timKiemSinhVien (String ten) {
       for (Student sv : list) {
           if (sv.getFullName().indexOf(ten) >= 0) {
               System.out.println(sv);
           }
       }
    }
    //       9. Xuất ra danh sách sinh viên có điểm từ cao đến thấp

}
