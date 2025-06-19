Given an array of positive integers nums, return the maximum possible sum of an strictly increasing subarray in nums.

A subarray is defined as a contiguous sequence of numbers in an array.

 

Example 1:

Input: nums = [10,20,30,5,10,50]
Output: 65
Explanation: [5,10,50] is the ascending subarray with the maximum sum of 65
ans:
class Solution {
    public int maxAscendingSum(int[] nums) {
        int prev = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int sum = nums[i];
            int prev2 = nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] > prev2) {
                    sum = sum + nums[j];
                    prev2 = nums[j];
                } else {
                    break;
                }
            }
            if (sum > prev) {
                prev = sum;
            }
        }
        return prev;
    }
}