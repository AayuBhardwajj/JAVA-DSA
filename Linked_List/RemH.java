package Linked_List;

public class RemH {
    
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

    public static void addNode(int data){
          Node newN= new Node(data);
        if(Head==null){
            Head=Tail=newN;
        }else{
            newN.next=Head;
            Head=newN;
        }
    }

    public static void addT(int data){
        Node newN= new Node(data);
        if(Head==null){
            Head=Tail=newN;
            return;
        }
        Tail.next=newN;
        Tail=newN;
    }
    public static void printNode(){
        Node temp= Head;
        while(temp!=null){
            System.out.print(temp.data+" --> ");
            temp=temp.next;
        }

    }
  
    public static void main(String[] args){
      addNode(10);
      addNode(20);
      addNode(30);
      addT(40);
        printNode();
    }
}
