import java.util.Scanner;

public class MainHappy_ex76 {
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the values:");
		int n = sc.nextInt();
		boolean rs = isHappy(n);
		if (rs == true)
			System.out.println("Happy Number");
		else
			System.out.println("is Not happy Number:");
	}

	static boolean isHappy(int x) {
		while (x > 9)
			;
		int sum = 0;
		do {
			int d = x % 10;
			sum = sum + d * d;
			x = x / 10;

		} while (x != 0);
		x = sum;
		return x == 7 || x == 1;
	}

}
