package main.java.com.samarth.revision.two;

import main.java.com.samarth.javatutorial.TreeNode;

public class MaximumDepthOfBinaryTree {
    public static void main(String[] args) {
        MaximumDepthOfBinaryTree sol = new MaximumDepthOfBinaryTree();
        TreeNode root = new TreeNode(3, new TreeNode(9, new TreeNode(20), new TreeNode(15)), new TreeNode(7));
        System.out.println(sol.maxDepth(root));
    }

    public int maxDepth(TreeNode root) {
        return calculateDepth(root);
    }

    private int calculateDepth(TreeNode root) {
        if (root == null)
            return 0;
        return Math.max(calculateDepth(root.right), calculateDepth(root.left)) + 1;
    }
}
