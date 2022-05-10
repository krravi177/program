import java.util.Scanner;
public class Palindromex70 {
static boolean ispalindroms(int x) {
int a,res=0;
int t=x;
do {
	a=x%10;
	res=res*10+a;
	x=x/10;
}while(x!=0);
if(res==t)
	return true;
	else
		return false;

}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number:");
	int n=sc.nextInt();
	boolean rs=ispalindroms(n);
	if(rs==true)
	System.out.println(n+"is a palindroms");
	else
		System.out.println(n+"is not palindroms");
}
}
