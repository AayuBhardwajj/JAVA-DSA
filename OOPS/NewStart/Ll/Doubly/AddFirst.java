
public class AddFirst {
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

    

    public static void addFirst(int data){
        Node newN= new Node(data);
        if(Head==null && Tail==null){
            Head=Tail=newN;
            return;
        }
        newN.next=Head;
        Head.prev=newN;
        Head=newN;
    }
    public static void addLast(int data){
        Node newN= new Node(data);
        if(Head==null && Tail==null){
            Head=Tail=newN;
            return;
        }
        Tail.next=newN;
        newN.prev=Tail;
        Tail= newN;
    }
    public static void printTheLinkedList(){
        Node temp=Head;
        while(temp!=null){
            System.out.print(temp.data+"<-->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public static void removeFront(){
        if(Head==null && Tail==null){
            System.out.println("No nodes found");
        }
        Head=Head.next;
        Head.prev=null;
    }
    public static void removeLast(){
        if(Head==null && Tail==null){
            System.out.println("No nodes found");
        }
        Tail=Tail.prev;
        Tail.next=null;
    }
    public static void main(String[] args){
        AddFirst ll= new AddFirst();
        ll.addFirst(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.printTheLinkedList();
        //ll.removeFront();
        ll.removeLast();
        ll.printTheLinkedList();
    }
}
