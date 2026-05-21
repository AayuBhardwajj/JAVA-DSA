import java.util.*;

public class Del {
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

    public static void removeFront() {
        if (Head == null && Tail == null) {
            System.out.println("No nodes found");
            return;
        }
        if (Head == Tail) {
            Head = Tail = null;
            return;
        }
        Head = Head.next;
        Head.prev = null;
    }

    public static void removeLast() {
        if (Head == null && Tail == null) {
            System.out.println("No nodes found");
            return;
        }
        if (Head == Tail) {
            Head = Tail = null;
            return;
        }
        Tail = Tail.prev;
        Tail.next = null;
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
        addLast(30);
        addLast(40);
        System.out.print("List after insertions: ");
        printList();

        removeFront();
        System.out.print("List after removing front: ");
        printList();

        removeLast();
        System.out.print("List after removing last: ");
        printList();
    }
}
