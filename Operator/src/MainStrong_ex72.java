import java.util.Scanner;

public class MainStrong_ex72 {
	static boolean isStrong(int n)
	{  
		int sum=0,t=n;
		do {
			int r=n%10;
			sum=sum+fact(r);
			n=n/10;
			
		}while(n!=0);
		return sum==t;
	}
static int fact(int n)
	{
		int fact=1;
		while(n>1)
		{
			fact=fact*n;
			n--;
		}
		return fact;
	}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number:");
	int n=sc.nextInt();
	boolean rs=isStrong(n);
	if(rs==true)
	System.out.println("Strong Number");
	else
		System.out.println("is Not Strong Number:");
}	
}
	

