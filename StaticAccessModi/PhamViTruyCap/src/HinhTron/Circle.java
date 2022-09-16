package HinhTron;

public class Circle {
    private double radius = 1.0;
    private String color = "red";

    public Circle () {

    }
    public Circle(double r) {
        this.radius = r;
    }

    public double getRadius() {
        return radius;
    }
    public double getArea() {
//        return (Math.PI * Circle())
        return (Math.PI * this.radius * this.radius );
    }
}
