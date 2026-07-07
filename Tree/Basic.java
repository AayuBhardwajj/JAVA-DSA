
public class Basic {
    static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data=data;
    }  
    }

    static Node root;
    public static void insert(int data){
        
        if(root==null){
            root=new Node(data);
            return;
        }
        root=insertRec(root,data);
    }
    public static Node insertRec(Node root, int data){
        if(root==null)
            return new Node(data);

        if(data<root.data){
            root.left=insertRec(root.left, data);
        }else{
            root.right=insertRec(root.right, data);

        }
        return root;
    }

    public static void preOrder(Node root){
        if(root!=null){
            System.out.print(root.data+" ");
            preOrder(root.left);
            preOrder(root.right);
        }else{
            return;
        }
    }

    public static void inOrder(Node root){
        if(root!=null){
            inOrder(root.left);
            System.out.print(root.data+" ");
            inOrder(root.right);
        }else{
            return;
        }
    }

    public static void postOrder(Node root){
        if(root!=null){
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data+" ");
        }else{
            return;
        }
    }

    public static void main(String[] args) {
        Basic tree=new Basic();
        insert(50);
        insert(30);
        insert(20);
        insert(40);
        insert(70);
        insert(60);
        insert(80);
        System.out.println("Pre-Order Traversal");
        preOrder(root);
        System.out.println();
        System.out.println("Post-Order Traversal");
        postOrder(root);
        System.out.println();
        System.out.println("InOrder Traversal");
        inOrder(root);
    }
}
            