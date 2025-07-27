34. Find First and Last Position of Element in Sorted Array
Solved
Medium
Topics
premium lock icon
Companies
Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.

If target is not found in the array, return [-1, -1].

You must write an algorithm with O(log n) runtime complexity.

 

Example 1:

Input: nums = [5,7,7,8,8,10], target = 8
Output: [3,4]
Example 2:

Input: nums = [5,7,7,8,8,10], target = 6
Output: [-1,-1]
Example 3:

Input: nums = [], target = 0
Output: [-1,-1]
ans:
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int result[] = new int[2];
        result[0] = first(nums, target);
        result[1] = last(nums, target);
        return result;
    }

    private int first(int[] nums, int target) {
        int s = 0;
        int e = nums.length - 1;
        int index = -1;
        while (s <= e) {
            int mid = (s + e) / 2;
            if (nums[mid] == target) {
                index = mid;
                e = mid - 1;
                ;
            } else if (nums[mid] < target) {
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }
        return index;
    }

    private int last(int[] nums, int target) {
        int s = 0;
        int e = nums.length - 1;
        int index = -1;
        while (s <= e) {
            int mid = (s + e) / 2;
            if (nums[mid] == target) {
                index = mid;
                s = mid + 1;
                ;
            } else if (nums[mid] < target) {
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }
        return index;
    }
}