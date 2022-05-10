import java.util.Scanner;

public class Main1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any positive numbr:");
		int p = sc.nextInt();
		int q = sc.nextInt();
		int sum, sub, mul, mod;
		float div;
		sum = p + q;
		sub = p - q;
		mul = p * q;
		div = p / q;
		mod = p % q;

		System.out.println("sum");
		System.out.println("sub");
		System.out.println("mul");
		System.out.println("div");
		System.out.println("mod");
	}
}
