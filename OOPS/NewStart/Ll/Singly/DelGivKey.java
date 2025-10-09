import java.util.*;
public class DelGivKey {
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

    public void addFrF(int data){
        Node newN= new Node(data);
        if(Head==null && Tail==null){
            Head=Tail=newN;
            return;
        }
        newN.next=Head;
        Head=newN;
    }
    public void addFrB(int data){
        Node newN= new Node(data);
        if(Head==null && Tail== null){
            Head=Tail=newN;
            return;
        }
        Tail.next= newN;
        Tail=newN;
    }

    public void printLl1(){
       if(Head==null && Tail== null){
        System.out.println("No node exists");
       }
        Node temp=Head;
        while(temp!=null){
            System.out.print(temp.data+"--->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public void delParticularData(int x){
        if(Head==null){
            System.out.println("Data not found");
        } else if(Head.data==x){
            Head=Head.next;
            if(Head==null){
                Tail=null;
            }
            return;
        }
        
        Node temp=Head;

        Node prev=null;
       
        while(temp!=null && temp.data!=x){
            temp= temp.next;
            prev=temp;
        }
        if(temp==null){
            System.out.println("Data not found");
            return;
        }

        if(temp== Tail){
            Tail=prev;
        }
        prev.next=temp;

    }
    public static void main(String[] args){
        Scanner s= new Scanner(System.in);
        DelGivKey ll= new DelGivKey();
        ll.printLl1();
        ll.addFrF(1);
        ll.printLl1();
        ll.addFrB(2);
        ll.printLl1();
        ll.addFrB(3);
        ll.printLl1();
        ll.addFrB(4);
        ll.printLl1();
        System.out.println("Enter the data you wanna find out: ");
        int val=s.nextInt();
        ll.delParticularData(val);
        ll.printLl1();

    }
}
