1768. Merge Strings Alternately
Solved
Easy
Topics
premium lock icon
Companies
Hint
You are given two strings word1 and word2. Merge the strings by adding letters in alternating order, starting with word1. If a string is longer than the other, append the additional letters onto the end of the merged string.

Return the merged string.

 

Example 1:

Input: word1 = "abc", word2 = "pqr"
Output: "apbqcr"
Explanation: The merged string will be merged as so:
word1:  a   b   c
word2:    p   q   r
merged: a p b q c r
Example 2:

Input: word1 = "ab", word2 = "pqrs"
Output: "apbqrs"
Explanation: Notice that as word2 is longer, "rs" is appended to the end.
word1:  a   b 
word2:    p   q   r   s
merged: a p b q   r   s
Example 3:

Input: word1 = "abcd", word2 = "pq"
Output: "apbqcd"
Explanation: Notice that as word1 is longer, "cd" is appended to the end.
word1:  a   b   c   d
word2:    p   q 
merged: a p b q c   d
ans:
class Solution {
    public String mergeAlternately(String word1, String word2) {
        int len1 = word1.length();//3,2,4
        int len2 = word2.length();//3,4,2
        StringBuilder str = new StringBuilder();
        if (len1 < len2) {
            for (int i = 0; i < len1; i++) {
                str.append(word1.charAt(i));
                str.append(word2.charAt(i));
            }
            String sub = word2.substring(len1, word2.length());
            str.append(sub);
        } else if (len1 > len2) {
            for (int i = 0; i < len2; i++) {
                str.append(word1.charAt(i));
                str.append(word2.charAt(i));
            }
            String sub2 = word1.substring(len2, word1.length());
            str.append(sub2);
        } else {
            for (int i = 0; i < word1.length(); i++) {
                str.append(word1.charAt(i));
                str.append(word2.charAt(i));
            }
        }
        return str.toString();
    }
}