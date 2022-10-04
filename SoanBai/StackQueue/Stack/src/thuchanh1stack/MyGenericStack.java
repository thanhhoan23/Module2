package thuchanh1stack;

import java.util.LinkedList;

public class MyGenericStack <T> {
   private LinkedList<T> stack;

   public MyGenericStack() {
       stack =new LinkedList<T>();
   }
//Them vao phan tu dau tien
   public void push (T element) {
       stack.addFirst(element);
   }
//   AddFirst trong linkedList
//        public void addFirst(Object data) {
//            Node temp = head;
//            head = new Node(data);
//            head.next = temp;
//            numNodes++;
//        }

//    xoa phan tu dau tien
    public T pop () {
       return stack.removeFirst();
    }
//    xac dinh duoc size
    public int size() {
        return stack.size();
    }
//    kiem tra rong

    public boolean isEmpty() {
       if (stack.size()==0) {
           return true;
       }
       return false;
    }




    @Override
    public String toString() {
        return "MyGenericStack{" +
                "stack=" + stack +
                '}';
    }
}
