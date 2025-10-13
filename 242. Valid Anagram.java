242. Valid Anagram
Solved
Easy
Topics
premium lock icon
Companies
Given two strings s and t, return true if t is an anagram of s, and false otherwise.

 

Example 1:

Input: s = "anagram", t = "nagaram"

Output: true

Example 2:

Input: s = "rat", t = "car"

Output: false

 

Constraints:

1 <= s.length, t.length <= 5 * 104
s and t consist of lowercase English letters.
 

Follow up: What if the inputs contain Unicode characters? How would you adapt your solution to such a case?
ans:
class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        /*int frq[] = new int[26];
        for (int i = 0; i < s.length(); i++) {
            frq[s.charAt(i) - 'a']++;
            frq[t.charAt(i) - 'a']--;
        }
        for (int c : frq) {
            if (c != 0) {
                return false;
            }
        }
        return true;
       */
       char arr1[] = s.toCharArray();
       Arrays.sort(arr1);
       String str = new String(arr1);
       
       char arr2[] = t.toCharArray();
       Arrays.sort(arr2);
       String str2 = new String(arr2);
       if(str.equals(str2)){
        return true;
       } 
       return false;
    }
}