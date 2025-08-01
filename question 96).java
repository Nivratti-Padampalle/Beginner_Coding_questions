Given a positive integer n, find the pivot integer x such that:

The sum of all elements between 1 and x inclusively equals the sum of all elements between x and n inclusively.
Return the pivot integer x. If no such integer exists, return -1. It is guaranteed that there will be at most one pivot index for the given input.

 

Example 1:

Input: n = 8
Output: 6
Explanation: 6 is the pivot integer since: 1 + 2 + 3 + 4 + 5 + 6 = 6 + 7 + 8 = 21
ans:
class Solution {
    public int pivotInteger(int n) {
        for (int i = 1; i <= n; i++) {
            int pivot = i;
            int temp = pivot;
            int pivot_sum = 0;
            while (pivot > 0) {
                pivot_sum = pivot_sum + pivot;
                pivot--;
            }
            int sum = 0;
            for (int j = temp; j <= n; j++) {
                sum = sum + j;
            }
            if (pivot_sum == sum) {
                return temp;
            }
        }
        return -1;
    }
}