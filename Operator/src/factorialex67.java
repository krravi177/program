import java.util.Scanner;

public class factorialex67 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the numbers:");
	int n=sc.nextInt();
	int factorial=fact(n);
	System.out.println(n+"! factorial of is "+factorial);
}
static int fact(int n)
{
	int output;
	if(n==0)
		return 1;
	output=fact(n-1)*n;
	return output;
}
}
