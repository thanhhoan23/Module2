package Baitap2;

public class Cylinder extends Circle {
    private double height;
    private double volume;

    public Cylinder() {
    }

    public Cylinder(double height, double volume, double radius, String color, double area) {
        super(radius, color, area);
        this.height = height;
        this.volume = volume;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getVolume () {
        return volume;
    }
    public void setVolume(double volume){
        this.volume = volume;
    }
    public String toString() {
        return "Height = " + height +
                "Volume = " + volume +
                super.toString();
    }

}
