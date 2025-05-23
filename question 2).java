
Given a non null integer matrix Grid of dimensions NxM.Calculate the sum of its elements.

Example 1:

Input:
N=2,M=3
Grid=
[[1,0,1],
[-8,9,-2]]
Output:
1
Explanation:
The sum of all elements of the matrix is 
(1+0+1-8+9-2)=1
Ans:
class Solution {
    int sumOfMatrix(int N, int M, int[][] Grid) {
        // code here
        int sum=0;
        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                sum+=Grid[i][j];
            }
        }
        return sum;
    }
}