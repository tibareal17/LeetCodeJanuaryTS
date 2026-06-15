package leetcode.easy.p0083_remove_duplicates_from_sorted_list;

import leetcode.easy.p0206_reverse_linked_list.ListNode;

public class Solution {
    public ListNode deleteDuplicates(ListNode head) {

        ListNode current = head;

        while (current != null && current.next != null) {
            if (current.val == current.next.val) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }

        return head;
    }
}
