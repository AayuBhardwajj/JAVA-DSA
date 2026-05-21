package Linked_List;
public class Basics{

    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    public static Node Head;

    public static void main(String[] args){
        Node newN= new Node(10);
        if(Head==null){
            Head=newN;

        }else{
        newN.next=Head;
        Head=newN;
    }
    System.out.println(Head.data);
}
}