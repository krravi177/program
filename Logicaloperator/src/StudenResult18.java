import java.util.Scanner;

public class StudenResult18 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int p = sc.nextInt();
		int c = sc.hashCode();
		int b = sc.nextInt();
		if (p >= 35 && c > 35 && m > 35 && b >= 35)
			System.out.println("Pass");
		else
			System.out.println("Fail");
		if (m < 35 || p < 35 || c < 35 || b < 35)
			System.out.println("Fail");
		else
			System.out.println("Pass");

	}
}
