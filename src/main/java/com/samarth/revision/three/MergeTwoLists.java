package main.java.com.samarth.revision.three;

import main.java.com.samarth.javatutorial.ListNode;

public class MergeTwoLists {
    public static void main(String[] args) {
        // ListNode node1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        // ListNode node2 = new ListNode(1, new ListNode(3, new ListNode(4)));
        ListNode node2 = new ListNode(2);
        ListNode mergeTwoLists = mergeTwoLists(null, null);
        ListNode.print(mergeTwoLists);
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode top = new ListNode();
        ListNode dummy = top;

        while(list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                top.next = list1;
                list1 = list1.next;
            } else {
                top.next = list2;
                list2 = list2.next;
            }
            top = top.next;
        }

        top.next = (list1 != null) ? list1 : list2;
        return dummy.next;
    }
}
