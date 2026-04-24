package main.java.com.samarth.revision.two;

import main.java.com.samarth.javatutorial.ListNode;

import java.util.HashMap;

public class LinkedListCycle {
    public static void main(String[] args) {
        LinkedListCycle sol = new LinkedListCycle();
        ListNode head = ListNode.createList(new int[]{3,2,0,-4});
        int pos = 0;
        if (pos != -1) {
            ListNode temp = head;
            ListNode cycleTarget = null;
            ListNode tail = null;
            int index = 0;

            while (temp != null) {
                if (index == pos) {
                    cycleTarget = temp;
                }
                if (temp.next == null) {
                    tail = temp;
                }
                temp = temp.next;
                index++;
            }

            if (tail != null) {
                tail.next = cycleTarget;
            }
        }

        System.out.println(sol.hasCycle(head));
    }

    public boolean hasCycle(ListNode head) {
        HashMap<ListNode, Integer> hm = new HashMap<>();
        while (head != null) {
            if (hm.containsKey(head)) {
                return true;
            }
            hm.put(head, 1);
            head = head.next;
        }
        return false;
    }

    public boolean hasCycle2(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) return true;
        }
        return false;
    }
}
