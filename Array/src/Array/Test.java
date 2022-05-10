package Array;
import java.util.ArrayList;
import java.util.Scanner;
public class Test {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	ArrayList<Employee>al=new ArrayList<>();
	System.out.println("How many employee record to create?");
	int size=sc.nextInt();
	for(int i=0;i<size;i++)
	{
		String name=sc.next();
		String id=sc.next();
		al.add(new Employee(name,id));
	}
	System.out.println("Enter the employee id to fetch the dtails:");
	String id=sc.next();
	for(Employee em:al)
	{
		if(id.contentEquals(em.getEmployeeName()))
		{
			System.out.println(em.getData());
			return;
		}
	}
	System.out.println("Sorry data is not present:");
}
}
