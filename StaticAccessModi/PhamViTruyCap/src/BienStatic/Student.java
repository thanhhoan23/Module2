package BienStatic;

public class Student {
    private  int a;
    private String name;
    private static String college = "TDL";
//    Khoi tao constructor
    Student (int r, String n) {
        this.a = r;
        this.name = n;
    }
//sudung static de khai bao thuoc tinh chung
    static void change() {
        college = "Codegym";
    }
//    pham vi truy cap default
    void display () {
        System.out.println(a + " "+ name + " " + college);
    }

}
