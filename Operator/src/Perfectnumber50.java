import java.util.Scanner;

public class Perfectnumber50 {
public static void main(String[] args) {
	System.out.println("Enter the integer values:");
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int sum=0,i=1;
	while(i<=n/2)
	{
		if(n%i==0)
			sum=sum+i;
		i++;
	}
		if (sum==n)
		
	
			System.out.println("perfect number:");
		else
			System.out.println("not perfect number:");
	
}
}

