public class NewCode {
    public static class Node {
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node Head;
    public static Node Tail;

    // Insert at beginning
    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        if (Head == null) {
            Head = Tail = newNode;
            return;
        }
        newNode.next = Head;
        Head = newNode;
    }

    // Insert at end
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (Head == null) {
            Head = Tail = newNode;
            return;
        }
        Tail.next = newNode;
        Tail = newNode;
    }

    // Delete at beginning
    public void deleteAtBeginning() {
        if (Head == null) {
            System.out.println("List is empty!");
            return;
        }
        Head = Head.next;
        if (Head == null) {  // if list became empty
            Tail = null;
        }
    }

    // Delete at end
    public void deleteAtEnd() {
        if (Head == null) {
            System.out.println("List is empty!");
            return;
        }
        if (Head.next == null) {  // only one node
            Head = Tail = null;
            return;
        }
        Node temp = Head;
        while (temp.next != Tail) {
            temp = temp.next;
        }
        temp.next = null;
        Tail = temp;
    }

    // Print linked list
    public void printList() {
        if (Head == null) {
            System.out.println("List is empty!");
            return;
        }
        Node temp = Head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Main function to test
    public static void main(String[] args) {
        NewCode list = new NewCode();

        list.insertAtBeginning(10);
        list.insertAtBeginning(20);
        list.insertAtEnd(30);
        list.insertAtEnd(40);
        System.out.println("Printing the linked list formed: ");
        list.printList();  // 20 -> 10 -> 30 -> 40 -> null

        list.deleteAtBeginning();
        System.out.println("List after deleting at beginning: ");
        list.printList();  // 10 -> 30 -> 40 -> null

        list.deleteAtEnd();
        System.out.println("List after deleting at end: ");
        list.printList();  // 10 -> 30 -> null
    }
}
