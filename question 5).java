You are given a string s, consisting of lowercase alphabets. Your task is to remove consecutive duplicate characters from the string. 

Example:

Input: s = "aabb"
Output:  "ab" 
Explanation: 
The character 'a' at index 2 is the same as 'a' at index 1, so it is removed.
Similarly, the character 'b' at index 4 is the same as 'b' at index 3, so it is removed.
The final string is "ab".
Ans:
class Solution {
    public String removeConsecutiveCharacter(String s) {

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            
        
            if (result.length() == 0 || result.charAt(result.length() - 1) != ch) {
                result.append(ch); 
            }
        }
        
        return result.toString();
    }
}