public class Delete {
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }
        public static Node Head;
    }
        public static void main(String args[]){
            Node Head= new Node(1);
            Head.next=new Node(2);
            Head.next.next= new Node(3);
            Head.next.next.next=new Node(0);
            System.out.println("Before deleting");
            printNode(Head);

            Head=null;
            System.out.println("After deleting");
            printNode(Head);
        }
        public static void printNode(Node Head){
            if(Head==null){
                System.out.println("Nothing found");
            }

            Node temp=Head;
            while(temp!=null){
                System.out.print(temp.data+"-->");
                temp=temp.next;
            }
        }
    }

