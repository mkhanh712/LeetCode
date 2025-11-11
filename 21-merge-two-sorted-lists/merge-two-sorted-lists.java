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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        // Tạo node giả để dễ thao tác
        ListNode dummy = new ListNode(-1);
        ListNode current = dummy;

        // So sánh từng node của l1 và l2
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                current.next = l1;
                l1 = l1.next;
            } else {
                current.next = l2;
                l2 = l2.next;
            }
            current = current.next; // tiến con trỏ
        }

        // Nối phần còn lại nếu còn
        if (l1 != null) current.next = l1;
        if (l2 != null) current.next = l2;

        return dummy.next; // bỏ node giả, trả về list đã merge
    }
}
