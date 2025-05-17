
You are given an array of unique integers salary where salary[i] is the salary of the ith employee.

Return the average salary of employees excluding the minimum and maximum salary. Answers within 10-5 of the actual answer will be accepted.

 

Example 1:

Input: salary = [4000,3000,1000,2000]
Output: 2500.00000
Explanation: Minimum salary and maximum salary are 1000 and 4000 respectively.
Average salary excluding minimum and maximum salary is (2000+3000) / 2 = 2500
ans:
class Solution {
    public double average(int[] salary) {
        double total = 0;
         int max = 0;
         int min = salary[0];
         int count = 0;
         //here  count is used for count how many salaries are present in array
      for(int i = 0; i < salary.length; i++){
        total = total + salary[i];
        count++;
        if(salary[i] > max){
          max = salary[i];
        }
        if(salary[i] < min){
            min = salary[i];
        }
      }  
      int n = count - 2;
      double avg = (total-(max+min))/n;
      return avg;
    }
}