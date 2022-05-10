package SHISHIRASIR;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class EmpItrDemo {

	public static void main(String[] args) {
		Employee e1 = new Employee(1, 250000, "Ravi");
		Employee e2 = new Employee(2, 15000, "Anup");
		Employee e3 = new Employee(3, 17000, "chandra");

		Collection<Employee> empCol = new ArrayList<Employee>();
		empCol.add(e1);
		empCol.add(e2);
		empCol.add(e3);
		Iterator<Employee> itr = empCol.iterator();
		while (itr.hasNext()) {
			Employee emp = itr.next();
			System.out.println(emp);
		}
	}
}
