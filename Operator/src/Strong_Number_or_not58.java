import java.util.Scanner;

public class Strong_Number_or_not58 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number:");
		int n = sc.nextInt();
		int sum = 0, t=n;
		
		do {
			int d = n % 10;
			int f = 1;

			while (d > 1)
			{
				f = f * d;
				d--;
			}
			sum = sum + f;
			n = n / 10;

		} while (n != 0);
		if (sum == t)
			System.out.println("Strong");
		else
			System.out.println("not strong");
	}
}
