import java.util.Scanner;
public class Armstrongno49 {
	public static void main(String[] args) {
		System.out.println("Enter the integer values:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0, t = n;
		do {
			int r = n % 10;
			sum = sum * r * r * r;
			n = n / 10;
		} while (n != 0);
		if (sum == t)
			System.out.println("Arm Strong Number:");
		else
			System.out.println("Not Arm Strong Number");
	}
}
