public class RemCycle {
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

    public static boolean findCycle(){
        Node Slow=Head;
        Node Fast=Head;
        while(Fast!=null && Fast.next!=null){
            Slow=Slow.next;
            Fast=Fast.next.next;
            if(Slow==Fast){
                return true;
            }
        }
        return false;
    }
    
    public static void removeCycle(){
        Node Slow= Head;
        Node Fast= Head;
        while(Fast!=null && Fast.next!=null){
            Slow= Slow.next;
            Fast=Fast.next.next;

            if(Fast==Slow){
                break;
            }
        }
        Slow=Head;
        Node prev=null;
        while(Slow!=Fast){
            Slow=Slow.next;
            Fast=Fast.next;
            prev=Fast;
        }
        prev.next=null;
    }
    
    public static void main(String[] args){
        Head= new Node(1);
        Head.next= new Node(2);
        Node temp= Head.next;
        Head.next.next= new Node(3);
        Head.next.next.next= new Node(4);
        Head.next.next.next.next=temp;
        System.out.println(findCycle());
        removeCycle();

        System.out.println(findCycle());
        
    }
}

