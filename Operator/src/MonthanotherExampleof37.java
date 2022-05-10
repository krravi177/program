import java.util.Scanner;

public class MonthanotherExampleof37 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Month Days:");
		int m = sc.nextInt();
		switch (m) {
		case 1:

		case 3:

		case 5:

		case 7:

		case 8:

		case 10:

		case 12:
			System.out.println("31Days");
			break;
		case 2:
			System.out.println("28 or 29 Days");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("30Days");
			break;
		default:
			System.out.println("Invalid Month Number");

		}
	}
}
