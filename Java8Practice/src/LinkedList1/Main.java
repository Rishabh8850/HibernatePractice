package LinkedList1;

import LinkedList1.LinkedList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        LinkedList1.LinkedList<Integer> ll = new LinkedList(1);
        ll.append(3);
        ll.append(2);
        ll.append(5);
        System.out.println("Linked List append : ");
        ll.printLinkedList();
        ll.prepend(9);
        System.out.println("Linked List prepend : ");
        ll.printLinkedList();
        ll.removeLast();
        System.out.println("Linked List removeLast : ");
        ll.printLinkedList();
        ll.removeFirst();
        System.out.println("Linked List removeFirst : ");
        ll.printLinkedList();
        System.out.println("Linked List get 2 :" + ll.get(2).data);
        ll.insert(1,8);
        System.out.println("Linked List insert at index 1 : ");
        ll.printLinkedList();
        ll.remove(2);
        System.out.println("Linked List remove at index 2 : ");
        ll.printLinkedList();
        ll.reverseLinkedList();
        System.out.println("Linked List reverse Linked List : ");
        ll.printLinkedList();
        System.out.println("Linked List get Mid Node :" + ll.getMidNode().data);
        System.out.println("Linked List get 1 Node from last :" + ll.kthElementFromEnd(1).data);
    }
}