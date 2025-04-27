
You are given a string s, you need to print its characters at even indices (index starts at 0).

Examples:

Input: s = "Geeks"
Output: Ges
Explanation: The even indices characters are printed.

Ans:
import java.util.*;

public class Main {
    public static void main(String args[]) {
        // Your Code Here
        Scanner obj=new Scanner(System.in);
        String s=obj.next();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(i%2==0){
                System.out.print(ch);
            }
        }
    }
}