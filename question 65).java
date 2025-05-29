The complement of an integer is the integer you get when you flip all the 0's to 1's and all the 1's to 0's in its binary representation.

For example, The integer 5 is "101" in binary and its complement is "010" which is the integer 2.
Given an integer num, return its complement.

 

Example 1:

Input: num = 5
Output: 2
Explanation: The binary representation of 5 is 101 (no leading zero bits), and its complement is 010. So you need to output 2
ans:
class Solution {
    public int findComplement(int num) {
       StringBuilder bin = new StringBuilder();
       while(num > 0){
        int rem = num % 2;
         bin.append(rem);
        num = num / 2;
       } 
       for(int i = 0; i < bin.length(); i++){
          if(bin.charAt(i) == '1'){
            bin.setCharAt(i,'0');
          }
           else{
            bin.setCharAt(i , '1');
          }
       }
       bin.reverse();
       int ans = Integer.parseInt(bin.toString(),2);
       return ans;
    }
}