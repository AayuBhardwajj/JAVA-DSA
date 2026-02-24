public class DelTail{

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

public void AddNode(int data){
    Node newN= new Node(data);
    if(Head==null){
        Head=Tail=newN;
        return;
    }
    newN.next=Head;
    Head=newN;
}
public static void printNode(){
    if(Head==null){
        System.out.println("Linked list is empty");
        return;
    }
    Node temp=Head;
    while(temp!=null){
        System.out.print(temp.data+"-->");
        temp=temp.next;
    }
    System.out.println("end");
}
public static void removeTail(){
    if(Head==null){
        System.out.println("Already an empty linked list");
        return;
    }
    if(Head==Tail){
        Head=Tail=null;
        System.out.println("There existed only one node, that has been deleted successfully");
        return;
    }

    Node temp=Head;
    while(temp.next!=Tail){
        temp=temp.next;
    }
    temp.next=null;
    Tail=temp;

}
public static void main(String[] args) {
    DelTail ll= new DelTail();
    ll.AddNode(0);
    ll.AddNode(1);
    ll.AddNode(2);
    ll.AddNode(3);
    printNode();
    removeTail();
    System.out.println();
    printNode();
}
}