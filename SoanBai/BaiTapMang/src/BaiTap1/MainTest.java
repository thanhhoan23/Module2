package BaiTap1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;

public class MainTest {
    public static void main(String[] args) {
//        MyArrayList<Integer> list = new MyArrayList<>();
//        list.add(2);
//        list.add(3);
//        System.out.println(list);

        MyArrayList<Product> list = new MyArrayList<>();
        list.add(new Product("iphone", 2,3));
        list.add(new Product("iphone 2", 200,4));
        list.add(new Product("iphone 4",  5,8));

        list.printList();
        Comparator comparator=new ComparatorImpl();
//        Comparator comparator = new Product();
        list.bubbleSort(new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return 0;
            }
        });
        list.printList();


//        MyList<Integer> listInteger = new MyList<>();
//        listInteger.add(1);
//        listInteger.add(2);
//        listInteger.add(3);
//        listInteger.add(4);
//        listInteger.add(5);
//        listInteger.add(3);
//        listInteger.add(8);
//        listInteger.add(5);
//        listInteger.add(5);
//        listInteger.add(6);


//        System.out.println("Size: " + listInteger.getSize());
//        System.out.println("Item 5: " + listInteger.get(5));
//        listInteger.add(2,10);
//        System.out.println(Arrays.toString(listInteger.getElements()));

//        Integer [] arr1 = {7,4,6,9};
//        Integer[] arr1 = {1,2,3};
//        Integer[] arr1 = {2,4,4};
//        listInteger.conCat(arr);
//        System.out.println(listInteger);
//        listInteger.checkChildArray(arr1);
//
//        listInteger.copy(arr1, 2,4);
//            listInteger.copy(arr1,2,4);
//        System.out.println("Mảng này gồm: " + listInteger.size() + "phần tử");
//        ArrayList<Integer> l ;
//        l.clone();
//        clone
//     Trước khi clone
//        System.out.println("Trước khi clone: " + listInteger);
////        Sau khi clone
//        System.out.println("Sau khi clone: " + listInteger.clone());
    }
    }

