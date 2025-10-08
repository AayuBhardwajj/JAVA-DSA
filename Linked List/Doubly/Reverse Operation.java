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
}
