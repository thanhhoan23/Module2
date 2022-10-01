package BaiTap2;

public class MyLinkedList {
    private Node head;
    private int numNodes =0;
    public MyLinkedList(Object data){
        head = new Node(data);
    }
    class Node{
        private Object data;
        private Node next;

        public Node (Object data) {
            this.data = data;
        }

        public Object getData() {
            return data;
        }
    }
//    phuong thuc add

    public void add(int index, Object data) {
        Node temp = head;
        for (int i = 0; i<index-1 && temp.next != null; i++) {
            head = new Node(data);
        }
        head.next = temp;
        numNodes++;
    }
//    Phuong thuc add tai mot vi tri nao do

    public void addAnyWhere (int index, Object data){
        Node temp = head;
        for(int i=0; i < index-1 && temp.next != null; i++) {
           temp = temp.next;
        }
        Node holder = temp.next;
        temp.next = new Node(data);
        temp.next.next = holder;
        numNodes++;
    }

//Add vao vi tri dau
    public void addfirst(Object data) {
        Node temp = head;
        head = new Node(data);
        head.next = temp;
        numNodes++;
    }
//    Add vao vi tri cuoi

//xoa phan tu tai vi tri index
    public void remove (int index) {
    Node temp = head;
    for (int i =0; i< index -1; i++) {
        temp = temp.next;
    }
    temp.next = temp.next.next;
    numNodes--;
    }
//    Lay phan tu tai vi tri index

    public Node getIndex (int index) {
        Node temp = head;
        for (int i =0; i< index; i++) {
            temp = temp.next;
        }
        return temp;
    }

//    size


}
