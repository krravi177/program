import java.util.Scanner;

public class Higestlength {

public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the");
    int n=sc.nextInt();
    String name[]=new String[n];
    System.out.println("Enter"+n+"names");
   sc.nextLine();
   for(int i=0;i<name.length;i++)
   {
	   
   name[i]=sc.nextLine();
   }
   System.out.println(name[5]);
	}
}
/*static String higestLength(String st[])
{
	String hs=st[0];
	for(int i=1;i<st.length;i++)
	{
		if(hs.length()<st[i].length())
			hs=st[i];
	}
	return hs;
}
}*/
