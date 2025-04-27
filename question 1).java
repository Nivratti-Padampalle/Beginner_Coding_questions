question 1)
Given a positive integer n. Your task is to return the count of set bits.

Examples:

Input: n = 6
Output: 2
Explanation: Binary representation is '110', so the count of the set bit is 2.
Ans:
class Solution {
    static int setBits(int n) {
        // code here
        String bin="";
        while(n>0){
            int rem=n%2;
            bin+=rem;
            n=n/2;
        }
        int count=0;
        for(int i=0;i<bin.length();i++){
            char ch=bin.charAt(i);
            if(ch == '1'){
                count++;
            }
        }
        return count;
    }
}