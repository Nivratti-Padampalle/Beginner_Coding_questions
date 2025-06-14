You are given an array nums consisting of positive integers.

Return the total frequencies of elements in nums such that those elements all have the maximum frequency.

The frequency of an element is the number of occurrences of that element in the array.

 

Example 1:

Input: nums = [1,2,2,3,1,4]
Output: 4
Explanation: The elements 1 and 2 have a frequency of 2 which is the maximum frequency in the array.
So the number of elements in the array with maximum frequency is 4.
ans:
class Solution {
    public int maxFrequencyElements(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            int frq = 0;
            for(int j = 0; j < nums.length; j++){
                if(nums[i] == nums[j]){
                    frq++;
                }
            }
            list.add(frq);
        }
        int max = list.get(0);
        for(int i = 1; i < list.size(); i++){
            if(list.get(i) > max){
                max = list.get(i);
            }
        }
        int count = 0;
        for(int i = 0; i < list.size(); i++){
            if(list.get(i) == max){
                count++;
            }
        }
        return count;
    }
}