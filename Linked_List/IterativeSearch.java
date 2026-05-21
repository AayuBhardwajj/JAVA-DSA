import java.util.*;
public class IterativeSearch {
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
    

    public static void iterate(int s){
        Node temp=Head;
        int i=0;
        if(Head==null){
            System.out.println("Data can't be found");
            return;
        }
        while(temp!=null){
            if(temp.data==s){
                System.out.println("FOund at position: "+i);
                return;
            }
            temp=temp.next;
            i++;
        }
        System.out.println("data value "+s+" doesn't exists in the existing nodes");
    }

    public static void addNode(int data){
        Node newH= new Node(data);
        if(Head==null){
            Head=newH;
            return;
        }
        newH.next=Head;
        Head=newH;
    }

    public static void printll(){
        if(Head==null){
            System.out.println("No nodes exist");
            return;
        }
        Node temp=Head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }

    public static void main(String args[]){
        addNode(0);
        addNode(1);
        addNode(2);
        addNode(3);
        printll();

        iterate(1);
    }
}
   

