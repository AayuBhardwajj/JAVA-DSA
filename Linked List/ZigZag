public class ZigZag {
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
    
    public static void printLinkedList(){
        Node temp=Head;
        while(temp!=null){
            System.out.print(temp.data+"-->");
            temp=temp.next;
        }
        System.out.println("null");
    }


    public static void zigzag(){
        // find mid
        Node Slow=Head;
        Node Fast=Head;
        while(Fast!=null && Fast.next!=null){
            Slow=Slow.next;
            Fast=Fast.next.next;
        }
        Node mid=Slow;
        // reverse the second half
        Node prev=null;
        Node curr=mid.next;
        mid.next=null;
        Node next;

        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }

        //zigzag

        Node left=Head;
        Node right=prev;
        Node leftH;
        Node rightH;
        while(left!=null && right!=null){
            leftH=left.next;
            left.next=right;
            rightH=right.next;
            right.next=leftH;

            left=leftH;
            right=rightH;}}
    
    public static void main(String[] args){
        Head = new Node(1);
        Head.next= new Node(2);
        Head.next.next= new Node(3);
        Head.next.next.next= new Node(4);
        Head.next.next.next.next= new Node(5);
        ZigZag ll= new ZigZag();
        System.out.println("Original ll: ");
        ll.printLinkedList();
        ll.zigzag();
        ll.printLinkedList();
    }
}
