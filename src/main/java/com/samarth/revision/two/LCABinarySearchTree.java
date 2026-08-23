package main.java.com.samarth.revision.two;

import main.java.com.samarth.javatutorial.TreeNode;

public class LCABinarySearchTree {
    public static void main(String[] args) {
        LCABinarySearchTree sol = new LCABinarySearchTree();
        TreeNode p = new TreeNode(3), q = new TreeNode(5);
        TreeNode root = new TreeNode(6,
                new TreeNode(2,
                        new TreeNode(0),
                        new TreeNode(4, new TreeNode(3), new TreeNode(5))
                ),
                new TreeNode(8,
                        new TreeNode(7),
                        new TreeNode(9)
                )
        );
        System.out.println(sol.lowestCommonAncestor2(root, p, q).val);
    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null)
            return null;
        if (root.val > p.val && root.val > q.val) {
            return lowestCommonAncestor(root.left, p, q);
        } else if (root.val < p.val && root.val < q.val) {
            return lowestCommonAncestor(root.right, p, q);
        } else {
            return root;
        }
    }

    public TreeNode lowestCommonAncestor2(TreeNode root, TreeNode p, TreeNode q) {
        while (root != null) {
            if (root.val < p.val && root.val < q.val) {
                root = root.right;
            } else if (root.val > p.val && root.val > q.val) {
                root = root.left;
            } else {
                return root;
            }
        }
        return null;
    }
}
