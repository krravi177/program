import java.util.Scanner;

public class PrimeDigitex68 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		int sum = 0;
		for (int i = 2; i <= n; i++) {
			boolean b = isPrime(i);
			if (b) {
				sum = sum + i;
			}
		}
		System.out.println(sum);
	}

	static boolean isPrime(int x) {
		for (int i = 2; i <=  x / 2; i++)

		{

			if (x % i == 0)
				return false;
		}

		return true;
	}
}
