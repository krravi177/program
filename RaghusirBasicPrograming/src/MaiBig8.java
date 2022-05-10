import java.util.Scanner;

public class MaiBig8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any Two integer number:");
		int x = sc.nextInt();
		int y = sc.nextInt();
		int big = x;
		if (y > big)
			big = y;
		System.out.println("Biggest is:" + big);
	}
}
