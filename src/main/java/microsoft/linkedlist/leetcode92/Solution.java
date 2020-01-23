package microsoft.linkedlist.leetcode92;

import microsoft.linkedlist.ListNode;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        if (m == n) return head;

        ListNode first = new ListNode(-1);
        first.next = head;
        ListNode p = head;
        head = first;

        for (int i = 1; i < m; i++) {
            first = first.next;
            p = p.next;
        }

        if (p.next == null)
            return head.next;

        ListNode q, r;
        q = p.next;
        r = q.next;
        int count = 1;
        while (count < n - m) {
            q.next = p;
            p = q;
            q = r;
            r = q.next;
            count++;
        }

        q.next = p;
        first.next.next = r;
        first.next = q;

        return head.next;
    }
}
