package thuchanh2;

import java.util.Random;

public class ArrayExample {
    public Integer[] creatRandom() {
        Random rd = new Random();
        Integer [] arr = new Integer[100];
        System.out.println("Nhap so phan tu");
        for (int  i = 0; i<arr.length; i++) {
            arr[i] = rd.nextInt(100);
            System.out.println(arr[i]);
        }
        return arr;
    }
}
