import java.util.Scanner;

public class EvenOdd21 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the inter=ger values:");
		int n = sc.nextInt();
		if (n / 2 * 2 == n)
			System.out.println(n + "is even");
		else
			System.out.println(n + "is not even");
	}
}