// package NewStart.Stack;

// public class LinkL {
//     static class Node{
//         int data;
//         Node next;

//         public Node(int data){
//             this.data=data;
//             this.next=null;
//         }
//     }
//     public static Node Head;

//     public static boolean isEmpty(){
//         return Head==null;
//     }

//     public static void push(int data){
//         Node newN= new Node(data);
//         if(isEmpty()){
//             Head=newN;
//             return;
//         }
//         newN.next=Head;
//         Head=newN;
//     }
//     public static int pop(){
//         if(isEmpty()){
//             return -1;
//         }
//         int da=Head.data;
//         Head=Head.next;
//         return da;
//     }
    
//     public static int peek(){
//         if(isEmpty()){
//             return -1;
//         }
//         return Head.data;
//     }

//     public static void main(String[] args){
//         LinkL ll= new LinkL();
//         ll.push(1);
//         ll.push(2);
//         ll.push(3);
//         while(!isEmpty()){
//             System.out.println(ll.peek());
//             ll.pop();
//         }
//     }
// }


package Stack;

public class LinkL{
    static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    private Node Head;

    public boolean isEmpty(){
        return Head==null;
    }

    public void push(int data){
        Node newN= new Node(data);
        if(isEmpty()){
            Head=newN;
            return;
        }
        newN.next=Head;
        Head=newN;
    }

    public int pop(){
        if(isEmpty()){
            return -1;
        }
        int x=Head.data;
        Head=Head.next;
        return x;
    }

    public int peek(){
        if(isEmpty()){
            return -1;
        }
        int x=Head.data;
        return x;
    }

    public void printStack(){
        if(isEmpty()){
            System.out.println("No elements found");
            return;
        }
        Node temp=Head;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }

    
    public static void main(String[] args){
        LinkL xx= new LinkL();
        LinkL xx1= new LinkL();
        xx.push(1);
        xx.push(2);
        xx.push(3);

        while(xx.isEmpty()==true){
            System.out.println(xx.peek());
            xx.pop();
        }

        xx1.push(65);
        xx1.push(66);
        xx1.push(69);

        xx.printStack();
        System.out.println();
        xx1.printStack();        
    }
}