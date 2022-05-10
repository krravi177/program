import java.util.Scanner;

public class EvenOdd21anotherway {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the integer values:");
		int n = sc.nextInt();
		String st[] = { "Even", "odd" };
		System.out.println(n + "is" + st[n % 2]);
		System.out.println(n + "is Even:");

		System.out.println(n + "is Odd");
	}
}
