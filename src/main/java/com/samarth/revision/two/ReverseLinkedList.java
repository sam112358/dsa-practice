package main.java.com.samarth.revision.two;

import main.java.com.samarth.javatutorial.ListNode;

public class ReverseLinkedList {
    public static void main(String[] args) {
        ReverseLinkedList sol = new ReverseLinkedList();
        ListNode head = ListNode.createList(new int[]{1,2,3,4,5});

        ListNode mergedList = sol.reverseListRecursion(head);
        ListNode.print(mergedList);
    }

    public ListNode reverseList(ListNode head) {
        ListNode node = null;

        while (head != null) {
            ListNode temp = head.next;
            head.next = node;
            node = head;
            head = temp;
        }
        return node;
    }

    public ListNode reverseListRecursion(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode newHead = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }
}
