package Placement;
public class ReverseLL{
static class Node{
    int data;
    Node next;

    public Node(int data){
        this.data=data;
        this.next=null;
    }
}
    public static Node Head;
    public static Node Tail;
    public static void main(String[] args){
        addNode(2);
        addNodeFromTail(3);
        addNodeFromTail(4);
        printNode();
    }
    public static void addNode(int data){

        Node newN= new Node(data);
        if(Head == null){
           Head=Tail=newN;
           return; 
        }
        newN.next= Head;
        Head= newN;
    }

    public static void addNodeFromTail(int data){
        Node newN= new Node(data);
        if(Head==null){
            Head=Tail=newN;
            return;
        }
        Tail.next=newN;
        Tail=newN;
    }

    public static void printNode(){
        Node temp=Head;
        while(temp!=null){
            System.out.print(temp.data+"-->");
            temp=temp.next;
        }
       System.out.println("end");
    }
}
