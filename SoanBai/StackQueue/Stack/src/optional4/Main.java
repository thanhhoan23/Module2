package optional4;


import java.util.Queue;
import java.util.Stack;
import java.util.concurrent.ConcurrentLinkedQueue;

public class Main {
    public static void main(String[] args) {
        String name = "yey";
        Stack<Character> stack = new Stack<>();
        Queue <Character> queue = new ConcurrentLinkedQueue<>();

        for (int i = 0; i< name.length(); i++) {
            stack.push(name.charAt(i));
            queue.offer(name.charAt(i));
        }
        for (int i = 0; i< name.length(); i++) {
            if (stack.pop() != queue.remove()){
                System.out.println("Khong phai");
                break;
            }

        }


    }
}
