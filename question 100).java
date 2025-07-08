Given an array of integers nums, calculate the pivot index of this array.

The pivot index is the index where the sum of all the numbers strictly to the left of the index is equal to the sum of all the numbers strictly to the index's right.

If the index is on the left edge of the array, then the left sum is 0 because there are no elements to the left. This also applies to the right edge of the array.

Return the leftmost pivot index. If no such index exists, return -1.

 

Example 1:

Input: nums = [1,7,3,6,5,6]
Output: 3
Explanation:
The pivot index is 3.
Left sum = nums[0] + nums[1] + nums[2] = 1 + 7 + 3 = 11
Right sum = nums[4] + nums[5] = 5 + 6 = 11
ans:
class Solution {
    public int pivotIndex(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int leftsum = 0;
            if (i == 0) {
                leftsum = 0;
            } else {
                for (int j = 0; j < i; j++) {
                    leftsum = leftsum + nums[j];
                }
            }
            int rightsum = 0;
            if (i == nums.length - 1) {
                rightsum = 0;
            } else {
                for (int k = i + 1; k < nums.length; k++) {
                    rightsum = rightsum + nums[k];
                }
            }
            if (leftsum == rightsum) {
                return i;
            }
        }
        return -1;
    }
}