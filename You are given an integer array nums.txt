You are given an integer array nums.

You replace each element in nums with the sum of its digits.

Return the minimum element in nums after all replacements.

 

Example 1:

Input: nums = [10,12,13,14]

Output: 1

Explanation:

nums becomes [1, 3, 4, 5] after all replacements, with minimum element 1.
Ans:
class Solution {
    public int minElement(int[] nums) {
        int result[] = new int[nums.length];
       for(int i = 0; i < nums.length; i++){
        int sum = 0;
        while(nums[i] > 0){
            int digit = nums[i] % 10;
            sum = sum + digit;
            nums[i] = nums[i] / 10;
        }
        result[i] = sum;
       } 
    int min = result[0];
    for(int j = 1; j < result.length; j++){
      if(result[j] < min){
        min = result[j];
      }
    }
    return min;
    }
}