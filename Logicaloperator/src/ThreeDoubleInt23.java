import java.util.Scanner;

public class ThreeDoubleInt23 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three integer type values:");
		int n = sc.nextInt();
		int a = 5, b = 7, c = 10;
		if (a <= b && a <= c)
			System.out.println(a + "is the smallest:");
		else if (b <= a && b <= c)
			System.out.println(b + "is the smallest:");
		else
			System.out.println(c + "is the smallest:");
	}
}
