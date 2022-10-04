package optional2;

import java.util.Arrays;

public class MyStack {
    private int [] arr;
    private int size ;
    private int index;

    public MyStack(int size) {
        arr = new int[size];
    }

//    Them vao phan tu
    public void push (int element) {
        arr[index] = element;
        index++;
    }
//    Lay ra phan tu
    public int pop() {
        return arr[--index];
    }
//    Kiem tra size
    public int size() {
        return index;
    }
//Kiem tra day
    public boolean isFull() {
        if (index == 0) {
            return true;
        }
        return false;
    }
//    Kiem tra rong
    public boolean isEmpty() {
        if (index == size) {
            return true;
        }
        return false;
    }

    public int[] getArr() {
        return arr;
    }

    public void setArr(int[] arr) {
        this.arr = arr;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    @Override
    public String toString() {
        return "MyStack{" +
                "arr=" + Arrays.toString(arr) +
                ", size=" + size +
                ", index=" + index +
                '}';
    }
}
