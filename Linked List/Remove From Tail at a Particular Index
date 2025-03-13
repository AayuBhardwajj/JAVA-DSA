public class RevmFrmLast {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }}
    public static Node Head;
    public static Node Tail;
    
    public void remFromLast(int index){
        int sz=0;
        int i=1;
        Node temp=Head;
        while(temp!=null){
            temp=temp.next;
            sz++;}

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
        return;}}
    
   

