import java.util.*;
public class IterativeSearch {
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
    
    public static void addFrnt(int data){
        Node newN= new Node(data);
        if(Head==null){
            Head=Tail=newN;
            return;
        }
        newN.next=Head;
        Head=newN;
    }
    public static void addBck(int data){
        Node newN= new Node(data);
        if(Head==null){
            Head=Tail=newN;
            return;
        }
        Tail.next=newN;
        Tail=newN;
    }
    public static void printLl(){
        if(Head==null && Tail== null){
            System.out.println("No element found");
            return;
        }
        Node temp=Head;
        while(temp!=null){
            System.out.print(temp.data+" ----> ");
            temp=temp.next;
        }
        System.out.println("null");
    }

    public static void iterate(int s){
        Node temp=Head;
        int i=0;
        if(Head==null){
            System.out.println("Data can't be found");
            return;
        }
        while(temp!=null){
            if(temp.data==s){
                System.out.println("FOund at position: "+i);
                return;
            }
            temp=temp.next;
            i++;
        }
        System.out.println("data value "+s+" doesn't exists in the existing nodes");
    }
    public static void main(String[] args){
        Scanner s= new Scanner(System.in);
        IterativeSearch ll= new IterativeSearch();
        ll.printLl();
        ll.addFrnt(1);
        ll.printLl();
        ll.addBck(2);
        ll.printLl();
        ll.addBck(3);
        ll.printLl();
        ll.addBck(4);
        ll.printLl();
        System.out.println("Enter the data whose position you wanna find out: ");
        int val=s.nextInt();
        ll.iterate(val);
    }
}

