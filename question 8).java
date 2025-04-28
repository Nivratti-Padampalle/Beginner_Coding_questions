You are given a string s. Your task is to determine if the string is a palindrome. A string is considered a palindrome if it reads the same forwards and backwards.

Examples :

Input: s = "abba"
Output: true
Explanation: "abba" reads the same forwards and backwards, so it is a palindrome.
Ans:
class Solution {
    boolean isPalindrome(String s) {
        String org = s;
        String rev ="";
        for(int i = org.length()-1; i >= 0; i--){
            char ch=org.charAt(i);
            rev+=ch;           
        }
        if(org.equals(rev)){
            return true;
        }
        return false;
    }
} 