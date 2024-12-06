public class Queue {
    private Node first;
    private Node last;
    private int length ;
    class Node {
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
        }
    }
    public Queue(int data) {
        Node new_Node = new Node(data);
        first = new_Node;
        last = new_Node;
        length = 1;
    }

    public void printAllQueue() {
        Node temp = first;
        while(temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public void getFirst() {
        System.out.println("First : " + first.data);
    }

    public void getLast() {
        System.out.println("Last : " + last.data);
    }

    public void getLength() {
        System.out.println("Length : " + length);
    }

    public void enqueue(int data) {
        Node new_Node = new Node(data);
        if(length == 0) {
            first = new_Node;
            last = new_Node;
        } else {
            last.next = new_Node;
            last = new_Node;
        }
        length++;
    }

    public Node dequeue() {
        if(length == 0) {
            return null;
        }
        Node temp = first;
        if(first == last) {
            first = null;
            last = null;
        } else {
            first = first.next;
            temp.next = null;
        }
        length --;
        return temp;
    }
}
