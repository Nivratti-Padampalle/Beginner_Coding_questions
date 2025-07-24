3115. Maximum Prime Difference
Solved
Medium
Topics
premium lock icon
Companies
Hint
You are given an integer array nums.

Return an integer that is the maximum distance between the indices of two (not necessarily different) prime numbers in nums.

 

Example 1:

Input: nums = [4,2,9,5,3]

Output: 3

Explanation: nums[1], nums[3], and nums[4] are prime. So the answer is |4 - 1| = 3.

Example 2:

Input: nums = [4,8,2,8]

Output: 0

Explanation: nums[2] is prime. Because there is just one prime number, the answer is |2 - 2| = 0.
ans:
class Solution {
    public int maximumPrimeDifference(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (isprime(nums[i])) {
                list.add(i);
            }
        }
        /*int max = 0;
        int i = 0;
        while (i < list.size()) {
            int j = i;
            while (j < list.size()) {
                int diff = Math.abs(list.get(i) - list.get(j));
                if (diff >= max) {
                    max = diff;
                }
                j++;
            }
            i++;
        }
        */
       return list.get(list.size() - 1) - list.get(0);
       //return max;
    }

    private boolean isprime(int num) {
        if(num < 2){
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}