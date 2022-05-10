import java.util.Scanner;

public class SanjuGeeta28 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number:");
		int x = sc.nextInt();
		if (x % 3 == 0 && x % 5 == 0)
			System.out.println("Sanju weds Geeta:");
		else if (x % 3 == 0)
			System.out.println("Sanju");
		else if (x % 5 == 0)
			System.out.println("Geeta");
		else
			System.out.println("Breakup");
	}
}
