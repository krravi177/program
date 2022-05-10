import java.util.Scanner;

public class Month17 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of month:");
		int m = sc.nextInt();
		if (m >= 1 && m <= 12)
			System.out.println("Valid:");
		else
			System.out.println("Invalid:");

	}
}
