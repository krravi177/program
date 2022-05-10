import java.util.Scanner;

public class SmallestNumberexample1ex33 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the integer values:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int small  = (a < b) ? a : b;
		small = (small < c) ? small : c;
		System.out.println("Small is"+a);
	}
}
