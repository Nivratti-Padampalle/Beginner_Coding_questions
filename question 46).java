You are given a positive integer n. Each digit of n has a sign according to the following rules:

The most significant digit is assigned a positive sign.
Each other digit has an opposite sign to its adjacent digits.
Return the sum of all digits with their corresponding sign.

 

Example 1:

Input: n = 521
Output: 4
Explanation: (+5) + (-2) + (+1) = 4.
ans:
class Solution {
    public int alternateDigitSum(int n) {
        int sum = 0;
        String str = Integer.toString(n);
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            int digit = ch - '0';
            if(i % 2 == 0){
                sum = sum + digit;
            }
            else{
                sum = sum - digit;
            }
        }
        return sum;
    }
}