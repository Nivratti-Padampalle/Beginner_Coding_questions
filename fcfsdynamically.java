import java.util.Scanner;
class fcfsdynamically{
public static void main(String args[]){
Scanner obj = new Scanner(System.in);
System.out.println("enter the number of processes you want");
int size = obj.nextInt();
int a[] = new int[size];
System.out.println("enter the brust time for each process of  size=" + size);
for(int i = 0; i < a.length; i++){
System.out.println("enter the burst time for  process " + (i+1) + "=");
a[i] = obj.nextInt();
}
System.out.println("you entered burst time for each process of size n is");
int j = 0;
for(int i = 0; i < a.length; i++){
System.out.println("for id:"+ (j+1) +"burst time ="+ a[i]);  
}
int wait_time = 0;
int total_waiting = 0;
int sum = 0;
for(int i = 1; i < size; i++){
sum = sum + a[i-1];
total_waiting = total_waiting + sum  ;
}
float avg = (float) (total_waiting + wait_time) / size;
System.out.println("Average waiting time = " + avg);
}
}