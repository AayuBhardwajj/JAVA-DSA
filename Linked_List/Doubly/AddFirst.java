import java.util.*;

public class AddFirst {
    public static class Node {
        int data;
        Node next;
        Node prev;
        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    public static Node Head;
    public static Node Tail;

    public static void addFirst(int data) {
        Node newN = new Node(data);
        if (Head == null && Tail == null) {
            Head = Tail = newN;
            return;
        }
        newN.next = Head;
        Head.prev = newN;
        Head = newN;
    }

    public static void addLast(int data) {
        Node newN = new Node(data);
        if (Head == null && Tail == null) {
            Head = Tail = newN;
            return;
        }
        Tail.next = newN;
        newN.prev = Tail;
        Tail = newN;
    }

    public static void printList() {
        Node temp = Head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        addFirst(10);
        addFirst(20);
        addFirst(30);
        addLast(40);
        addLast(50);
        printList();
    }
}
