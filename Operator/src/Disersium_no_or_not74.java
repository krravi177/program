import java.util.Scanner;

public class Disersium_no_or_not74 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the nuber:");
		int x = sc.nextInt();
		boolean rs = isDiseresium(x);
		if (rs == true)
			System.out.println(" is Diseresium");
		else
			System.out.println("is not Diseresium");

	}

	static boolean isDiseresium(int n) {
		int sum = 0, t = n;
		int dc = countDigits(n);
		do {
			int r = n % 10;
			sum = sum + getpow(r, dc);
			n = n / 10;

		} while (n != 0);
		return sum == t;
	}

	static int countDigits(int a) {
		int count = 0;
		do {
			count++;
			a = a / 10;
		} while (a != 0);
		return count;

	}

	static int getpow(int n, int p) {
		int pow = 1;
		while (p > 0) {
			pow = pow * n;
			p--;
		}
		return pow;
	}
}
