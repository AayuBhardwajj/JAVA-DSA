package Ll;

public class Rem {
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
    public static int size;

    public void addFrmFr(int data){
        Node newN= new Node(data);
        size++;
        if(Head==null){
            Head=Tail=newN;
            return;
        }
        newN.next=Head;
        Head=newN;
    }
    public void addFrmBck(int data){
        Node newN= new Node(data);
        size++;
        if(Head==null){
            Head=Tail=newN;
        }
        Tail.next=newN;
        Tail=newN;
    }
    public void addAnywhere(int data, int index){
        if(index==0){
            addFrmFr(data);
            return;
        }
        int i=0;
        Node temp=Head;
        Node newN= new Node(data);
        while(i<index-1){
            temp=temp.next;
            i++;
        }
        newN.next=temp.next;
        temp.next=newN;
    }
    public int remFrmFrnt(){
        if(size==0){
            System.out.println("No element found");
            return Integer.MAX_VALUE;
        } else if(size==1){
            int val=Head.data;
            Head=Tail=null;
            size=0;
            return val;
        }
        int val=Head.data;
        Head=Head.next;
        size--;
        return val;
    }
    public void printLT(){
        if(Head==Tail && Tail==null){
            System.out.println("No element found");
        }
        Node temp= Head;
        while(temp!=null){
        System.out.print(temp.data+"--->");    
        temp=temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args){
        Rem ll= new Rem();
        ll.addFrmFr(1);
        ll.printLT();
        ll.addFrmBck(2);
        ll.printLT();
        ll.addFrmBck(3);
        ll.printLT();
        ll.remFrmFrnt();
        ll.printLT();
        ll.remFrmLst();
        ll.printLT();
    }
    public void remFrmLst(){
        if(size==0){
            System.out.println("No nodes found");
            return ;
        }
        else if(size==1){
            int temp=Head.data;
            Head=Tail=null;
            size=0;
        }
        Node prev= Head;
        for(int i=0;i<size-2;i++){
            prev=prev.next;
        }
        prev.next=null;
        Tail=prev;
    }
}
