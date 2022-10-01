package BaiTap1;

import org.omg.CORBA.PUBLIC_MEMBER;

import java.util.Arrays;
import java.util.Comparator;

public class MyArrayList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object elements[];

    public MyArrayList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    private void ensureCapa() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

    //Thêm phần tử
    public void add(E e) {
        if (size == elements.length) {
            ensureCapa();
        }
        elements[size++] = e;
    }
//    Sắp xếp theo bubble
    public void bubbleSort(Comparator<Product> comparator) {
        for (int i = 0; i < size; i++) {
            for (int j = size - 1; j > i; j--) {
                if (comparator.compare((Product) elements[i], (Product) elements[j])== 1) {
                    Product temp = (Product)  elements[j];
                    elements[j] = elements[j - 1];
                    elements[j - 1] = temp;
                }
            }
        }
    }
//    Sắp xếp theo bubble

//    public static void bubbleSort(int[] array) {
//    for (int i = 0; i < array.length - 1; i++) {
//        for (int j = array.length - 1; j > i; j--)
//            if (array[j] < array[j - 1]) {
//                int temp = array[j];
//                array[j] = array[j - 1];
//                array[j - 1] = temp;
//            }
//    }
//}


//    Ham in ra
    public void printList() {
        for (int i = 0; i< size; i++) {
            System.out.println(elements[i]);
        }
    }
//    Lấy phần tử tại vị trí index

    public E get(int index) {
        if (index > 0 || index < size) {
            return (E) elements[index];
        }
        return null;
    }

    //Thêm phần tử tại vị trí index
    public void adde(int index, int value) {
        if (size >= elements.length) {
            ensureCapa();
        }
        if (index > 0 || index < size) {
            for (int i = size - 1; i >= index; i--) {
                elements[i + 1] = elements[i];
            }
            elements[index] = value;
            size++;
        }
    }


    //    Xóa đi phần tử
    public void remove(int index) {
        if (index > 0 || index < size) {
            for (int i = index; i < size - 1; i++) {
                elements[i] = elements[i + 1];
            }
        }
    }


//    size
    public int sizee() {
        int count = 0;
        for (int  i=0; i< size; i++) {
            count++;
        }
        return count;
    }
//    Clone
    public MyArrayList <E> myClone () {
        MyArrayList<E> V = new MyArrayList<>();
        V.elements = elements;
        V.size = size;
        return V;
    }

//    Kiểm tra mảng con

    public void checkChildArray(E[] e) {
        if (e.length <= size) {
            int check = 0;
            for (int i = 0; i < size; i++) {
                if (elements[i] == e[0]) {
                    int count = 0;
                    for (int j = 0; j < e.length; j++) {
                        if (elements[j + i] != e[j]) {
                            break;
                        }
                        count++;
                    }
                    if (count == e.length) {
                        System.out.println(Arrays.toString(e) + "La mang con");
                        check++;
                        break;
                    }
                }
            }
            if (check == 0) {
                System.out.println(Arrays.toString(e) + " khong phai");
            }
        } else {
            System.out.println(Arrays.toString(e) + " khong phai");
        }
    }
//Nối

    public void conCat(E[] e) {
        if (size + e.length >= elements.length) {
            ensureCapa();
        }
        for (int i = size; i < size + e.length; i++) {
            elements[i] = e[i - size];
        }
    }

    //    Sao chép một vị trí từ from đến to
    public void copy(E[] e, int from, int to) {
        E[] arr1 = Arrays.copyOfRange(e, from, to);
        System.out.println(Arrays.toString(arr1));
    }

    public int getSize() {
        return size;
    }

    public Object[] getElements() {
        return elements;
    }
}
