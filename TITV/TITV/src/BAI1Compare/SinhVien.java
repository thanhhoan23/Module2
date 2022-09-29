package BAI1Compare;

public class SinhVien implements Comparable<SinhVien> {
    private int maSinhVien;
    private String hoVaTen;
    private String tenLop;
    private double diemTrungBinh;

    public SinhVien(int id, String fullName, String nameClass, double point) {
        this.maSinhVien = id;
        this.hoVaTen = fullName;
        this.tenLop = nameClass;
        this.diemTrungBinh = point;
    }

    public int getMaSinhVien() {
        return maSinhVien;
    }

    public void setMaSinhVien(int maSinhVien) {
        this.maSinhVien = maSinhVien;
    }

    public String getHoVaTen() {
        return hoVaTen;
    }

    public void setHoVaTen(String hoVaTen) {
        this.hoVaTen = hoVaTen;
    }

    public String getTenLop() {
        return tenLop;
    }

    public void setTenLop(String tenLop) {
        this.tenLop = tenLop;
    }

    public double getDiemTrungBinh() {
        return diemTrungBinh;
    }

    public void setDiemTrungBinh(double diemTrungBinh) {
        this.diemTrungBinh = diemTrungBinh;
    }
//
    public String getName() {
        String s = this.hoVaTen.trim();
        if (s.indexOf(" ") >=0) {
            int vt = s.lastIndexOf("");
            return s.substring(vt +1);
        } else {
            return s;
        }
    }

    @Override
    public int compareTo(SinhVien o) {
        String tenThis = this.getName();
        String tenO = o.getName();
        return tenThis.compareTo(tenO);
    }

//    @Override
//    public int compareTo(SinhVien o) {
//        if (this.maSinhVien > o.maSinhVien) {
//            return 1;
//        } else
//            if (this.maSinhVien < o.maSinhVien) {
//                return -1;
//            } else {
//                return 0;
//            }
//    }
}
