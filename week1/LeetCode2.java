/**
https://leetcode.com/problems/add-two-numbers/description/
*/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
      public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
          //intialization
        ListNode pointer = new ListNode(-9);
        ListNode result = pointer;
        int sum;
        int remainder = 0;
        final int CARRIAGE = 1;

        while (l1 != null && l2 != null) {
            sum = l1.val + l2.val + remainder;
            if (sum > 9) {
                sum = sum - 10;
                remainder = CARRIAGE;
            }else{
                remainder = 0;
            }
            pointer.next = new ListNode(sum);
            pointer = pointer.next;
            l1 = l1.next;
            l2 = l2.next;
        }
        while (l1 != null) {
            sum = l1.val + remainder;
            if (sum > 9) {
                sum = sum - 10;
                remainder = CARRIAGE;
            }else{
                remainder = 0;
            }
            pointer.next = new ListNode(sum);
            pointer = pointer.next;
            l1 = l1.next;
        }
        while (l2 != null) {
            sum = l2.val + remainder;
            if (sum > 9) {
                remainder = CARRIAGE;
                sum = sum - 10;
            }else{
                remainder = 0;
            }
            pointer.next = new ListNode(sum);
            pointer = pointer.next;
            l2 = l2.next;
        }
        if (remainder == CARRIAGE) {
            pointer.next = new ListNode(CARRIAGE);
        }

        return result.next;
    }
}
