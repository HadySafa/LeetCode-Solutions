/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        // handle special cases
        if (list1 == null && list2 == null)
            return null;
        if (list1 == null)
            return list2;
        if (list2 == null)
            return list1;

        // determine the head (where to start)
        ListNode head = null, node = null;
        if (list2.val <= list1.val) {
            node = list2;
            list2 = list2.next;
        } else {
            node = list1;
            list1 = list1.next;
        }
        head = node;

        while (true) {

            // if one list is merged all, then continue from the other (already sorted)
            if (list1 == null) {
                node.next = list2;
                break;
            }
            if (list2 == null) {
                node.next = list1;
                break;
            }

            if (list1.val >= list2.val) {
                node.next = list2;
                node = list2;
                list2 = list2.next;
            } else {
                node.next = list1;
                node = list1;
                list1 = list1.next;
            }

        }

        return head;

    }
    
}