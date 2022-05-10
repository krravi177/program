import java.util.Scanner;
public class Student {
	public static void main(String[] args) {
		int s;
		for(int i=2;i<100;i++)
		{
		boolean	isPrime=true;
			for(int j=2;j<i;j++)
			{
				if(i%j==0 || i==9)
				isPrime=false;
				break;
			}
			if(isPrime)
				System.out.println(i+" ");
		}
	}
}
