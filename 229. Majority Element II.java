229. Majority Element II
Solved
Medium
Topics
premium lock icon
Companies
Hint
Given an integer array of size n, find all elements that appear more than ⌊ n/3 ⌋ times.

 

Example 1:

Input: nums = [3,2,3]
Output: [3]
Example 2:

Input: nums = [1]
Output: [1]
Example 3:

Input: nums = [1,2]
Output: [1,2]
ans:
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = (nums.length / 3);
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }
        ArrayList<Integer> list = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > n) {
                list.add(entry.getKey());
            }
        }
        return list;
    }
}