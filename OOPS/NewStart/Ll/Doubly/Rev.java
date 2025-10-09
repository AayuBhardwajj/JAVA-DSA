package NewStart.Ll.Doubly;

public class Rev {
    public static class Node{
        int data;
        Node prev;
        Node next;

        public Node(int data){
            this.data=data;
            this.prev=null;
            this.next=null;
        }
    }
    public static Node Head;
    public static Node Tail;

    public void addFirst(int data){
        Node newN= new Node(data);
        if(Head==null && Tail==null){
            Head=Tail=newN;
        }
        newN.next=Head;
        Head.prev=newN;
        Head=newN;
    }
    public void addLast(int data){
        Node newN= new Node(data);
        if(Head==null && Tail==null){
            Head=Tail=newN;
        }
        newN.prev=Tail;
        Tail.next=newN;
        Tail=newN;
    }
    public void revLL(){
        Node curr=Head;
        Node next;
        Node prev=null;

        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            curr.prev=next;
            prev=curr;
            curr=next;
        }
        Tail=Head;
        Head=prev;
    }
    public void printLL(){
        Node temp=Head;
        if(temp==null){
            System.out.println("No elements found");
            return;
        }
        while(temp!=null){
            System.out.print(temp.data+"<--->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args){
        Rev ll= new Rev();
        ll.addFirst(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.printLL();
        ll.revLL();
        ll.printLL();
    }
}
