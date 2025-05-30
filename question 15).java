1662. Check If Two String Arrays are Equivalent

Given two string arrays word1 and word2, return true if the two arrays represent the same string, and false otherwise.

A string is represented by an array if the array elements concatenated in order forms the string.

 Example 1:

Input: word1 = ["ab", "c"], word2 = ["a", "bc"]
Output: true
Explanation:
word1 represents string "ab" + "c" -> "abc"
word2 represents string "a" + "bc" -> "abc"
The strings are the same, so return true.

Ans:
class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String add1="";
        String add2="";
        for(int i = 0; i < word1.length; i++){
            add1 = add1 + word1[i];
        }
        for(int j = 0; j < word2.length; j++){
            add2 = add2 + word2[j];
        }
        if(add1.equals(add2)){
            return true;
        }
        return false;
    }
}