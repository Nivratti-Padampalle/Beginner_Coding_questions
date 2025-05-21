You are given an integer array nums where the largest integer is unique.

Determine whether the largest element in the array is at least twice as much as every other number in the array. If it is, return the index of the largest element, or return -1 otherwise.

Example 1:

Input: nums = [3,6,1,0]
Output: 1
Explanation: 6 is the largest integer.
For every other number in the array x, 6 is at least twice as big as x.
The index of value 6 is 1, so we return 1.
ans:
class Solution {
    public int dominantIndex(int[] nums) {
     int max = nums[0];
     int index = 0;
     for(int i = 1; i < nums.length; i++){
        if(nums[i] > max){
            max = nums[i];
            index = i;
        }
     }
      if(islargest(nums,max) == true){
        return index;
     }
     return -1;
    }
     public boolean islargest(int[] nums, int max){
        boolean start = true;
        for(int j = 0; j < nums.length; j++){
        if((nums[j] * 2) > max && nums[j] != max){
            return false;
        }
        }
        return true;
     }

}