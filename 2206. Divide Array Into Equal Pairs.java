2206. Divide Array Into Equal Pairs
Solved
Easy
Topics
premium lock icon
Companies
Hint
You are given an integer array nums consisting of 2 * n integers.

You need to divide nums into n pairs such that:

Each element belongs to exactly one pair.
The elements present in a pair are equal.
Return true if nums can be divided into n pairs, otherwise return false.

 

Example 1:

Input: nums = [3,2,3,2,2,2]
Output: true
Explanation: 
There are 6 elements in nums, so they should be divided into 6 / 2 = 3 pairs.
If nums is divided into the pairs (2, 2), (3, 3), and (2, 2), it will satisfy all the conditions.
Example 2:

Input: nums = [1,2,3,4]
Output: false
Explanation: 
There is no way to divide nums into 4 / 2 = 2 pairs such that the pairs satisfy every condition
ans:
class Solution {
    public boolean divideArray(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int n = nums.length / 2;
        int pairs = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (!set.contains(i) && !set.contains(j)) {
                    if (nums[i] == nums[j]) {
                        pairs++;
                        set.add(i);
                        set.add(j);
                        break;
                    }
                }
            }
        }
        if (pairs == n) {
            return true;
        }
        return false;
    }
}