Given a m x n matrix grid which is sorted in non-increasing order both row-wise and column-wise, return the number of negative numbers in grid.

 

Example 1:

Input: grid = [[4,3,2,-1],[3,2,1,-1],[1,1,-1,-2],[-1,-1,-2,-3]]
Output: 8
Explanation: There are 8 negatives number in the matrix.
Example 2:

Input: grid = [[3,2],[1,0]]
Output: 0
ans:
class Solution {
    public int countNegatives(int[][] grid) {
      int count = 0;
      int m = grid.length;
      int n = grid[0].length;
      for(int i = 0; i < m; i++){
        for(int j = 0; j < n; j++){
            if(grid[i][j] < 0){
                count++;
            }
        }
      } 
      return count; 
    }
}