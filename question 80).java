A pangram is a sentence where every letter of the English alphabet appears at least once.

Given a string sentence containing only lowercase English letters, return true if sentence is a pangram, or false otherwise.

 

Example 1:

Input: sentence = "thequickbrownfoxjumpsoverthelazydog"
Output: true
Explanation: sentence contains at least one of every letter of the English alphabet.
Example 2:

Input: sentence = "leetcode"
Output: false
ans:
class Solution {
    public boolean checkIfPangram(String sentence) {
        ArrayList<Character> list = new ArrayList<>();
        int count = 0;
        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                if (!list.contains(ch)) {
                    list.add(ch);
                    count++;
                }
            }
        }
        if (count == 26) {
            return true;
        }
        return false;
    }
}