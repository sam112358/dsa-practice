package main.java.com.samarth.javatutorial;

//        You are given the heads of two sorted linked lists list1 and list2.
//
//        Merge the two lists in a one sorted list. The list should be made by splicing together the nodes of the first two lists.
//
//        Return the head of the merged linked list.
//
//
//
//        Example 1:
//
//        Input: list1 = [1,2,4], list2 = [1,3,4]
//        Output: [1,1,2,3,4,4]
//
//        Example 2:
//
//        Input: list1 = [], list2 = []
//        Output: []
//
//        Example 3:
//
//        Input: list1 = [], list2 = [0]
//        Output: [0]
//
//
//
//        Constraints:
//
//        The number of nodes in both lists is in the range [0, 50].
//        -100 <= Node.val <= 100
//        Both list1 and list2 are sorted in non-decreasing order.


public class merge_two_sorted_lists {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static void main(String[] args) {
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(2);
        list1.next.next = new ListNode(4);

        ListNode list2 = new ListNode(1);
        list2.next = new ListNode(3);
        list2.next.next = new ListNode(4);

        ListNode sorted = solution(list1, list2);
//        System.out.println(Arrays.toString(sorted));
    }

    public static ListNode solution(ListNode list1, ListNode list2){
        ListNode returnNode = new ListNode(0);
        ListNode top = returnNode;
        while(list1 != null && list2 !=  null){
            if(list1.val < list2.val){
                returnNode.next = list1;
                list1 = list1.next;
            }
            else{
                returnNode.next = list2;
                list2 = list2.next;
            }
            returnNode = returnNode.next;
        }

        if(list1 != null)
            returnNode.next = list1;
        if(list2 != null)
            returnNode.next = list2;

        return top.next;
    }
}
