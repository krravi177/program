import java.util.Scanner;

public class MainN41 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number:");
	int n=sc.nextInt();
	int a=1;
	while(a<=n)
	{
		System.out.println(a);
		a=a*2;
	}
}
}
