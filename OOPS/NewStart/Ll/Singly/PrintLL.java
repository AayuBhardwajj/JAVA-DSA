public class PrintLL {
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
        public static int size;

        public void addFromFront(int data){
            Node newN= new Node(data);
            size++;
            if(Head==null){
                Head=Tail=newN;
                                return;
            }
            newN.next=Head;
            Head=newN;
        }
        public void addFromBack(int data){
            Node newN= new Node(data);
            size++;
            if(Head==null){
                Head=Tail=newN;
                return;
            }
            Tail.next=newN;
            Tail=newN;
        }
        public void printIn(){
            if(Head==null){
                System.out.println("No data found");
                return;
            }
            Node temp=Head;
            while(temp!=null){
                System.out.print(temp.data+"-->");
                temp=temp.next;
            }
            System.out.println("null");
    }
    public void addNew(int data, int index){
        if(index==0){
            addFromFront(data);
            return;
        }
        Node newNode= new Node(data);
        size++;
        Node temp=Head;
        int i=0;
        while(i<index-1){
            temp=temp.next;
            i++;
        }
        newNode.next=temp.next;
        temp.next=newNode;

    }
    public static void main(String[] args){
        PrintLL ll= new PrintLL();
        ll.printIn();
        ll.addFromFront(1);
        ll.printIn();
        ll.addFromFront(2);
        ll.printIn();
        ll.addFromBack(3);
        ll.printIn();
        ll.addFromBack(4);
        ll.addNew(69, 2);

        ll.printIn();
        System.out.println("Size of the linked list is: "+ll.size);
    }
}
