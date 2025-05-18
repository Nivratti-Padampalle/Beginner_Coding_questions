Given two 0-indexed integer arrays nums1 and nums2, return a list answer of size 2 where:

answer[0] is a list of all distinct integers in nums1 which are not present in nums2.
answer[1] is a list of all distinct integers in nums2 which are not present in nums1.
Note that the integers in the lists may be returned in any order.

 

Example 1:

Input: nums1 = [1,2,3], nums2 = [2,4,6]
Output: [[1,3],[4,6]]
Explanation:
For nums1, nums1[1] = 2 is present at index 0 of nums2, whereas nums1[0] = 1 and nums1[2] = 3 are not present in nums2. Therefore, answer[0] = [1,3].
For nums2, nums2[0] = 2 is present at index 1 of nums1, whereas nums2[1] = 4 and nums2[2] = 6 are not present in nums1. Therefore, answer[1] = [4,6].S
ans:
class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[]nums2){
       ArrayList<Integer> list = new ArrayList<Integer>();
       ArrayList<Integer> list2 = new ArrayList<Integer>();
       List<List<Integer>> answer = new ArrayList<List<Integer>>();
       for(int i = 0; i < nums1.length; i++){
        boolean notpresent = true;
        for(int j = 0; j < nums2.length; j++){
            if(nums1[i] == nums2[j]){
                notpresent = false;
                break;
            }
        }
        if(notpresent && !list.contains(nums1[i])){
            list.add(nums1[i]);
        }
       }
       answer.add(list);
       // for nums2 elemnts 
       for(int i = 0; i < nums2.length; i++){
        boolean notpresent = true;
        for(int j = 0; j < nums1.length; j++){
            if(nums2[i] == nums1[j]){
                notpresent = false;
                break;
            }
        }
        if(notpresent && !list2.contains(nums2[i])){
            list2.add(nums2[i]);
        }
       }
       answer.add(list2); 
       return answer;
    }
}