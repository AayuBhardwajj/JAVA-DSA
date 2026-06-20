package Placement;

public class LoopLength {
    static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node Head;
    public static int lengthOfLoop(){
        Node slow=Head;
        Node fast=Head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;

            if(slow==fast){
                Node temp=slow.next;
                int count=1;
                while(slow!=temp){
                    count++;
                    temp=temp.next;
                }
                return count;
            }
        }
        return 0;

    }

    public static void addNode(int data){
        Node newN= new Node(data);
        if(Head==null){
            Head=newN;
            return;
        }
        newN.next=Head;
        Head=newN;
    }

    public static void main(String args[]){
         Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Head = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n2;   
        System.out.println(lengthOfLoop());
    }
}
