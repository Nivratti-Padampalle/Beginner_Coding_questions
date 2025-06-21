import java.util.Scanner;
class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		str = str.toUpperCase();
		int result = totalsum(str);
		System.out.println(result);
		sc.close();
	}
	public static int totalsum(String str) {
		int sum = 0;
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			int ascii = (int) ch;
			int index = (i+1);
			int product = index * ascii;
			if(ascii % 2 != 0  || index % 2 != 0) {
				sum = sum + product;
			}
		}
		return sum;
	}
}