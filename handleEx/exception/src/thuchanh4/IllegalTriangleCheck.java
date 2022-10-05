package thuchanh4;

public class IllegalTriangleCheck {
    public void check (int a, int b, int c) throws IllegalTriangleException, MyTriangleException {
        if (a+b < c || a +c < b || c + b <a) {
            throw new IllegalTriangleException("Lỗi: nhập lại đi nhé");
        } else {
            if(c==10){
                throw new MyTriangleException("Tam gia khong duoc co canh bang 10");
            }
            System.out.println("Hihi, Hợp lệ rồi kìa!");
        }
    }
}
