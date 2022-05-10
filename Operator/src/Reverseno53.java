import java.util.Scanner;

public class Reverseno53 {
	public static void main(String[] args) {
		System.out.println("Enter inter the values:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int rev = 0;//123
		do {
			int d = n % 10;
			rev = rev * 10 + d;
			n = n / 10;
		} while (n != 0);
		System.out.println("Reverse" + rev);
	}
}
