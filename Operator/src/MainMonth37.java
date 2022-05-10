import java.util.Scanner;

public class MainMonth37 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the month number:");
		int m = sc.nextInt();
		switch (m) {
		case 1:
			System.out.println("31Days");
			break;
		case 2:
			System.out.println("28 or 29 days");
			break;
		case 3:
			System.out.println("31days");
			break;
		case 4:
			System.out.println("30Days");
			break;
		case 5:
			System.out.println("31Days");

		}
	}
}
