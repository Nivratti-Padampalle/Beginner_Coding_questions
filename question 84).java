A sentence is a list of words that are separated by a single space with no leading or trailing spaces. Each of the words consists of only uppercase and lowercase English letters (no punctuation).

For example, "Hello World", "HELLO", and "hello world hello world" are all sentences.
You are given a sentence s​​​​​​ and an integer k​​​​​​. You want to truncate s​​​​​​ such that it contains only the first k​​​​​​ words. Return s​​​​​​ after truncating it.

 

Example 1:

Input: s = "Hello how are you Contestant", k = 4
Output: "Hello how are you"
Explanation:
The words in s are ["Hello", "how" "are", "you", "Contestant"].
The first 4 words are ["Hello", "how", "are", "you"].
Hence, you should return "Hello how are you".
ans:
class Solution {
    public String truncateSentence(String s, int k) {
      String[] parts = s.split(" ");
      StringBuilder ans = new StringBuilder(); 
      for(int i = 0; i < k; i++){
        ans.append(parts[i]);
        if(i < k -1){
            ans.append(" ");
        }
      }
      return ans.toString(); 
    }
}
//brute force approach
class Solution {
    public String truncateSentence(String s, int k) {
        String[] parts = s.split(" ");
        String ans = "";
        for (int i = 0; i < k; i++) {
            ans = ans + parts[i];
            if (i < k - 1) {
                ans = ans + " ";
            }
        }
        return ans;
    }
}S