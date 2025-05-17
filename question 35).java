Given an array of integers arr, a lucky integer is an integer that has a frequency in the array equal to its value.

Return the largest lucky integer in the array. If there is no lucky integer return -1.
Example 1:

Input: arr = [2,2,3,4]
Output: 2
Explanation: The only lucky number in the array is 2 because frequency[2] == 2.
ans:
class Solution {
    public int findLucky(int[] arr) {
      HashMap<Integer,Integer> map = new HashMap<>();
      for(int num : arr){
        map.put(num , map.getOrDefault(num,0)+1);
      } 
      int max_lucky = -1;
       for(Map.Entry<Integer,Integer> entry : map.entrySet()){
        if(entry.getKey().equals(entry.getValue()) ){
          if(max_lucky < entry.getKey()){
             max_lucky = entry.getKey();
          }
        }
       }
       return max_lucky;
    }
}