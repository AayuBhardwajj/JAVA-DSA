package Placement;

public class Palindromell {
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
            return;
        }
        newN.next=Head;
        Head=newN;

    }
    public static void isPalindrome(){
        Node slow=Head;
        Node fast=Head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        Node mid=slow;

        Node curr=mid;
        Node prev=null;
        while(curr!=null){
            Node next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }

        Node temp1=Head;
        Node temp2=prev;

        while(temp2!=null){
            if(temp1.data!=temp2.data){
                System.out.println("Not palindrome");
                return;
            }
            temp1=temp1.next;
            temp2=temp2.next;
           
        }
         System.out.println("It is a palindrome");
    }

    public static void main(String[] args) {
        addNode(3);
        addNode(7);
        addNode(5);
        addNode(7);
        addNode(3);
        isPalindrome();
    }
    }

