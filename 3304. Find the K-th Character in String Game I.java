3304. Find the K-th Character in String Game I
Solved
Easy
Topics
premium lock icon
Companies
Hint
Alice and Bob are playing a game. Initially, Alice has a string word = "a".

You are given a positive integer k.

Now Bob will ask Alice to perform the following operation forever:

Generate a new string by changing each character in word to its next character in the English alphabet, and append it to the original word.
For example, performing the operation on "c" generates "cd" and performing the operation on "zb" generates "zbac".

Return the value of the kth character in word, after enough operations have been done for word to have at least k characters.

 

Example 1:

Input: k = 5

Output: "b"

Explanation:

Initially, word = "a". We need to do the operation three times:

Generated string is "b", word becomes "ab".
Generated string is "bc", word becomes "abbc".
Generated string is "bccd", word becomes "abbcbccd".
Example 2:

Input: k = 10

Output: "c"
ans:
class Solution {
    public char kthCharacter(int k) {
        String str = "a";
        int n = str.length();
        while (n < k) {
            for (int i = 0; i < n; i++) {
                // ch = "a"
                char ch = str.charAt(i);  
                int x = (int) ch;
                // x = 97;
                x = x + 1;
                //x = 97 + 1; //x = 98
                char next = (char) x;
                //next = 'b'
                str = str + next;
                //str = 'a' + 'b'// str = "ab"
            }
            n = str.length();
        }
        return str.charAt(k - 1);
    }
}