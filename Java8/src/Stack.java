public class Stack {
    private Node top;
    private int height;
    class Node {
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
        }
    }
    public Stack(int data) {
        Node new_Node = new Node(data);
        top = new_Node;
        height = 1;
    }

    public void printStack() {
        Node temp = top;
        while(temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public void getTop() {
        System.out.println("top element is : " + top.data);
    }

    public void getHeight() {
        System.out.println("size of stack is : " + height);
    }

    public void push(int data) {
        Node new_Node = new Node(data);
        if(top == null) {
            top = new_Node;
        }
        else {
            new_Node.next = top;
            top = new_Node;
        }
        height ++;
    }

    public Node pop(int data) {
        if(top == null) {
            return null;
        }
        Node temp = top;
        top = temp.next;
        temp.next = null;
        height--;
        return temp;
    }
}
