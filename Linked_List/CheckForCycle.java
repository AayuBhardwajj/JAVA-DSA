public class CheckForCycle {
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

    public static boolean cycleCheck(){
        Node Slow=Head;
        Node Fast=Head;
        while(Fast!=null && Fast.next!=null){
            Slow=Slow.next;
            Fast= Fast.next.next;

            if(Slow==Fast){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args){
        Head= new Node(1);
        Head.next= new Node(2);
        Head.next.next= new Node(3);
        Head.next.next.next=Head;
        System.out.println(cycleCheck());
    }
}
