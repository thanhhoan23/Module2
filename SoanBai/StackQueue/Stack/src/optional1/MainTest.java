package optional1;

public class MainTest {
    public static void main(String[] args) {
      MyQueue queue = new MyQueue(3);
      queue.enqueue(2);
      queue.dequeue();
      queue.enqueue(3);
      queue.enqueue(5);
      queue.dequeue();

    }
}
