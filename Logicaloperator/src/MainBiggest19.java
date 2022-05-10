
import java.util.Scanner;

public class MainBiggest19 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the integer values:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		if (a > b && a > c)
			System.out.println(a + "is Biggest:");
		else if (b > c)
			System.out.println(b + "is Biggest:");
		else
			System.out.println(c + "is Biggest:");
	}
}
