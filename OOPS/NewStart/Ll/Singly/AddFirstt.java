public class AddFirstt{
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
       
         public void addFirst(int data){
            Node newNode= new Node(data);
            if(Head==null){
                Head=Tail=newNode;
                return;
            }
            newNode.next=Head;
            Head=newNode;
         }
         
        
         public static void main(String args[]){
            AddFirstt ll= new AddFirstt();
            ll.addFirst(1);
            ll.addFirst(2);
         }
        
        }

