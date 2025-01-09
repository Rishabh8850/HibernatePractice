package LinkedList1;

public class LinkedList<T> {
    private Node head;
    private Node tail;
    private int length;

    //Created Inner Node class which is the basic block for Linked List creation
    class Node {
        T data;
        Node next;
        public Node(T data)
        {
            this.data = data;
        }
    }
    public LinkedList(T data)
    {
        Node newNode = new Node(data);
        this.head = newNode;
        this.tail = newNode;
        this.length = 1;
    }

    public void printLinkedList()
    {
        Node temp = head;
        while(temp != null)
        {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public void appendValue(T data)
    {
        Node new_node = new Node(data);
        if(length == 0)
        {
            head = new_node;
            tail = new_node;
        }
        else
        {
            tail.next = new_node;
            tail = new_node;
        }
        length ++;
    }

    public Node getHead() {
        return head;
    }

    public Node getTail() {
        return tail;
    }

    public int getLength() {
        return length;
    }
    public void append(T data) {
        Node new_Node = new Node(data);
        if(length == 0) {
            head = new_Node;
            tail = new_Node;
        }
        else {
            tail.next = new_Node;
            tail = new_Node;
        }
        length ++;
    }

    public Node removeLast() {
        if(length == 0) {
            return null;
        }
        Node temp = head;
        Node prev = head;
        while(temp.next != null) {
            prev = temp;
            temp = temp.next;
        }
        prev.next = null;
        tail = prev;
        length--;
        if(length == 0) {
            head = null;
            tail = null;
        }
        return temp;
    }

    public void prepend(T data) {
        Node new_Node = new Node(data);
        if(length == 0) {
            head = new_Node;
            tail = new_Node;
        } else {
           new_Node.next = head;
           head = new_Node;
        }
        length++;
    }

    public Node removeFirst() {
        if(length == 0) {
            return null;
        }
        Node temp = head;
        if(temp.next != null)
        {
            head = temp.next;
            temp.next = null;
        } else {
            head = null;
            tail = null;
        }
        length --;
        return temp;
    }

    public Node get(int i) {
        if(i < 0 || i >= length) {
            return null;
        }
        int count = 0;
        Node temp = head;
        while(i > count) {
            temp = temp.next;
            count++;
        }
        return temp;
    }

    public boolean set(int i, T data) {
        Node temp = get(i);
        if(temp != null) {
            temp.data = data;
            return true;
        }
        return false;
    }

    public boolean insert(int i, T data) {
        Node new_Node = new Node(data);
        if(i < 0 || i > length)
        {
            return false;
        }
        if(i == 0) {
            prepend(data);
            return true;
        }
        if(i == length) {
            append(data);
            return true;
        }
        Node temp = get(i-1);
        new_Node.next = get(i);
        temp.next = new_Node;
        length++;
        return true;
    }

    public Node remove(int i) {
        if(i < 0 || i >= length) {
            return null;
        }
        if(i == 0) {
            return removeFirst();
        }
        if(i == length -1) {
            return removeLast();
        }
        Node temp = get(i);
        get(i-1).next = temp.next;
        temp.next = null;
        length --;
        return temp;
    }

    public void reverseLinkedList() {
        Node curr = head;
        head = tail;
        tail = curr;
        Node prev = null;
        Node next = curr.next;
        while(curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
    }

    public Node getMidNode() {
        Node slow = head;
        Node fast = head;
        if(fast != null && fast.next !=null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public boolean loopDetection() {
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if(slow.data == fast.data) {
                return true;
            }
        }
        return false;
    }

    public Node kthElementFromEnd(int k) {
        Node slow = head;
        Node fast = head;
        int count = 0;
        while(k > count) {
            fast = fast.next;
            count++;
        }
        if(fast == null) {
            return null;
        }
        while(fast != null) {
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }

//    public void partitionList(T data) {
//        Node dummy1 = new Node();
//        Node dummy2 = new Node(0);
//        Node prev1 = dummy1;
//        Node prev2 = dummy2;
//        Node curr = head;
//        while(curr != null)
//        {
//            if(curr.data < data)
//            {
//                prev1.next = curr;
//                prev1 = curr;
//            }
//            else {
//                prev2.next = curr;
//                prev2 = curr;
//            }
//            curr = curr.next;
//        }
//        prev2.next = null;
//        prev1.next = dummy2.next;
//        head = dummy1.next;
//    }

//    public int binaryToDecimal() {
//        int num = 0;
//        Node temp = head;
//        while(temp != null) {
//            num = num*2 + temp.data;
//            temp = temp.next;
//        }
//        return num;
//    }

//    public void reversePartitionList(int i, int j) {
//        Node dummy = new Node(0);
//        dummy.next = head;
//        int count = 0;
//        Node prev = dummy;
//        while(i > count) {
//            prev = prev.next;
//            count ++;
//        }
//        Node curr = prev.next;
//        while(j > count) {
//            Node nodeToBeMoved = curr.next;
//            curr.next = nodeToBeMoved.next;
//            nodeToBeMoved.next = prev.next;
//            prev.next = nodeToBeMoved;
//            count ++;
//        }
//        head = dummy.next;
//    }
}
