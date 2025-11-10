2. Add Two Numbers
Solved
Medium
Topics
premium lock icon
Companies
You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.

 

Example 1:


Input: l1 = [2,4,3], l2 = [5,6,4]
Output: [7,0,8]
Explanation: 342 + 465 = 807.
Example 2:

Input: l1 = [0], l2 = [0]
Output: [0]
Example 3:

Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
Output: [8,9,9,9,0,0,0,1]
 

Constraints:

The number of nodes in each linked list is in the range [1, 100].
0 <= Node.val <= 9
It is guaranteed that the list represents a number that does not have leading zeros
ans:
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
 import java.math.BigInteger;
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        StringBuilder str1 = new StringBuilder();
        ListNode dummy1 = l1;
        while (dummy1 != null) {
            str1.append(dummy1.val);
            dummy1 = dummy1.next;
        }
        
        str1.reverse();
       
        
        StringBuilder str2 = new StringBuilder();
        ListNode dummy2 = l2;
        while (dummy2 != null) {
            str2.append(dummy2.val);
            dummy2 = dummy2.next;
        }
       
        str2.reverse();
        BigInteger num1 = new BigInteger(str1.toString());
        BigInteger num2 = new BigInteger(str2.toString());
        BigInteger result = num1.add(num2);
        String rev = new StringBuilder(result.toString()).reverse().toString();
        
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        for(int i = 0; i < rev.length(); i++){
             current.next = new ListNode((rev.charAt(i) - '0'));
             current = current.next;
        }
        return dummy.next;
    }

}