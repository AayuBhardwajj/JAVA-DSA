package Ll;
public class Ly{
public static Node{
    int data;
    Node next;

    public Node(int data){
    this.data=data;
    this.next=null;
    }
}
public static Node head;
public static Node tail;

public void addf(int data){
    Node newNode= new Node(data);
    if(head==null){
        head=tail=newNode;
        return;
    }
    newNode.next=head;
    head=newNode;
}

    public static void main(String[] args) {
        Ly l1= new Ly();
        l1.addf(1);
        l1.addf(2);
    }
}
