219. Contains Duplicate II
Solved
Easy
Topics
premium lock icon
Companies
Given an integer array nums and an integer k, return true if there are two distinct indices i and j in the array such that nums[i] == nums[j] and abs(i - j) <= k.

 

Example 1:

Input: nums = [1,2,3,1], k = 3
Output: true
Example 2:

Input: nums = [1,0,1,1], k = 1
Output: true
Example 3:

Input: nums = [1,2,3,1,2,3], k = 2
Output: false
 

Constraints:

1 <= nums.length <= 105
-109 <= nums[i] <= 109
0 <= k <= 105
ans:
class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        //brute force solution simple 
        /*int n = nums.length;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if ((nums[i] == nums[j]) && (Math.abs(i - j) <= k)) {
                    return true;
                }
            }
        }
        return false;
        */
        //most optimal solution using HashMap
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], i);
            } else {
                int prevIdx = map.get(nums[i]);
                if (Math.abs(prevIdx - i) <= k) {
                    return true;
                } else {
                    map.put(nums[i], i);
                }
            }
        }
        return false;
    }
}