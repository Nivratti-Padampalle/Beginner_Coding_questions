645. Set Mismatch
Solved
Easy
Topics
premium lock icon
Companies
You have a set of integers s, which originally contains all the numbers from 1 to n. Unfortunately, due to some error, one of the numbers in s got duplicated to another number in the set, which results in repetition of one number and loss of another number.

You are given an integer array nums representing the data status of this set after the error.

Find the number that occurs twice and the number that is missing and return them in the form of an array.

 

Example 1:

Input: nums = [1,2,2,4]
Output: [2,3]
Example 2:

Input: nums = [1,1]
Output: [1,2]
ans:
class Solution {
    public int[] findErrorNums(int[] nums) {
        int ans[] = new int[2];
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
             int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
                if (count == 2) {
                    ans[0] = nums[i];
                }
            }
            sum = sum + nums[i];
        }
        int n = nums.length;
        int whole_sum = (n * (n + 1) / 2);
        int num = whole_sum - (sum - ans[0]);
        ans[1] = num;
        return ans;
    }
}