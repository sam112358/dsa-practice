package main.java.com.samarth.revision.two;

import main.java.com.samarth.javatutorial.TreeNode;

public class InvertBinaryTree {
    public static void main(String[] args) {
        InvertBinaryTree sol = new InvertBinaryTree();
        TreeNode root = new TreeNode(4, new TreeNode(2, new TreeNode(1), new TreeNode(3)), new TreeNode(7, new TreeNode(6), new TreeNode(9)));
        root.printTree();
        TreeNode invertTree = sol.invertTree(root);
        invertTree.printTree();
    }

    public TreeNode invertTree(TreeNode root) {
        if (root == null)
            return null;
        TreeNode top = root;
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        invertTree(root.left);
        invertTree(root.right);
        return top;
    }
}
