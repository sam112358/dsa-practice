package main.java.com.samarth.revision.two;

import main.java.com.samarth.javatutorial.ListNode;

public class MergeTwoSortedLists {
    public static void main(String[] args) {
        MergeTwoSortedLists sol = new MergeTwoSortedLists();
        ListNode list1 = ListNode.createList(new int[]{1,2,4});
        ListNode list2 = ListNode.createList(new int[]{1,3,4});

        ListNode mergedList = sol.mergeTwoLists(list1, list2);
        ListNode.print(mergedList);
    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode ls = new ListNode(0);
        ListNode hold = ls;

        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                hold.next = list1;
                list1 = list1.next;
            } else {
                hold.next = list2;
                list2 = list2.next;
            }
            hold = hold.next;
        }
        if (list1 != null) {
            hold.next = list1;
        } else {
            hold.next = list2;
        }
        return ls.next;
    }
}
