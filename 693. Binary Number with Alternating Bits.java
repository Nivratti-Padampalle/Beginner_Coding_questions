693. Binary Number with Alternating Bits
Solved
Easy
Topics
premium lock icon
Companies
Given a positive integer, check whether it has alternating bits: namely, if two adjacent bits will always have different values.

 

Example 1:

Input: n = 5
Output: true
Explanation: The binary representation of 5 is: 101
Example 2:

Input: n = 7
Output: false
Explanation: The binary representation of 7 is: 111.
Example 3:

Input: n = 11
Output: false
Explanation: The binary representation of 11 is: 1011.
ans:
class Solution {
    public boolean hasAlternatingBits(int n) {
        StringBuilder bin = new StringBuilder();
        while (n > 0) {
            int rem = n % 2;
            bin.append(rem);
            n = n / 2;
        }
        String str = bin.toString();
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                return false;
            }
        }
        return true;
    }
}