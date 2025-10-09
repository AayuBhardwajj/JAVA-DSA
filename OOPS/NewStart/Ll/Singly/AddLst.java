

public class AddLst {
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
       
    }
    }
    public static Node Tail;
    public static Node Head;

        public static void addT(int data){
            Node newNode= new Node(data);
            if(Tail==null){
                Tail=Head=newNode;
                return;
            }
            Tail.next=newNode;
            Tail=newNode;
        }
        public static void main(String args[]){
            AddLst ll= new AddLst();
            addT(1);
            addT(2);
        }
    
}
