public class AtPosK {
    public static class Node{
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
        newN.next= Head;
        Head=newN;
    }

    public static void addPos(int data, int k) {
    Node newNode = new Node(data);

    if (k == 0) {
        newNode.next = Head;
        Head = newNode;
        return;
    }

    Node temp = Head;
    int count = 0;

    while (temp != null && count < k - 1) {
        temp = temp.next;
        count++;
    }

    if (temp == null) {
        System.out.println("Position out of bounds");
        return;
    }

    newNode.next = temp.next;
    temp.next = newNode;
}

    public static void printLl(){
        if(Head==null){
            System.out.println("This is an empty ll");
            return;
        }
        Node temp=Head;
        while(temp.next!=null){
            System.out.print(temp.data+" -> ");
            temp=temp.next;
        }
    }

    public static void main(String args[]){
        addNode(0);
        addNode(1);
        addNode(2);
        addNode(3);
        addNode(4);
        printLl();
        addPos(69, 3);
        System.out.println();
        printLl();
    }
}
