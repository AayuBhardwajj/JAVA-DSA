package Placement;

public class Sort012 {
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

    public static void printLl(){
        Node temp=Head;
        while(temp!=null){
            System.out.print(temp.data+"-->");
            temp=temp.next;
        }
        System.out.print("null");
    }

    public static void SortNodeso12(){
        Node zeroN= new Node(-1);
        Node zeroC= zeroN;
        Node oneN= new Node(-1);
        Node oneC= oneN;
        Node twoN= new Node(-1);
        Node twoC= twoN;

        Node temp=Head;
        while(temp!=null){
            Node next=temp.next;
            temp.next=null;
            if((temp.data)==0){
                zeroC.next=temp;
                zeroC= zeroC.next;
            }else if((temp.data)==1){
                oneC.next=temp;
                oneC= oneC.next;
            } else{
                twoC.next=temp;
                twoC= twoC.next;
            }
            temp=next;
        }
        if(zeroN.next==null){
            oneC.next=twoN.next;
            twoC.next=null;
        }else if(oneN.next==null){
            zeroC.next=twoN.next;
            twoC.next=null;
        }else if(twoN.next==null){
            zeroC.next=oneN.next;
            oneC.next=null;
        }else{
            zeroC.next=oneN.next;
            oneC.next=twoN.next;
            twoC.next=null;
        }
        if(zeroN.next!=null){
            Head=zeroN.next;
        }else if(oneN.next!=null){
            Head=oneN.next;
        }else{
            Head=twoN.next;
        }

    }
    public static void main(String[] args) {
        addNode(2);
        addNode(1);
        addNode(0);
        addNode(2);
        addNode(1);
        addNode(0);

        System.out.println();
        System.out.println("Befoe sorting: ");
        printLl();
        System.out.println();
        System.out.println("After sorting");
        SortNodeso12();
        printLl();
    }
}
