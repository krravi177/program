import java.util.Scanner;

public class Fibonacci_with_method {
	static int n1 = 0, n2 = 1, n3;
	static void fibo(int count)

	{
		

		for (int i = 2; i < count; i++) {
			n3 = n1 + n2;
			System.out.print(" " + n3);
			n1 = n2;
			n2 = n3;
		}

	}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int count=sc.nextInt();
	System.out.print(n1+" "+n2);
    fibo(count-0);
}
}
