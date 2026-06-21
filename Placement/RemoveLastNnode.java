package Placement;

public class RemoveLastNnode {
    static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node Head;
    public static void addNode(int data){
        Node newN= new Node(data);
        if(Head==null){
            Head=newN;
            return;
        }
        newN.next=Head;
        Head=newN;
    }
    public static void printLl(){
        if(Head==null){
            System.out.println("No nodes found");
        }
        Node temp=Head;
        while(temp!=null){
            System.out.print(temp.data+"-->");
             temp=temp.next;
        }
        System.out.print("null");
       
    }

    public static void removeN(int n){
        Node slow=Head;
        Node fast=Head;
        for(int i=0;i<n;i++){
            fast=fast.next;
        }

        if(fast==null){
        Head=Head.next;
        }
        while(fast.next!=null){
            fast=fast.next;
            slow=slow.next;
        }
        slow.next=slow.next.next;
    }
    public static void main(String[] args) {
        addNode(1);
        addNode(2);
        addNode(3);
        addNode(4);
        addNode(5);
        int n=3;
        printLl();
        System.out.println();
        removeN(n);
        printLl();
    }
}
