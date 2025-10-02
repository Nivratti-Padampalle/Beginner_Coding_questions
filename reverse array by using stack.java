/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;
import java.util.Stack;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    	System.out.println("Enter size of an array");
	        int size = sc.nextInt();
	        System.out.println("Enter array elements");
	        int[] arr = new int[size];
	        for(int i = 0; i < size; i++){
	            arr[i] = sc.nextInt();
	        }
	        //
	        Stack<Integer> stack = new Stack<>();
	        for(int num : arr){
	            stack.push(num);
	            
	        }
	        while(!stack.isEmpty()){
	            System.out.print(stack.pop() + " ");
	        }
	}
}

