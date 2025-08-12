
Code
Testcase
Testcase
Test Result
1528. Shuffle String
ans:
You are given a string s and an integer array indices of the same length. The string s will be shuffled such that the character at the ith position moves to indices[i] in the shuffled string.

Return the shuffled string.
Input: s = "codeleet", indices = [4,5,6,7,0,2,1,3]
Output: "leetcode"
Explanation: As shown, "codeleet" becomes "leetcode" after shuffling.
ans:
class Solution {
    public String restoreString(String s, int[] indices) {
        //solution1 
        /* char[] ans = new char[s.length()];
        for (int i = 0; i < indices.length; i++) {
            ans[indices[i]] = s.charAt(i);
        }
        return String.valueOf(ans);
        */
        //solution2 using hashmap
        HashMap<Integer, Character> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            map.put(indices[i], s.charAt(i));
        }
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            ans.append(map.get(i));
        }
        return ans.toString();
    }
}