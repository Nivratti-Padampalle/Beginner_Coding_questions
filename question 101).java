Given an integer array nums, return the number of elements that have both a strictly smaller and a strictly greater element appear in nums.

 

Example 1:

Input: nums = [11,7,2,15]
Output: 2
Explanation: The element 7 has the element 2 strictly smaller than it and the element 11 strictly greater than it.
Element 11 has element 7 strictly smaller than it and element 15 strictly greater than it.
In total there are 2 elements having both a strictly smaller and a strictly greater element appear in nums
ans:
class Solution {
    public int countElements(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            //inner loop check for greter element from nums[i]
            int greater = 0;
            for(int j = 0; j < nums.length; j++){
              if(nums[j] > nums[i]){
                greater++;
                break;
              }
            }
            //this loop check smaller element from nums[i]
            int smaller = 0;
             for(int k = 0; k < nums.length; k++){
                 if(nums[k] < nums[i]){
                   smaller++;
                   break;
                 }
            }
            if(greater == 1 && smaller == 1){
                count++;
            }
        }
        return count;
    }
}