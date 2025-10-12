3712. Sum of Elements With Frequency Divisible by K
Solved
Easy
premium lock icon
Companies
Hint
You are given an integer array nums and an integer k.

Return an integer denoting the sum of all elements in nums whose frequency is divisible by k, or 0 if there are no such elements.

Note: An element is included in the sum exactly as many times as it appears in the array if its total frequency is divisible by k.

The frequency of an element x is the number of times it occurs in the array.

 

Example 1:

Input: nums = [1,2,2,3,3,3,3,4], k = 2

Output: 16

Explanation:

The number 1 appears once (odd frequency).
The number 2 appears twice (even frequency).
The number 3 appears four times (even frequency).
The number 4 appears once (odd frequency).
So, the total sum is 2 + 2 + 3 + 3 + 3 + 3 = 16.

Example 2:

Input: nums = [1,2,3,4,5], k = 2

Output: 0

Explanation:

There are no elements that appear an even number of times, so the total sum is 0.

Example 3:

Input: nums = [4,4,4,1,2,3], k = 3

Output: 12

Explanation:

The number 1 appears once.
The number 2 appears once.
The number 3 appears once.
The number 4 appears three times.
So, the total sum is 4 + 4 + 4 = 12.

 

Constraints:

1 <= nums.length <= 100
1 <= nums[i] <= 100
1 <= k <= 100
ans:
class Solution {
    public int sumDivisibleByK(int[] nums, int k) {
        //simple brute force solution
        /*int sum = 0;
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j] && !set.contains(nums[i])) {
                    count++;
                }
            }
            if(count % k == 0){
                set.add(nums[i]);
                sum += (nums[i] * count);
            }
        }
        return sum;
        */
        //solution2 more optimised using hashmap
        /* Map<Integer , Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        //1 : 1 , 2 : 2, 3 : 4, 4 : 1
        int sum = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() % k == 0) {
                sum += (entry.getValue() * entry.getKey());
            }
        }
        return sum;
        */
        //solution3 by creating frequency array from 1 to 100
        int sum = 0;
        int frq[] = new int[101];
        for (int i = 0; i < nums.length; i++) {
            frq[nums[i]]++;
        }
        for (int i = 1; i <= 100; i++) {
            if (frq[i] % k == 0) {
                sum += (i * frq[i]);
            }
        }
        return sum;
    }
}