package BaiTapSinhVien;

public class Student implements Comparable<Student> {
    private String id;
    private String fullName;
    private int year;
    private float point;

    public Student(String id, String fullName, int dob, float point) {
        this.id = id;
        this.fullName = fullName;
        this.year = dob;
        this.point = point;
    }

    public Student(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getDob() {
        return year;
    }

    public void setDob(int dob) {
        this.year = dob;
    }

    public float getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Student other = (Student) obj;
        return false;
    }

    @Override
    public int compareTo(Student o) {
        return this.getId().compareTo(o.getId());
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", fullName='" + fullName + '\'' +
                ", year=" + year +
                ", point=" + point +
                '}';
    }
}
