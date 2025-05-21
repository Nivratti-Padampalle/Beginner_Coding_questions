Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.

There is only one repeated number in nums, return this repeated number.

You must solve the problem without modifying the array nums and using only constant extra space.

 

Example 1:

Input: nums = [1,3,4,2,2]
Output: 2
Example 2:

Input: nums = [3,1,3,4,2]
Output: 3
Example 3:

Input: nums = [3,3,3,3,3]
Output: 3s
ans:
class Solution {
    public int findDuplicate(int[] nums) {
       HashMap<Integer,Integer> map = new HashMap<>();
       for(int i = 0; i < nums.length; i++){
        if(map.containsKey(nums[i])){
           map.put(nums[i],map.get(nums[i])+1);
        }
        else{
            map.put(nums[i],1);
        }
       } 
       for(Map.Entry<Integer,Integer> entry : map.entrySet()){
        if(entry.getValue() > 1){
            return entry.getKey();
        }
       }
       return 0;
    }
}