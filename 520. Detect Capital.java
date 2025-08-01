520. Detect Capital
Solved
Easy
Topics
premium lock icon
Companies
We define the usage of capitals in a word to be right when one of the following cases holds:

All letters in this word are capitals, like "USA".
All letters in this word are not capitals, like "leetcode".
Only the first letter in this word is capital, like "Google".
Given a string word, return true if the usage of capitals in it is right.

 

Example 1:

Input: word = "USA"
Output: true
Example 2:

Input: word = "FlaG"
Output: false
ans:
class Solution {
    public boolean detectCapitalUse(String word) {
        if (word.equals(word.toUpperCase())) {
            return true;
        } else if (word.equals(word.toLowerCase())) {
            return true;
        } else if (word.substring(0, 1).equals(word.substring(0, 1).toUpperCase())
                && word.substring(1, word.length()).equals(word.substring(1, word.length()).toLowerCase())) {
            return true;
        }
        return false;
    }
}