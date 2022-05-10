import java.util.Scanner;

public class Mainprt3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the values of N:");
		int n = sc.nextInt();// 5
		for (int i = 5; i > 1; i--) {
			for (int j = 1; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
