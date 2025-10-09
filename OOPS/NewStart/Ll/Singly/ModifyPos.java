
import java.util.*;

public class ModifyPos {
    public static class  Node{
        int data;
        Node next;

        public Node(int data) {
            this.data=data;
            this.next=null;
        }

    }
    public static Node Head;
    public static Node Tail;
    public static int size;

    public void addFromFront(int data){
        Node newNn= new Node(data);
        size++;
        if(Head==null){
            Head=Tail=newNn;
            return;
        }
        newNn.next=Head;
        Head=newNn;
    }
    public void addFromBack(int data){
        Node newNp= new Node(data);
        size++;
        if(Head==null){
            Head=Tail=newNp;
            return;
        }
        Tail.next=newNp;
        Tail=newNp;
    }
    public void prntY(){
        if(Head== null && Tail==null){
            System.out.println("No element found");
            return;
        }
        Node temp=Head;
        while(temp!=null){
            System.out.print(temp.data+" -->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public int findData(int x){
        if(x>=size){
            System.out.println("Nodes in this linked list are lesser than the index provided");
            return -1;
        }
        Node temp=Head;
        int i=0;
        while(i<x){
            temp=temp.next;
            i++;
        }
        return temp.data;
    }

    public int updateAtPos(int x, int dy){
        if(x> size || x<0){
            System.out.println("Invalid position");
            return -1;
        }
        int i=0;
        Node temp=Head;
        while(i<x){
            temp=temp.next;
            i++;
        }
        temp.data=dy;
        return dy;
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        ModifyPos ll = new ModifyPos();
        ll.prntY();
        ll.addFromFront(1);
        ll.prntY();
        ll.addFromBack(2);
        ll.prntY();
        ll.addFromBack(3);
        ll.prntY();
        System.out.println("Enter the position of node whose data you wanna find out: ");
        int x= s.nextInt();
        System.out.println("data found at position "+x+" is :" + ll.findData(x));
        System.out.println("Enter the position where you wanna update the value: ");
        int pos=s.nextInt();
        System.out.println("Enter the updated value: ");
        int vl=s.nextInt();
        System.out.println(ll.updateAtPos(pos, vl));
        ll.prntY();

    }
}
