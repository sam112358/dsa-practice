package main.java.com.samarth.javatutorial;

import java.util.ArrayList;
import java.util.Arrays;

public class left_view_bst {
    static ArrayList<Integer> solution = new ArrayList<>();
    static class Node
    {
        int data;
        Node left, right;

        Node(int item)
        {
            data = item;
            left = right = null;
        }
    }

    public static void main(String[] args) {
        Node node = new Node(1);
        node.right = new Node(3);
        node.left = new Node(2);
        node.left.right = new Node(6);
        node.left.left = new Node(4);

        ArrayList<Integer> sol = leftView(node);
        System.out.println(solution);
    }

    static ArrayList<Integer> leftView(Node root)
    {
//        System.out.println(root.data);
        solution.add(root.data);
        if(root.left != null)
            leftView(root.left);
        else if(root.right != null)
            leftView(root.right);
        ArrayList<Integer> sol = new ArrayList<>();
        sol.add(1);
        return sol;
    }
}
