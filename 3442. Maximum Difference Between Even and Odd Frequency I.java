3442. Maximum Difference Between Even and Odd Frequency I
Solved
Easy
Topics
premium lock icon
Companies
Hint
You are given a string s consisting of lowercase English letters.

Your task is to find the maximum difference diff = freq(a1) - freq(a2) between the frequency of characters a1 and a2 in the string such that:

a1 has an odd frequency in the string.
a2 has an even frequency in the string.
Return this maximum difference.

 

Example 1:

Input: s = "aaaaabbc"

Output: 3

Explanation:

The character 'a' has an odd frequency of 5, and 'b' has an even frequency of 2.
The maximum difference is 5 - 2 = 3.
Example 2:

Input: s = "abcabcab"

Output: 1

Explanation:

The character 'a' has an odd frequency of 3, and 'c' has an even frequency of 2.
The maximum difference is 3 - 2 = 1.
ans:
class Solution {
    public int maxDifference(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        int odd = Integer.MIN_VALUE;
        int even = Integer.MAX_VALUE;
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            int val = entry.getValue();
            if (val % 2 != 0) {
                if (val > odd) {
                    odd = val;
                }
            } else {
                if (val < even) {
                    even = val;
                }
            }
        }
        return odd - even;
    }
}