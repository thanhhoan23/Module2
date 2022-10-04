package BaiTap1;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(5);
        list.add(9);
        list.add(0);
        System.out.println("Mang goc: " + list);
        Stack <Integer> myStack = new Stack<>();

        while (list.size()>0) {
            myStack.push(list.remove(0));
        }
        System.out.println("Mang Push: " + myStack);

        while (myStack.size() > 0) {
            list.add(myStack.pop());
        }
        System.out.println("Dao nguoc" + list);

    }
}
