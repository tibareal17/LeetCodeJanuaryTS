package leetcode.medium.p0002_add_two_numbers;

import leetcode.easy.p0206_reverse_linked_list.ListNode;

public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        int digit = 1;
        int sumOne = 0;
        while (l1 != null) {
            sumOne += l1.val * digit;
            l1 = l1.next;
            digit *= 10;
        }
        digit = 1;

        int sumTwo = 0;
        while (l2 != null) {
            sumTwo += l2.val * digit;
            l2 = l2.next;
            digit *= 10;
        }
        digit = 1;

        int total = sumOne + sumTwo;

        ListNode res = new ListNode();
        ListNode head = res;

        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;

        while (total != 0) {
            res.val = total % 10;
            total /= 10;
            res.next = new ListNode();
            res = res.next;

        }


        return head;
    }
}
