1358. Number of Substrings Containing All Three Characters
Solved
Medium
Topics
premium lock icon
Companies
Hint
Given a string s consisting only of characters a, b and c.

Return the number of substrings containing at least one occurrence of all these characters a, b and c.

 

Example 1:

Input: s = "abcabc"
Output: 10
Explanation: The substrings containing at least one occurrence of the characters a, b and c are "abc", "abca", "abcab", "abcabc", "bca", "bcab", "bcabc", "cab", "cabc" and "abc" (again). 
Example 2:

Input: s = "aaacb"
Output: 3
Explanation: The substrings containing at least one occurrence of the characters a, b and c are "aaacb", "aacb" and "acb". 
Example 3:

Input: s = "abc"
Output: 1
 

Constraints:

3 <= s.length <= 5 x 10^4
s only consists of a, b or c characters
ans:
class Solution {
    public int numberOfSubstrings(String s) {
        //brute force solution first 
        /*int count = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                String str = s.substring(i, j + 1);
                if (isValid(str)) {
                    count++;
                }
            }
        }
        return count;
        }
        
        private static boolean isValid(String str) {
        int counta = 0;
        int countb = 0;
        int countc = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a') {
                counta++;
            } else if (str.charAt(i) == 'b') {
                countb++;
            } else if (str.charAt(i) == 'c') {
                countc++;
            }
        }
        if (counta >= 1 && countb >= 1 && countc >= 1) {
            return true;
        }
        return false;
        */
        //more optimised solution sliding window 
        int[] count = new int[3];
        int res = 0;
        int start = 0;
        for (int end = 0; end < s.length(); end++) {
            count[s.charAt(end) - 'a']++;
            while (count[0] > 0 && count[1] > 0 && count[2] > 0) {
                res = res + (s.length() - end);
                count[s.charAt(start) - 'a']--;
                start++;
            }
        }
        return res;
    }
}