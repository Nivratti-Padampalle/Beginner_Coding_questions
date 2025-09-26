611. Valid Triangle Number
Solved
Medium
Topics
premium lock icon
Companies
Given an integer array nums, return the number of triplets chosen from the array that can make triangles if we take them as side lengths of a triangle.

 

Example 1:

Input: nums = [2,2,3,4]
Output: 3
Explanation: Valid combinations are: 
2,3,4 (using the first 2)
2,3,4 (using the second 2)
2,2,3
Example 2:

Input: nums = [4,2,3,4]
Output: 4
ans:
class Solution {
    public int triangleNumber(int[] nums) {
        //brute force solution 
        /* int count = 0;
        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if ((nums[i] + nums[j]) > nums[k] && (nums[j] + nums[k]) > nums[i]
                            && (nums[i] + nums[k]) > nums[j]) {
                        count++;
                    }
                }
            }
        }
        return count;
        */
        //solution 2 most optimised solution by using two pointer approach and sort
        Arrays.sort(nums);
        int count = 0;
        int n = nums.length;
        for (int i = n - 1; i >= 0; i--) {
            int left = 0;
            int right = i - 1;
            while (left < right) {
                if (nums[left] + nums[right] > nums[i]) {
                    count = count + (right - left);
                    right--;
                } else {
                    left++;
                }
            }
        }
        return count;
    }
}