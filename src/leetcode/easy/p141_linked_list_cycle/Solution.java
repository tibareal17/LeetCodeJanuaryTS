package leetcode.easy.p141_linked_list_cycle;

import leetcode.easy.p206_reverse_linked_list.ListNode;

public class Solution {
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }

        // Ставим обоих бегунов на старт
        ListNode slow = head;
        ListNode fast = head;

        // Пока Заяц не добежал до конца (null)
        while (fast != null && fast.next != null) {
            slow = slow.next;          // Черепаха делает 1 шаг
            fast = fast.next.next;     // Заяц делает 2 шага (прыгает через один)

            // Если они оказались в одном и том же узле — это КРУГ!
            if (slow == fast) {
                return true;
            }
        }

        // Если мы вышли из цикла, значит Заяц встретил null. Круга нет.
        return false;
    }
}
