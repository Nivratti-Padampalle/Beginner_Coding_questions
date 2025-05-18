You are given two integer arrays nums1 and nums2 of sizes n and m, respectively. Calculate the following values:

answer1 : the number of indices i such that nums1[i] exists in nums2.
answer2 : the number of indices i such that nums2[i] exists in nums1.
Return [answer1,answer2].

 

Example 1:

Input: nums1 = [2,3,2], nums2 = [1,2]

Output: [2,1]
ans:
class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        ArrayList<Integer> list = new ArrayList<>();
        int count = 0;
        for(int i = 0; i < nums1.length; i++){
            for(int j = 0; j < nums2.length; j++){
                if(nums1[i] == nums2[j]){
                    count++;
                    break;
                }
            }
        }
        list.add(count);
         int count2 = 0;
            for(int i = 0; i < nums2.length; i++){
            for(int j = 0; j < nums1.length; j++){
                if(nums2[i] == nums1[j]){
                    count2++;
                    break;
                }
            }
        }
         list.add(count2);
         return new int[] {count ,count2};
    }
}