You are given an m x n integer matrix matrix with the following two properties:

Each row is sorted in non-decreasing order.
The first integer of each row is greater than the last integer of the previous row.
Given an integer target, return true if target is in matrix or false otherwise.

ans:
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("enter no of rows");
        int m = obj.nextInt();
         System.out.println("enter no of column");
        int n = obj.nextInt();
        int a[][] = new int[m][n];
         System.out.println("enter array elemnts");
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                a[i][j] = obj.nextInt();
            }
        }
        System.out.println("enter your target element");
          int target = obj.nextInt();
           boolean found = false;
         for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
              if(a[i][j] == target){
                  System.out.println(a[i][j]);
                  found = true;
              }
            }
            if(found) break;
        }
        if(!found){
          System.out.println(" target element not found");
        }
    }
}