You are given an array of positive integers nums.

Alice and Bob are playing a game. In the game, Alice can choose either all single-digit numbers or all double-digit numbers from nums, and the rest of the numbers are given to Bob. Alice wins if the sum of her numbers is strictly greater than the sum of Bob's numbers.

Return true if Alice can win this game, otherwise, return false.
ans:
class Solution {
    public boolean canAliceWin(int[] nums) {
        int single_digit_sum = 0;
        int double_sum = 0;
      for(int i = 0; i < nums.length; i++){
        if(nums[i] < 10){
        single_digit_sum =  single_digit_sum + nums[i];
        }
        else if(nums[i] >= 10){
            double_sum = double_sum + nums[i];
        }
      } 
      if(single_digit_sum > double_sum){
        return true;
      }else if(double_sum > single_digit_sum){
        return true;
      }
      return false; 
    }
}