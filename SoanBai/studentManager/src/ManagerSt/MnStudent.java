package ManagerSt;

public class MnStudent {
    private String fullName;
    private int age;
    private String address;
    private float point;
    private String school;
    public static String province = "Huế";
    public MnStudent(String fullName, int age, String address, float point, String school) {
        this.fullName = fullName;
        this.age = age;
        this.address = address;
        this.point = point;
        this.school = school;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public float getPoint() {
        return point;
    }

    public void setPoint(float point) {
        this.point = point;
    }

   public String getSchool() {
       return school;
   }

    public void setSchool(String school) {
        this.school = school;
    }

    public String show() {
    return String.format("{fullName: %s, age: %d, point: %f, address: %s, School: %s}",
            this.fullName, this.age, this.getPoint(), this.address, this.getSchool());
    }
}
