package thuchanh3;

import java.util.InputMismatchException;

public class CalculationExample {
    private int x;
    private int y;
    public  CalculationExample(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public void calculate (int x, int y) {
        try {
        int a = x+ y;
        int b = x -y;
        int c = x * y;
        int d = x / y;
        System.out.println("Kết quả của phép cộng" + a);
        System.out.println("Kết quả của phép trừ: " + b);
        System.out.println("Kết quả của phép nhân:" + c);
        System.out.println("Kết quả của phép chia: " + d);
    } catch (Exception e) {
            System.err.println(e.getMessage());
        }

        }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "CalculationExample{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
