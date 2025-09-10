
Indexes of Subarray Sum
Difficulty: MediumAccuracy: 16.5%Submissions: 1.8MPoints: 4Average Time: 20m
Given an array arr[] containing only non-negative integers, your task is to find a continuous subarray (a contiguous sequence of elements) whose sum equals a specified value target. You need to return the 1-based indices of the leftmost and rightmost elements of this subarray. You need to find the first subarray whose sum is equal to the target.

Note: If no such array is possible then, return [-1].

Examples:

Input: arr[] = [1, 2, 3, 7, 5], target = 12
Output: [2, 4]
Explanation: The sum of elements from 2nd to 4th position is 12.
Input: arr[] = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10], target = 15
Output: [1, 5]
Explanation: The sum of elements from 1st to 5th position is 15.
Input: arr[] = [5, 3, 4], target = 2
Output: [-1]
Explanation: There is no subarray with sum 2
ans:
class Solution {
    static ArrayList<Integer> subarraySum(int[] arr, int target) {
        // code here
        int n = arr.length;
        for(int i = 0; i < n; i++){
            int sum = 0;
            for(int j = i; j < n; j++){
                sum = sum + arr[j];
                if(sum > target){
                    break;
                }
                else if(sum == target){
                 ArrayList<Integer> list = new ArrayList<>();
                    list.add(i + 1);
                     list.add(j + 1);
                     return list;
                    
                }
            }
        }
        ArrayList<Integer> list = new ArrayList<>();
        list.add(-1); 
        return list;
    }
}
