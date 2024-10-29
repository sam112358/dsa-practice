package main.java.com.samarth.javatutorial;

/*
543. Diameter of Binary Tree
Easy
Topics
Companies

Given the root of a binary tree, return the length of the diameter of the tree.

The diameter of a binary tree is the length of the longest path between any two nodes in a tree. This path may or may not pass through the root.

The length of a path between two nodes is represented by the number of edges between them.



Example 1:

Input: root = [1,2,3,4,5]
Output: 3
Explanation: 3 is the length of the path [4,2,1,3] or [5,2,1,3].

Example 2:

Input: root = [1,2]
Output: 1



Constraints:

    The number of nodes in the tree is in the range [1, 104].
    -100 <= Node.val <= 100

 */


public class DiameterOfBinaryTree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1, null, new TreeNode(2));
        root.printTree();
        int maxDepth = diameterOfBinaryTree(root);
        System.out.println(maxDepth);
    }

    static int max = 0;

    public static int diameterOfBinaryTree(TreeNode root) {
        maxDepth(root);
        return max;
    }

    public static int maxDepth(TreeNode root) {
        if (root == null)
            return 0;

        if (root.left == null && root.right == null) {
            return 1;
        }

        int left = maxDepth(root.left);
        int right = maxDepth(root.right);

        max = Math.max(max, left + right);

        return 1 + Math.max(left, right);
    }
}