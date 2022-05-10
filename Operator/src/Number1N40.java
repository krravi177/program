import java.util.Scanner;

public class Number1N40 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the integer values");
		int n = sc.nextInt();
		int i = 1;
		while (i < n) {
			System.out.println(i);
			i++;
		}
	}
}
