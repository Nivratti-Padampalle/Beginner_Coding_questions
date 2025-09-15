1935. Maximum Number of Words You Can Type
Solved
Easy
Topics
premium lock icon
Companies
Hint
There is a malfunctioning keyboard where some letter keys do not work. All other keys on the keyboard work properly.

Given a string text of words separated by a single space (no leading or trailing spaces) and a string brokenLetters of all distinct letter keys that are broken, return the number of words in text you can fully type using this keyboard.

 

Example 1:

Input: text = "hello world", brokenLetters = "ad"
Output: 1
Explanation: We cannot type "world" because the 'd' key is broken.
Example 2:

Input: text = "leet code", brokenLetters = "lt"
Output: 1
Explanation: We cannot type "leet" because the 'l' and 't' keys are broken.
Example 3:

Input: text = "leet code", brokenLetters = "e"
Output: 0
Explanation: We cannot type either word because the 'e' key is broken

ans:
class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        //solution 1 brute force 
        int count = 0;
        //to count the no of words in text
        String parts[] = text.split(" ");
        for (int i = 0; i < parts.length; i++) {
            if (isText(parts[i], brokenLetters)) {
                count++;
            }
        }
        return count;
    }

    private boolean isText(String str, String str2) {
        for (int i = 0; i < str2.length(); i++) {
            char ch = str2.charAt(i);
            for (int t = 0; t < str.length(); t++) {
                if (ch == str.charAt(t)) {
                    return false;
                }
            }
        }
        return true;
    }
}