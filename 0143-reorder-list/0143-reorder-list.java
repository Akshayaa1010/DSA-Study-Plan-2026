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
    public void reorderList(ListNode h) {
        if (h == null || h.next == null) return;
        
        // 1. Find middle
        ListNode s = h, f = h;
        while (f.next != null && f.next.next != null) {
            s = s.next;
            f = f.next.next;
        }
        
        // 2. Reverse second half
        ListNode p = null, c = s.next;
        s.next = null;
        while (c != null) {
            ListNode nxt = c.next;
            c.next = p;
            p = c;
            c = nxt;
        }
        
        // 3. Merge two halves
        ListNode first = h, second = p;
        while (second != null) {
            ListNode t1 = first.next, t2 = second.next;
            first.next = second;
            second.next = t1;
            first = t1;
            second = t2;
        }
    }
}