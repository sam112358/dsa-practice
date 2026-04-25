package main.java.com.samarth.revision.two;

import main.java.com.samarth.javatutorial.ListNode;

import java.util.HashMap;

public class MiddleLinkedList {
    public static void main(String[] args) {
        MiddleLinkedList sol = new MiddleLinkedList();
        ListNode head = ListNode.createList(new int[]{1});
        ListNode.print(sol.middleNode(head));
    }

    public ListNode middleNode(ListNode head) {
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            head = head.next;
        }
        return head;
    }
}
