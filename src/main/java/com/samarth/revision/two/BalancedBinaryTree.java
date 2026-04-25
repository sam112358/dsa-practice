package main.java.com.samarth.revision.two;

import main.java.com.samarth.javatutorial.TreeNode;

public class BalancedBinaryTree {
    public static void main(String[] args) {
        BalancedBinaryTree sol = new BalancedBinaryTree();
        TreeNode root = new TreeNode(1,
                new TreeNode(2,
                        new TreeNode(3,
                                new TreeNode(4),
                                new TreeNode(4)
                        ),
                        new TreeNode(3)
                ),
                new TreeNode(2)
        );
        System.out.println(sol.isBalanced(root));
    }

    public boolean isBalanced(TreeNode root) {
        if (root == null) return true;
        if (height(root) == -1) return false;

        return true;
    }

    public int height(TreeNode root) {
        if (root == null) return 0;

        int lheight = height(root.left);
        int rheight = height(root.right);

        if (lheight == -1 || rheight == -1) return -1;
        if (Math.abs(lheight - rheight) > 1) return -1;

        return Math.max(lheight, rheight) + 1;
    }
}
