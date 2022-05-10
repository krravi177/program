import java.util.Scanner;

class Mianptt1 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no.of lines");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n - 1; j++)
			{
				System.out.println("  ");
			}
			for(int j=1; j<=n%2;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
