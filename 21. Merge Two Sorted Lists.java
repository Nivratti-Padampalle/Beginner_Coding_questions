21. Merge Two Sorted Lists
Solved
Easy
Topics
premium lock icon
Companies
You are given the heads of two sorted linked lists list1 and list2.

Merge the two lists into one sorted list. The list should be made by splicing together the nodes of the first two lists.

Return the head of the merged linked list.

 

Example 1:


Input: list1 = [1,2,4], list2 = [1,3,4]
Output: [1,1,2,3,4,4]
Example 2:

Input: list1 = [], list2 = []
Output: []
Example 3:

Input: list1 = [], list2 = [0]
Output: [0]
 

Constraints:

The number of nodes in both lists is in the range [0, 50].
-100 <= Node.val <= 100
Both list1 and list2 are sorted in non-decreasing order
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
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        /*ArrayList<Integer> list = new ArrayList<>();
        ListNode temp = list1;
        while(temp != null){
            list.add(temp.val);
            temp = temp.next;
        }
        ListNode temp2 = list2;
        while(temp2 != null){
            list.add(temp2.val);
            temp2 = temp2.next;
        }
        Collections.sort(list);
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        for(int val : list){
            current.next = new ListNode(val);
            current = current.next;
        }
        return dummy.next;
        */
        ListNode dummy = new ListNode(0);
        ListNode ptr1 = list1;

        ListNode ptr2 = list2;
        ListNode current = dummy;
        while (ptr1 != null && ptr2 != null) {
            if (ptr1.val < ptr2.val) {
                current.next = ptr1;
                ptr1 = ptr1.next;
            } else {
                current.next = ptr2;
                ptr2 = ptr2.next;
            }
            current = current.next;
        }
        if (ptr1 != null) {
            current.next = ptr1;
        }
        if (ptr2 != null) {
            current.next = ptr2;
        }
        return dummy.next;
    }
}