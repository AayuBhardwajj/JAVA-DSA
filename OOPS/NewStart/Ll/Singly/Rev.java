public class Rev {
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

    public void addFrnt(int data){
        Node newNo= new Node(data);
        if(Head==null && Tail==null){
            Head=Tail=newNo;
            return;
        }
        newNo.next=Head;
        Head=newNo;
    }
    public void addBck(int data){
        Node newNo= new Node(data);
        if(Head==null && Tail==null){
            Head=Tail=newNo;
            return;
        }
        Tail.next=newNo;
        Tail=newNo;
    }
    public void printThis(){
        if(Head==null && Tail==null){
            System.out.println("No nodes found in the memory");
            return;
        }
        Node temp=Head;
        while(temp!=null){
            System.out.print(temp.data+"----->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public void reverse(){
        Node prev=null;
        Node curr=Tail=Head;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        Head=prev;
    }
    public static void main(String[] args){
        Rev ll= new Rev();
        ll.addFrnt(1);
        ll.addBck(2);
        ll.addBck(3);
        ll.addBck(4);
        ll.addBck(5);
        ll.printThis();
        ll.reverse();
        ll.printThis();
    }
}
