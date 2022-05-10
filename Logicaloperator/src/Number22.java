import java.util.Scanner;

public class Number22 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two digit number:");
		int n = sc.nextInt();
		if (n >= 10 && n <= 10)
			System.out.println("The value is two digit:");
		else if (n <= -10 && n <= -99)
			System.out.println("The value is two digit:");
		else
			System.out.println(" not a two digit:");
	}
}
