package Type;

import Interface.Colorable;

public class Square extends Rectangle implements Colorable {
    public Square (double side) {
        super(side,side);
    }

//    public Square(double side, String color, boolean filled) {
//        super( side, color, filled);
//    }

    public double getSide() {
        return getWidth();
    }

    public void setSide(double side) {
        setWidth(side);
        setLength(side);
    }
    public double getArea () {
        return getSide()*getSide();
    }
    public double getPerimeter () {
        return 4*getSide();
    }

    @Override
    public void setWidth(double width) {
        setSide(width);
    }

    @Override
    public void setLength(double length) {
        setSide(length);
    }

    @Override
    public String toString() {
        return "A Square with side="
                + getSide()
                + ", which is a subclass of "
                + super.toString();
    }

    @Override
    public String HowToColor() {
        return "Color all four sides";
    }
}
