import java.util.Scanner;

public class Xylen_or_pholem60 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int n = sc.nextInt();
		int os = 0, ms = 0;
		os = os + n % 10;
		n = n / 10;
		while (n > 9) {
			ms = ms + n % 10;

		}
		os = os + n;
		if (os == ms)
			System.out.println("Xylen");
		else
			System.out.println("Pholem");
	}
}
