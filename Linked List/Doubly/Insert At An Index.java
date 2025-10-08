public class LinkedList {
    public static class Node{
        int data;
        Node next;
        Node prev;

        public Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }
    public static Node Head;
    public static Node Tail;
    
    public void addFromFront(int data){
        Node newN= new Node(data);
        if(Head==null && Tail==null){
            Head=Tail=newN;
        }
        newN.next=Head;
        Head.prev=newN;
        Head=newN;
    }
    public void addFromBack(int data){
        Node newN= new Node(data);
        if(Head==null && Tail==null){
            Head=Tail=newN;
        }
        Tail.next=newN;
        newN.prev=Tail;
        Tail=newN;
    }
    public void printLl(){
        Node temp=Head;
        if(temp==null){
            System.out.println("No elements found");
            return;
        }
        System.out.print("null<-->");
        while(temp!=null){
            System.out.print(temp.data+"<-->");
            temp=temp.next;
        }
        System.out.println("null");
    }

    public void addNode(int index, int data){
        if(index==0){
            addFromFront(data);
            return;
        }
        Node temp=Head;
        int i=0;

        while(temp!=null && i<index-1){
            temp=temp.next;
            i++;
        }
        if(temp==null && temp.next==null){
            addFromBack(data);
            return;
        }

        Node newN= new Node(data);
        newN.next=temp.next;
        newN.prev=temp;
        temp.next.prev=newN;

        temp.next=newN;
    }
    }
