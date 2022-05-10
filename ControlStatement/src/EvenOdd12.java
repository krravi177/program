import java.util.Scanner;

public class EvenOdd12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the integer number:");
		int n = sc.nextInt();
		if (n % 2 == 0)
			System.out.println("The value is even:");
		else
			System.out.println("The value is odd:");
	}
}
