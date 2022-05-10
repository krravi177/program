import java.util.Scanner;

public class MonthDaysDisplay24 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the month number:");
		int m = sc.nextInt();
		if (m == 1 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12)
			System.out.println("31 days:");
		else if (m == 4 || m == 6 || m == 9 || m == 11)
			System.out.println("30Days");
		else if (m == 2)
			System.out.println("28days,29Days");
		else
			System.out.println("Invalid");
	}
}
