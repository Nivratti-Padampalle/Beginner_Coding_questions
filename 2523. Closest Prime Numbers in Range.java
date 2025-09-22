2523. Closest Prime Numbers in Range
Solved
Medium
Topics
premium lock icon
Companies
Hint
Given two positive integers left and right, find the two integers num1 and num2 such that:

left <= num1 < num2 <= right .
Both num1 and num2 are prime numbers.
num2 - num1 is the minimum amongst all other pairs satisfying the above conditions.
Return the positive integer array ans = [num1, num2]. If there are multiple pairs satisfying these conditions, return the one with the smallest num1 value. If no such numbers exist, return [-1, -1].

 

Example 1:

Input: left = 10, right = 19
Output: [11,13]
Explanation: The prime numbers between 10 and 19 are 11, 13, 17, and 19.
The closest gap between any pair is 2, which can be achieved by [11,13] or [17,19].
Since 11 is smaller than 17, we return the first pair.
Example 2:

Input: left = 4, right = 6
Output: [-1,-1]
Explanation: There exists only one prime number in the given range, so the conditions cannot be satisfied.
ans:
class Solution {
    public int[] closestPrimes(int left, int right) {
        //brute force solution 
        List<Integer> list = new ArrayList<>();
        while (left <= right) {
            if (left > 2 && left % 2 == 0) {
                left++;
                continue;
            }
            if (isPrime(left)) {
                list.add(left);
            }
            left++;
        }
        int ans[] = new int[] { -1, -1 };
        int minDiff = Integer.MAX_VALUE;

        for (int i = 1; i < list.size(); i++) {
            int diff = list.get(i) - list.get(i - 1);
            if (diff < minDiff) {
                minDiff = diff;
                ans[0] = list.get(i - 1);
                ans[1] = list.get(i);
            }
        }
        return ans;
    }

    private boolean isPrime(int num) {
        if (num < 2)
            return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}