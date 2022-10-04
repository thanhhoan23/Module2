package thuchanh1stack;

import java.util.ArrayList;

public class MyStack<E> {
    private ArrayList<E> stack;

    public MyStack() {
        stack = new ArrayList<>();
    }
    public void push(E element){
        stack.add(0,element);
    }
    public E pop(){
        return stack.remove(stack.size()-1);
    }
    public boolean isEmpty(){
        if (stack.size()==0){
            return true;
        }
        return false;
    }


}
