
public class PrintRev {
    public static class Node{
        int data;
        Node next;
        Node prev;

        public Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }

    public static Node Head;
    public static Node Tail;

    public void addFromFront(int data){
        Node newN= new Node(data);
        if(Head==null && Tail==null){
            Head=Tail=newN;
            return;
        }
        newN.next=Head;
        Head.prev=newN;
        Head=newN;
    }
    public void addFromBack(int data){
        Node newN= new Node(data);
        if(Head==null && Tail==null){
            Head=Tail=newN;
            return;
        }
        Tail.next=newN;
        newN.prev=Tail;
        Tail=newN;
    
    }
    public void printLl(){
        Node temp=Head;
        if(temp==null){
            System.out.println("No elements found");
            return;
        }
        System.out.print("null<-->");
        while(temp!=null){
            System.out.print(temp.data+"<-->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public void reversePrint(){
        Node temp=Tail;
        if(temp==null){
            System.out.println("No elements found");
            return;
        }
        System.out.print("null<-->");
        while(temp!=null){
            System.out.print(temp.data+"<-->");
            temp=temp.prev;
        }
        System.out.println("null");
    }
    public static void main(String[] args){
        PrintRev ll= new PrintRev();
        ll.addFromFront(1);
        ll.addFromBack(2);
        ll.addFromBack(3);
        ll.addFromBack(4);
        ll.addFromBack(5);
        ll.printLl();
        ll.reversePrint();
    }
}
