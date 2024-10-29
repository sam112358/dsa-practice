package main.java.com.samarth.javatutorial;


public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {}

    TreeNode(int val) { this.val = val; }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public void printTree() {
        printTree(this, "", true);
    }

    private void printTree(TreeNode node, String prefix, boolean isRight) {
        if (node != null) {
            System.out.println(prefix + (isRight ? "└── " : "├── ") + node.val);
            printTree(node.left, prefix + (isRight ? "    " : "│   "), false);
            printTree(node.right, prefix + (isRight ? "    " : "│   "), true);
        }
    }
}
