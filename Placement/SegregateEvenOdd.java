package Placement;

public class SegregateEvenOdd {
    static class Node{
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
            return;
        }
        Tail.next=newN;
        Tail=newN;
    }
    public static void segNode(){
        Node evenN= new Node(0);
        Node evenC=evenN;
        Node oddN= new Node(0);
        Node oddC= oddN;

        Node temp=Head;
        while(temp!=null){
            Node next=temp.next;
            if((temp.data)%2==0){
                evenC.next=temp;
                evenC=evenC.next;
            }else{
                 oddC.next=temp;
                oddC=oddC.next;
            }
            temp= next;
        }

        evenC.next= oddN.next;
        oddC.next=null;

        Head=evenN.next;
    }

    public static void printLL(){
        Node temp=Head;
        while(temp!=null){
            System.out.print(temp.data+"-->");
            temp=temp.next;
        }
    }
    public static void main(String[] args) {
        addNode(1);
        addNode(2);
        addNode(3);
        addNode(4);
        addNode(5);

        printLL();
        segNode();
        System.out.println();
        printLL();
    }
}
