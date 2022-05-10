import java.util.Scanner;

public class Integer11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two digit integer values:");
		int x = sc.nextInt();
		int d1 = x / 10;
		int d2 = x % 10;
		int sum = d1 + d2 + d1 * d2;
		if (sum == x)
			System.out.println(x + " is specical two digit number:");
		else
			System.out.println(x + " is not a specical two digit number:");
	}
}
