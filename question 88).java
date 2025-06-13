You are given an integer array nums of size n. For each index i where 0 <= i < n, define a subarray nums[start ... i] where start = max(0, i - nums[i]).

Return the total sum of all elements from the subarray defined for each index in the array.

 

Example 1:

Input: nums = [2,3,1]

Output: 11
ans:
class Solution {
    public int subarraySum(int[] nums) {
      int total = 0;
      for(int i = 0; i < nums.length; i++){
        int sum = 0;
        int start = Math.max(0, i - nums[i]);
        while(start <= i){
         sum = sum + nums[start];
         start++;
        }
        total = total + sum;
      }  
      return total;
    }
}