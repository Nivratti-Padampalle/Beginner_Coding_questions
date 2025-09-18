


Testcase
Testcase
Test Result
1695. Maximum Erasure Value
Solved
Medium
Topics
premium lock icon
Companies
Hint
You are given an array of positive integers nums and want to erase a subarray containing unique elements. The score you get by erasing the subarray is equal to the sum of its elements.

Return the maximum score you can get by erasing exactly one subarray.

An array b is called to be a subarray of a if it forms a contiguous subsequence of a, that is, if it is equal to a[l],a[l+1],...,a[r] for some (l,r).

 

Example 1:

Input: nums = [4,2,4,5,6]
Output: 17
Explanation: The optimal subarray here is [2,4,5,6].
Example 2:

Input: nums = [5,2,1,2,5,2,1,2,5]
Output: 8
Explanation: The optimal subarray here is [5,2,1] or [1,2,5].
 

Constraints:

1 <= nums.length <= 105
1 <= nums[i] <= 104
 

Seen this question in a real interview before?
1/5
Yes
No
Accepted
2,80,151/438.1K
Acceptance Rate
63.9%
Topics
icon
Companies
Hint 1
Hint 2
Similar Questions
Discussion (169)

Choose a type



Copyright © 2025 LeetCode. All rights reserved.

3.4K


169


7 Online
Java
Auto





2425262728293031323334353637383940
class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        //brute force solution 
        /*int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            Set<Integer> set = new HashSet<>();
            int sum = 0;
            for (int j = i; j < nums.length; j++) {
                if (set.contains(nums[j])) {
                    break;
…                right++;
            } else {
                set.remove(nums[left]);
                sum -= nums[left];
                left++;
            }
        }
        return maxScore;
    }
}
Saved
Accepted
Runtime: 0 ms
Case 1
Case 2
Input
nums =
[4,2,4,5,6]
Output
17
Expected
17
Contribute a testcase

Sliding Window
Search questions



ans:
class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        //brute force solution 
        /*int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            Set<Integer> set = new HashSet<>();
            int sum = 0;
            for (int j = i; j < nums.length; j++) {
                if (set.contains(nums[j])) {
                    break;
                }
                    set.add(nums[j]);
                    sum += nums[j];
            }
            if (sum > max) {
                max = sum;
            }
            set.clear();
        }
        return max;
        */
        //more optimised solution
        Set<Integer> set = new HashSet<>();
        int left = 0, right = 0;
        int sum = 0, maxScore = 0;
        while (right < nums.length) {
            if (!set.contains(nums[right])) {
                set.add(nums[right]);
                sum += nums[right];
                maxScore = Math.max(maxScore, sum);
                right++;
            } else {
                set.remove(nums[left]);
                sum -= nums[left];
                left++;
            }
        }
        return maxScore;
    }
}