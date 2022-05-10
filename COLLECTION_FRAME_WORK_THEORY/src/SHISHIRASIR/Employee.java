package SHISHIRASIR;

public class Employee {
	public int id, salary;
	public String name;

	@Override
	public String toString() {
		return id + " " + name + " " + salary;
	}

	public Employee(int id, int salary, String name) {
		this.id = id;
		this.salary = salary;
		this.name = name;
	}
}
