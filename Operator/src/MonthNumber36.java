import java.util.Scanner;

public class MonthNumber36 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Month number:");
		int m = sc.nextInt();
		switch (m) {
		case 1:
			System.out.println("Jan");
			System.out.println("31 Days");
			break;
		case 2:
			System.out.println("feb");
			System.out.println("2Ddays or 29Days");
			break;
		case 3:
			System.out.println("March");
			System.out.println("31Days");
			break;
		case 4:
			System.out.println("April");
			System.out.println("30Days");
			break;
		case 5:
			System.out.println("May");
			System.out.println("31Days");
			break;
		case 6:
			System.out.println("June");
			System.out.println("30days");
			break;
		case 7:
			System.out.println("July");
			System.out.println("31Days");
			break;
		case 8:
			System.out.println("Aguest");
			System.out.println("31Days");
			break;
		case 9:
			System.out.println("September");
			System.out.println("30Days");
			break;
		case 10:
			System.out.println("October");
			System.out.println("31Days");
			break;
		case 11:
			System.out.println("November");
			System.out.println("30Days");
			break;
		case 12:
			System.out.println("December");
			System.out.println("31days");
			break;
		default:
			System.out.println("Invalid");

		}
	}
}
