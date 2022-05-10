import java.util.Scanner;

public class Integer30 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter integer values:");
		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int big = (a > b) ? a : b;
		big = (big > c) ? big : c;
		System.out.println("biggest is" + big);
	}
}
