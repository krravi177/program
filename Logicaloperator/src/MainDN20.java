import java.util.Scanner;

public class MainDN20 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the integer values:");
		int n = sc.nextInt();
		if (n > 1 && n < 9)
			System.out.println(n + "is a digit:");
		else
			System.out.println(n + "is not a digit:");
	}
}
