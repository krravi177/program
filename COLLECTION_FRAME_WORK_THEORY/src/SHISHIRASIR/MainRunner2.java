package SHISHIRASIR;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainRunner2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Student> SList = new ArrayList();
		do {
			System.out.println("Enter student id name and four student Subject marks");
			int id = sc.nextInt();
			String name = sc.next();
			int p = sc.nextInt();
			int c = sc.nextInt();
			int m = sc.nextInt();
			int b = sc.nextInt();
			Student std = new Student(id, name, p, c, m, b);
			SList.add(std);
			System.out.println("Suscessfully added--------");
			System.out.println("Do you have more Student");
			String res = sc.next();
			if (res.equalsIgnoreCase("No"))
				break;

		} while (true);
		System.out.println("<---------Student Information on-------->");
		for (Student s : SList) {
			System.out.println(s);
		}
		System.out.println("<--------Statics-------->");
		printstatic(SList);

	}

	private static void printstatic(List<Student> SList) {
		int dc = 0, fc = 0, sc = 0, jc = 0, flc = 0;
		for (Student st : SList) {
			if (st.getResult().equalsIgnoreCase("Distinction"))
				dc++;
			else if (st.getResult().equalsIgnoreCase("First class"))
				fc++;
			else if (st.getResult().equalsIgnoreCase("Secondclass"))
				sc++;
			else if (st.getResult().equalsIgnoreCase("pass"))
				jc++;
			else
				flc++;
		}
		System.out.println("Distinction:" + dc);
		System.out.println("first class:" + fc);
		System.out.println("Second class:" + sc);
		System.out.println("pass:" + jc);
		System.out.println("Fail:" + flc);
	}
}
