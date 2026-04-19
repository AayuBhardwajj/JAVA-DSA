import java.util.*;

public class T1 {
    static class TreeNode {
        int val;
        TreeNode left, right;
        TreeNode(int x) { val = x; }
    }

    static Map<TreeNode, TreeNode> nextMap = new HashMap<>();

    static TreeNode prev = null;

    public static void inorder(TreeNode root) {
        if (root == null) return;

        inorder(root.left);
        if (prev != null) nextMap.put(prev, root);
        prev = root;
        inorder(root.right);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(1);
        root.right = new TreeNode(3);

        inorder(root);
        nextMap.put(prev, null);

        System.out.println("1 -> " + (nextMap.get(root.left) != null ? nextMap.get(root.left).val : "null"));
        System.out.println("2 -> " + (nextMap.get(root) != null ? nextMap.get(root).val : "null"));
        System.out.println("3 -> " + (nextMap.get(root.right) != null ? nextMap.get(root.right).val : "null"));
    }
}

