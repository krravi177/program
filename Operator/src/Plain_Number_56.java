import java.util.Scanner;
public class Plain_Number_56 {
	public static void main(String[] args) {
		System.out.println("Enter a Number:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int rev = 0, t = n;
		do {
			rev = rev * 10 + n;
			n = n / 10;
		} while (n != 0);
		if (rev == t)
			System.out.println("palindrom");
		else
			System.out.println("not palindrom");
	}
}
