package Placement;

public class ReverseLl2 {
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

    public static Node reverseLl(int left, int right){
        Node dummy= new Node(0);
        Node dummycount=dummy;
        dummy.next=Head;

        Node prev=dummy;
        for(int i=1;i<left;i++){
            prev=prev.next;
        }

        Node curr=prev.next;

        for(int i=0;i<right-left;i++){
            Node next=curr.next;
            curr.next=next.next;
            next.next=prev.next;
            prev.next=next;
        }
        return dummy.next;
    }

    public static void printLl(){
        Node temp=Head;
        while(temp!=null){
            System.out.print(temp.data+"-->");
            temp=temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        addNode(1);
        addNode(2);
        addNode(3);
        addNode(4);

        printLl();

        Head= reverseLl(2, 4);
        printLl();
    }
}
