package StudentsManager;

public class StudentManager {
    public static void main(String[] args) {
        Student s1 = new Student("Hoan", 20, "28 Điện Biên Phủ", 9.0f, "Quốc Học");
        Student s2 = new Student("Luyn", 40, "29 Điện Biên Phủ", 7.0f, "Quốc Học");
        Student s3 = new Student("Dung", 10, "28 Điện Biên Phủ", 5.0f, "HBT");
        Student s4 = new Student("Cuong", 27, "58 Điện Biên Phủ", 10.0f, "Quốc Học");
        Student s5 = new Student("Loi", 20, "98 Điện Biên Phủ", 8.0f, "Nguyễn Huệ");

        //Student[] students = new Student[5];
        // Khởi tạo mảng như thế này sai
//        for(int i=0;i<students.length;i++){
//            students[i] = s[i];
//        }
        // Khởi tạo mảng 5 phần tử
//        students[0] = s1;
//        students[1] = s2;
//        students[2] = s3;
//        students[3] = s4;
//        students[4] = s5;
        Student[] students = {s1, s2, s3, s4, s5};
        Student s = searchStudentByPoint(10f, students);
        System.out.println(s.showInfo());
        System.out.println(searchMaxByPoint(students).showInfo());


        arrangeArr(students);
        show(students);


        searchStudent( students, "Quốc Học");



        searchSt(9, students);
        searchSt(6, students);

    }

    public static int searchStudentIndexByPoint(float point, Student[] students) {
        for (int i = 0; i < students.length; i++) {
            if (students[i].getPoint() == point) {
                return i;
            }
        }
        return -1;
    }

    public static Student searchStudentByPoint(float point, Student[] students) {
        // foreach(Element e: list)
        int i = 0;
        for (Student item : students) {
            if (item.getPoint() == point) {
                System.out.println("Index:  " + i);
                return item;
            }
            i++;
        }
        return null;
    }

    //    Tim diem cao nhat:
    public static Student searchMaxByPoint(Student[] students) {
        float maxPoint = students[0].getPoint();
        int index = 0;
        for (int i = 0; i < students.length; i++) {
            if (students[i].getPoint() > maxPoint) {
                maxPoint = students[i].getPoint();
                index = i;
            }
        }
        return students[index];
    }

    //Sắp xếp mảng theo vị trí giảm dần
    public static void arrangeArr(Student[] array) {
        Student temp = array[0];

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i].getPoint() < array[j].getPoint()) {
                    temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
        }
    }

//    In ra 3 học sinh có điểm cao nhất
    public static void show(Student[] students) {
        for (int i = 0; i < 3; i++) {
            System.out.println("Three students have : " + students[i].showInfo());
        }
    }

//    Tính điểm trung bình của từng trường
public static void searchStudent(Student[] students, String sc) {
    // foreach(Element e: list)
    double total =0;
    int count =0;

    for ( int i =0; i < students.length; i++) {
        if (students[i].getSchool() == sc) {
            total = total + students[i].getPoint();
            count++;
        }

    }
    System.out.println("Điểm trung bình: " + total/count);

}
//Tìm ra những học sinh có điểm cao hơn 1 điểm nhập vào: 8,9,10
public static void searchSt(float point, Student[] students) {
    for (int i = 0; i < students.length; i++) {
        if (students[i].getPoint() > point) {
            System.out.println("Hoc sinh: "+students[i].showInfo());
        }
    }

}
    }



//    Lay ra 3 hoc sinh co diem cao nhat
//public static Student[] searchMaxThreeByPoint (Student[] array, int sl) {
//    int i = 0;
//    Student[] maxstudent = new Student[3];
//    Student s1 = new Student("aaaa", 20, "28 Điện Biên Phủ",9.0f, "Quốc Học");
//    Student s2 = new Student("aaa", 40, "29 Điện Biên Phủ",7.0f, "Quốc Học");
//    Student s3 = new Student("Dunaag", 10, "28 Điện Biên Phủ",5.0f, "HBT");
//    maxstudent[0]=s1;
//    maxstudent[1]=s2;
//    maxstudent[2]=s3;
//    while (i <= sl) {
//        double max = array[0].getPoint();
//        int index = 0;
//        for (int j = 0; j < array.length; j++) {
//            if (array[j].getPoint() >= max) {
//                boolean check = false;
//                for (int k = 0; k < maxstudent.length; k++) {
//                    if (array[j].getFullName() {
//                        check = true;
//                        break;
//                    }
//                }
//                if (check = false) {
//                    max = array[j].getPoint();
//                    index = j;
//                }
//            }
//
//        }
//        maxstudent[i] = array[index];
//        i++;
//    }
//    return maxstudent ;
//}

