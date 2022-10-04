package thuchanh1stack;

public class MainTest {
    public static void main(String[] args) {
        MyGenericStack<Integer> stack = new MyGenericStack<>();
        stack.push(1);
        stack.push(4);
        stack.push(9);
        stack.push(12);
        System.out.println(stack);
        stack.pop();
        System.out.println(stack);
        System.out.println(stack.size());

    }
}
