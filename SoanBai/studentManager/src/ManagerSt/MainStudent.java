package ManagerSt;

import StudentsManager.Student;

import java.util.Scanner;

public class MainStudent {
    public static void main(String[] args) {
        Student s1 = new Student("Hoan", 20, "28 Điện Biên Phủ", 9.0f, "Quốc Học");
        Student s2 = new Student("Luyn", 40, "29 Điện Biên Phủ", 7.0f, "Quốc Học");
        Student s3 = new Student("Dung", 10, "28 Điện Biên Phủ", 5.0f, "HBT");
        Student s4 = new Student("Cuong", 27, "58 Điện Biên Phủ", 10.0f, "Quốc Học");
        Student s5 = new Student("Loi", 20, "98 Điện Biên Phủ", 8.0f, "Nguyễn Huệ");

        Student[] students = {s1, s2, s3, s4, s5};
//        searchStudent(students,10f);
        searchStudent(students,11f);
//        searchStudent(students,8f);
    }
    public static void searchStudent (Student[] arr, float p) {
        for ( int i =0; i< arr.length; i++) {
            if (arr[i].getPoint() == p){
                System.out.println(i);
            }

        }
    }
}
