import java.util.Scanner;

public class Mainptr6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the values of N:");
		int n = sc.nextInt();//5
		for (int i = 1; i <= n; i++) {
			for (int j = n; j >= 1; j--) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}
