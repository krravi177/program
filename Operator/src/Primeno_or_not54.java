import java.util.Scanner;

public class Primeno_or_not54 {
	public static void main(String[] args) {
		System.out.println("Enter the integer values:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 1;
		for (int j = 1; j <= n / 2; j++) {
			if (n % j == 0)
				count++;
		}
		if (count == 2)
			System.out.println("Prime number:");
		else
			System.out.println("Not Prime number:");
	}
}
