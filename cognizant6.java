import java.util.Scanner;
class cognizant6{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("enter size of array");
int size = sc.nextInt();
int a[] = new int[size];
for(int i = 0; i < size; i++){
a[i] = sc.nextInt();
}
int result = CountGerrnToRed(a);
System.out.println(result);
}
private static int CountGerrnToRed(int[] a){

int count = 0;
        String prevPen = "";

        for (int i = 0; i < a.length; i++) {
            String currentPen = (a[i] % 2 == 0) ? "red" : "green";

            if (prevPen.equals("green") && currentPen.equals("red")) {
                count++;
            }

            prevPen = currentPen;
        }

        return count;

}
}