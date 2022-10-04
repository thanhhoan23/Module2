package optional1;

public class MyQueue {
    private int capacity;
    private int [] queueArr;
    private int head = 0;
    private int tail;
    private int currentSize=0;
    public MyQueue(int queueSize){
        this.capacity = queueSize;
        queueArr = new int[queueSize];
    }
//    phuong thuc kiem
    public boolean isQueueFull() {
        boolean status = false;
        if (currentSize == capacity) {
            return true;
        }
        return false;
    }

//Empty
    public boolean isQueueEmpty() {
        boolean status = false;
        if (currentSize == 0) {
            return true;
        }
        return false;
    }

//    them vao
    public void enqueue (int item) {
        if(isQueueFull()) {
            System.out.println("Unable to add the element " + item);
        } else {
            tail++;
            if (tail == capacity-1) {
                tail = 0;
            }
            queueArr[tail] = item;
            currentSize++;
            System.out.println(item);
        }
    }

//    Lay ra
    public void dequeue() {
        if (isQueueEmpty()) {
            System.out.println("Unable to add the element from queue");
        }else {
            head++;
            if (head == capacity-1) {
                System.out.println("Remove" +queueArr [head-1]);
                head=0;
            }else {
                System.out.println("Remove" + queueArr[head-1]);
            }
            currentSize--;
        }
    }
}
