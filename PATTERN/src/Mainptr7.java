import java.util.Scanner;

public class Mainptr7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ente rthe values of N:");
		int n = sc.nextInt();//5
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				System.out.print((char) (j + 64) + " ");
			}
			System.out.println();
		}
	}
}
