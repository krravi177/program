import java.util.Scanner;

public class EvenNumber29 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Even Number:");
		int x = sc.nextInt();
		String rs = (x % 2 == 0) ? "Even" : "Odd";
		System.out.println(x + "is" + rs);
	}
}
