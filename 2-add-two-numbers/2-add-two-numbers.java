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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carryOver = 0;
        ListNode head = new ListNode(5); 
        ListNode ans = head;
        
        while (l1 != null || l2 != null || carryOver != 0) {
            if (l1 != null) {
                carryOver += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                carryOver += l2.val;
                l2 = l2.next;
            }
            ans.next = new ListNode(carryOver%10);
            carryOver /= 10;
            ans = ans.next;
        }
        return head.next;
    }
}