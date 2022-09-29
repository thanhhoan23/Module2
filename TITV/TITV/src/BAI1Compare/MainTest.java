package BAI1Compare;

public class MainTest {
    public static void main(String[] args) {
        SinhVien sv1 = new SinhVien(1,"HOAN", "12C", 9);
        SinhVien sv2 = new SinhVien(2," NHAT", "12C", 7);
        SinhVien sv3 = new SinhVien(1,"KHANH", "12C", 10);
        System.out.println(sv1.compareTo(sv2));

    }
}
