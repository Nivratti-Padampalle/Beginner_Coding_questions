You are given a 0-indexed array of string words and two integers left and right.

A string is called a vowel string if it starts with a vowel character and ends with a vowel character where vowel characters are 'a', 'e', 'i', 'o', and 'u'.

Return the number of vowel strings words[i] where i belongs to the inclusive range [left, right].

 

Example 1:

Input: words = ["are","amy","u"], left = 0, right = 2
Output: 2
Explanation: 
- "are" is a vowel string because it starts with 'a' and ends with 'e'.
- "amy" is not a vowel string because it does not end with a vowel.
- "u" is a vowel string because it starts with 'u' and ends with 'u'.
The number of vowel strings in the mentioned range is 2
ans:
class Solution {
    public int vowelStrings(String[] words, int left, int right) {
        int count = 0;
        while (left <= right) {
            char ch1 = words[left].charAt(0);
            char ch2 = words[left].charAt(words[left].length()-1);
            if ((ch1 == 'a' || ch1 == 'e' || ch1 == 'i' || ch1 == 'o' || ch1 == 'u') && (ch2 == 'a' || ch2 == 'e'
                    || ch2 == 'i' || ch2 == 'o' || ch2 == 'u')) {
                count++;
            }
            left++;
        }
        return count;
    }
}