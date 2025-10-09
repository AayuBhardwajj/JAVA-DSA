public class Palindrome {
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

    public void addFromFront(int data){
        Node newN= new Node(data);
        if(Head==null && Tail==null){
            Head=Tail=newN;
        }
        newN.next=Head;
        Head=newN;
    }
    public void addFromBack(int data){
        Node newN= new Node(data);
        if(Head==null && Tail==null){
            Head=Tail=newN;
        }
        Tail.next=newN;
        Tail=newN;
    }
    public void printTheLinkedList(){
        if(Head==null && Tail==null){
            System.out.println("No nodes found");
            return;
        }
        Node temp=Head;
        while(temp!=null){
            System.out.print(temp.data+"-->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public Node findMidNode(){
        Node Fast=Head;
        Node Slow=Head;
        while(Fast!=null && Fast.next!=null){
            Fast=Fast.next.next;
            Slow=Slow.next;
        }
        return Slow;
    }
    public boolean checkPalindrome(){
        if(Head==null || Head.next==null){
            return true;
        }
        Node mid=findMidNode();

        Node prev=null;
        Node curr=mid;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        Node left=Head;
        Node right=prev;

        while(right!=null){
            if(right.data!=left.data){
                return false;
            }
            right=right.next;
            left=left.next;
        }
        return true;
    }
    public static void main(String[] args){
        Palindrome ll= new Palindrome();
        ll.addFromFront(1);
        ll.addFromBack(2);
        ll.addFromBack(2);
        ll.addFromBack(1);
        ll.printTheLinkedList();
        System.out.println(ll.checkPalindrome());
    }
}
