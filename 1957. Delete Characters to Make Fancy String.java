1957. Delete Characters to Make Fancy String
Solved
Easy
Topics
premium lock icon
Companies
Hint
A fancy string is a string where no three consecutive characters are equal.

Given a string s, delete the minimum possible number of characters from s to make it fancy.

Return the final string after the deletion. It can be shown that the answer will always be unique.

 

Example 1:

Input: s = "leeetcode"
Output: "leetcode"
Explanation:
Remove an 'e' from the first group of 'e's to create "leetcode".
No three consecutive characters are equal, so return "leetcode".
Example 2:

Input: s = "aaabaaaa"
Output: "aabaa"
Explanation:
Remove an 'a' from the first group of 'a's to create "aabaaaa".
Remove two 'a's from the second group of 'a's to create "aabaa".
No three consecutive characters are equal, so return "aabaa".
Example 3:

Input: s = "aab"
Output: "aab"
Explanation: No three consecutive characters are equal, so return "aab".
ans:
class Solution {
    public String makeFancyString(String s) {
       if(s.length() < 3){
        return s;
       } 
       StringBuilder fancy = new StringBuilder();
       for(int i = 0; i < s.length()-2;i++){
       char ch = s.charAt(i);
       if((ch == s.charAt(i + 1)) && (ch == s.charAt(i + 2))){
        continue;
       }
       fancy.append(ch);
       }
       fancy.append(s.charAt(s.length()-2));
       fancy.append(s.charAt(s.length()-1));
       return fancy.toString();
    }
}