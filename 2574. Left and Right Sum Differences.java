2574. Left and Right Sum Differences
Solved
Easy
Topics
premium lock icon
Companies
Hint
You are given a 0-indexed integer array nums of size n.

Define two arrays leftSum and rightSum where:

leftSum[i] is the sum of elements to the left of the index i in the array nums. If there is no such element, leftSum[i] = 0.
rightSum[i] is the sum of elements to the right of the index i in the array nums. If there is no such element, rightSum[i] = 0.
Return an integer array answer of size n where answer[i] = |leftSum[i] - rightSum[i]|.

 

Example 1:

Input: nums = [10,4,8,3]
Output: [15,1,11,22]
Explanation: The array leftSum is [0,10,14,22] and the array rightSum is [15,11,3,0].
The array answer is [|0 - 15|,|10 - 11|,|14 - 3|,|22 - 0|] = [15,1,11,22].
ans:
class Solution {
    public int[] leftRightDifference(int[] nums) {
        int right[] = new int[nums.length];
        int left[] = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            //claculate rightsum 
            int rightSum = 0;
            for (int j = i + 1; j < nums.length; j++) {
                rightSum = rightSum + nums[j];
            }
            right[i] = rightSum;
            //calculate leftsum
            int leftSum = 0;
            for (int j = 0; j < i; j++) {
                leftSum = leftSum + nums[j];
            }
            left[i] = leftSum;
        }
        //final values stored in answer
        int ans[] = new int[nums.length];
        for (int i = 0; i < left.length; i++) {
            ans[i] = Math.abs(left[i] - right[i]);
        }
        return ans;
    }
}