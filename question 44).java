
You are given two integers n and t. Return the smallest number greater than or equal to n such that the product of its digits is divisible by t.

 

Example 1:

Input: n = 10, t = 2

Output: 10

Explanation:

The digit product of 10 is 0, which is divisible by 2, making it the smallest number greater than or equal to 10 that satisfies the condition.
ans:
class Solution {
    public int smallestNumber(int n, int t) {
      int num = n;
      int temp = num;
      while(temp >= n){
      int product = 1;
      while(temp > 0){
        int rem = temp % 10;
        product = product * rem;
        temp = temp / 10;
      } 
      if(num >= n){
        if(product % t == 0){
            return num;
        }
      }
      num++;
      temp = num;
      }
      return 0;
    }
}