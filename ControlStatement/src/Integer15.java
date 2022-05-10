import java.util.Scanner;

public class Integer15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two integer values:");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		if (n1 == n2)
			System.out.println("The integer values is same:");
		else
			System.out.println("The integer is not same:");

	}
}
