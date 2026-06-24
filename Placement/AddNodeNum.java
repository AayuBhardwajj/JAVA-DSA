package Placement;

public class AddNodeNum {
    static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node Head;

    public static void addNode(int data){
        Node newN= new Node(data);
        if(Head==null){
            Head=newN;
        }
        newN.next=Head;
        Head=newN;
    }
    public static void addLlNums(Node l1, Node l2){
        int ans=0;
        int carry=0;
        while(l1!=null && l2!=null){
            if(l1!=null){
                ans+=l1.data;
                l1=l1.next;
            }
             if(l2!=null){
                ans+=l2.data;
                l2=l2.next;
            }
        }
        addNode(ans);
        addNode(carry);


    }
    public static void main(String[] args) {
        addNode();
    }
}
