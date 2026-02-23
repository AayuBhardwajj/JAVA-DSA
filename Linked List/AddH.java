public class AddH{

public static class Node{
    int data;
    Node next;
        public Node(int data){
        this.data=data;
        this.next=null;
}
}
public static Node Head;
public static Node Tail;

public static void addNodeFromFront(int data){
Node newNode= new Node(data);
if(Head==null){
Head=Tail=newNode;
return;
}
newNode.next=Head;
Head=newNode;
}
 public static void printList() {
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

public static void main(String args[]){
addNodeFromFront(1);
addNodeFromFront(2);
printList();
}
}
