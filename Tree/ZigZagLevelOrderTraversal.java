import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;;

public class ZigZagLevelOrderTraversal {
    static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data=data;
        }
    }
    static Node root;

    public static void addNode(int data){
        if(root==null){
            root= new Node(data);
            return;
        }
        root= insertNode(root, data);
    }
    public static Node insertNode(Node root, int data){
        if(root==null){
            return new Node(data);
        }
        if(data<root.data){
            root.left=insertNode(root.left, data);
        }
        if(data>root.data){
            root.right=insertNode(root.right, data);
        }
        return root;
    }

    public static ArrayList<ArrayList<Integer>> zigZag(Node root){
        ArrayList<ArrayList<Integer>> mn= new ArrayList<>();
        if(root==null){
            return mn;
        }
        Queue<Node> q= new LinkedList<>();
        q.offer(root);
        boolean leftToRight=true;
        while(!q.isEmpty()){
            ArrayList<Integer>subOrdinate= new ArrayList<>();
            int size=q.size();
            for(int i=0;i<size;i++){
                Node curr= q.poll();
                if(!leftToRight){
                subOrdinate.add(curr.data);
                }else{
                    subOrdinate.add(0, curr.data);
                }
                if(curr.left!=null){
                    q.offer(curr.left);
                }
                 if(curr.right!=null){
                    q.offer(curr.right);
                }
            }
            mn.add(subOrdinate);
             leftToRight=!leftToRight;
        }
        return mn;
    }

    public static void main(String[] args){
        addNode(1);
        addNode(2);
        addNode(3);
        addNode(4);
        addNode(5);
        addNode(6);
        addNode(7);

        System.out.println(zigZag(root));
    }
}
