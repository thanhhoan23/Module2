import java.util.Scanner;

public class FindMaxValue {
    public static void main(String[] args) {
//        String [] names = {
//                "Quockkkhanh", "DuykHANH", "tHANHHOAN"
//        };
//        String str = names[0];
//        for (int i = 0; i < names.length; i++){
//            if (names[i].trim().length() > str.trim().length()) {
//                str = names[i];
//            }
//        }
//        System.out.println(str);

//        Tim so lon nhat

        Integer[] numbers = {
               11,1,5,2,9,10
        };
        int num = numbers[0];
        for (int i = 0; i< numbers.length; i++) {
            if (numbers[i] > num) {
                num = numbers[i];
            }
        }
        System.out.println(num);

    }
}
