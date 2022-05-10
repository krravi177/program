package Array;
public class Employee 
{
private String employeeName;
private String employeeID;
	public Employee(String employeename,String employeeID) {
		super();
		this.employeeName=employeeName;
		this.employeeID=employeeID;
	}     
	public Employee() {
		super();
	}
	public String getEmployeeName() {
		return employeeName;
		
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName=employeeName;
	}
	public void setEmployeeID(String employeeID) {
		this.employeeID=employeeID;
	}
	public String getData()
	{
		return this.getEmployeeName();
}
}

