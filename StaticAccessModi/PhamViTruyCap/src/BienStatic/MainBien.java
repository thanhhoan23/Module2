package BienStatic;

public class MainBien {
    public static void main(String[] args) {

        Student.change();
        Student st1 = new Student(111, "HOANG");
        Student st2 = new Student(111, "Khanh");
        Student st3 = new Student(111, "Duy");

        st1.display();
        st2.display();
        st3.display();
    }

}
