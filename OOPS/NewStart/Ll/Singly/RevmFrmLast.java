public class RevmFrmLast {
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

    public void addfrFnt(int data){
        Node newN= new Node(data);
        if(Head==null && Tail== null){
            Head=Tail=newN;
            return;
        }
        newN.next=Head;
        Head=newN;
    }
    public void addfrBck(int data){
        Node newN= new Node(data);
        if(Head==null && Tail== null){
            Head=Tail=newN;
            return;
        }
        Tail.next=newN;
        Tail=newN;
    }
    public void printLL(){
        if(Head==null && Tail== null){
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
    public void remFromLast(int index){
        int sz=0;
        int i=1;
        Node temp=Head;
        while(temp!=null){
            temp=temp.next;
            sz++;
        }

        if(index==sz){
            Head=Head.next;
            return;
        }

        int toF=sz-index;
        Node prev=Head;
        
        while(i<toF){
            prev=prev.next;
            i++;
        }
        prev.next=prev.next.next;
        return;
    }
    public static void main(String[] args){
        RevmFrmLast ll= new RevmFrmLast();
        ll.addfrFnt(1);
        ll.addfrBck(2);
        ll.addfrBck(3);
        ll.addfrBck(4);
        ll.addfrBck(5);
        ll.printLL();
        ll.remFromLast(3);
        ll.printLL();
    }
}
