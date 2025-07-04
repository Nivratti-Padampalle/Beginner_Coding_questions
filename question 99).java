Given an integer array sorted in non-decreasing order, there is exactly one integer in the array that occurs more than 25% of the time, return that integer.

 

Example 1:

Input: arr = [1,2,2,6,6,6,6,7,10]
Output: 6
ans:
class Solution {
    public int findSpecialInteger(int[] arr) {
        int n = arr.length;
        int num = (n * 25) / 100;
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = i; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count > num) {
                return arr[i];
            }
        }
        return -1;
    }
}