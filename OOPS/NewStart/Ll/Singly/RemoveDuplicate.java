public class RemoveDuplicate {

    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    public static Node Head;

    public static boolean isEmpty(){
        return Head==null;
    }

    public static void addNode(int data){
        Node newN= new Node(data);
        if(Head==null){
            Head=newN;
        }else{
            Head.next=newN;
            Head=newN;
        }
    }
    public static void printtNode(){
        if(isEmpty()){
            System.out.println("No elements found");
        }
         Node temp= Head;
            System.out.print(temp.data+"--->");
            temp=temp.next;
        }
    

    public static void main(String[] args){
        addNode(1);
        addNode(2);
        addNode(3);
        printtNode();
    }
}

