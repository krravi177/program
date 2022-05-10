import java.util.Scanner;

public class MainEO38 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the integer Number:");
		int n = sc.nextInt();
		switch (n % 2) {
		case 0:
			System.out.println(n + "is Even");
			break;
		case 1:
			System.out.println(n + "is Odd");
			break;
		}
	}
}
