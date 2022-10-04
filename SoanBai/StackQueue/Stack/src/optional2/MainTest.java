package optional2;

public class MainTest {
    public static void main(String[] args) {
        MyStack myStack= new MyStack(4);
        myStack.push(3);
        myStack.push(0);
        myStack.push(9);
        myStack.push(12);
        System.out.println(myStack);
        System.out.println("Lay ra phan tu" + myStack.pop());
    }
}
