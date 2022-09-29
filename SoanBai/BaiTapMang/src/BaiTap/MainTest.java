package BaiTap;

import java.util.Arrays;

public class MainTest {
    public static void main(String[] args) {
        MyList<Integer> listInteger = new MyList<>();
        listInteger.add(1);
        listInteger.add(2);
        listInteger.add(3);
        listInteger.add(4);
        listInteger.add(5);
        listInteger.add(3);
        listInteger.add(8);
        listInteger.add(5);
        listInteger.add(5);
        listInteger.add(6);

//        System.out.println("Size: " + listInteger.getSize());
//        System.out.println("Item 5: " + listInteger.get(5));
//        listInteger.add(2,10);
//        System.out.println(Arrays.toString(listInteger.getElements()));

        Integer [] arr1 = {7,4,6,9};
//        Integer[] arr1 = {1,2,3};
//        Integer[] arr1 = {2,4,4};
//        listInteger.conCat(arr);
//        System.out.println(listInteger);
//        listInteger.checkChildArray(arr1);
//
//        listInteger.copy(arr1, 2,4);
            listInteger.copy(arr1,2,4);
    }
    }

