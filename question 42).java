You are given an integer array nums. The unique elements of an array are the elements that appear exactly once in the array.

Return the sum of all the unique elements of nums.
Example 1:

Input: nums = [1,2,3,2]
Output: 4
Explanation: The unique elements are [1,3], and the sum is 4.
ans:
class Solution {
    public int sumOfUnique(int[] nums) {
       HashMap<Integer,Integer> map = new HashMap<>();
       for(int i = 0; i < nums.length; i++){
        if(map.containsKey(nums[i])){
            map.put(nums[i] , map.get(nums[i]) + 1);
        }
        else{
            map.put(nums[i] , 1);
        }
       }
       int sum = 0;
       for(Map.Entry<Integer,Integer> entry : map.entrySet()){
        if(entry.getValue().equals(1)){
         sum = sum + entry.getKey();
        }
       } 
       return sum;
    }
}