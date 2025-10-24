package Stack;

public class StackUsingLl {
    static class Node{
        int data;
        Node next;
        Node (int data){
            this.data=data;
            this.next=null;
        }
    }
    
    static class Stack{
        static Node Head=null;

        public static boolean isEmpty(){
            return Head==null;
        }
        public static void push(int data){
            Node newN= new Node(data);
            if(Head==null){
                
        }
        }
    }
}
