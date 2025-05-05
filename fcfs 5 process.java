//fcfs code for calculating waiting time from user input it takes 5 process as input and calculated its average waiting time
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
           System.out.println("enter first process ");
           int p1 = obj.nextInt();
             System.out.println("enter second process ");
           int p2 = obj.nextInt();
             System.out.println("enter third process ");
           int p3 = obj.nextInt();
             System.out.println("enter fourth process ");
           int p4 = obj.nextInt();
             System.out.println("enter fifth process ");
           int p5 = obj.nextInt();
           int wait_time = 0;
           int a = wait_time;
           int b = a+ p1;
           int c = b+ p2;
           int d = c +p3;
           int e = d+p4;
           float avg= (float)(a+b+c+d+e)/5;
           System.out.println(avg);
    }
}