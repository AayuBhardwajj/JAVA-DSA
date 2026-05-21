package Linked_List;

public class InsTail {
    public static class Node{
        int data;
        Node next;
        
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node Tail;

    public static void main(String[] args){
        Node newN= new Node(10);
        if(Tail==null){
            Tail=newN;
        }else{
            Tail.next=newN;
            Tail=newN;
        }
        System.out.println(Tail.data);
    }
}
