package Lab3;

public class Employee {
	private String employeeId;
	private String firstName;
	private String middleInitial;
	private String lastName;
	private String birthDate;
	private String SSN;
	private double salary;
	
	
	public Employee(String employeeId, String firstName, String middleInitial,
			String lastName, String birthDate, String sSN, double salary) {
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.middleInitial = middleInitial;
		this.lastName = lastName;
		this.birthDate = birthDate;
		SSN = sSN;
		this.salary = salary;
	}
	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleInitial() {
		return middleInitial;
	}
	public void setMiddleInitial(String middleInitial) {
		this.middleInitial = middleInitial;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}
	public String getSSN() {
		return SSN;
	}
	public void setSSN(String sSN) {
		SSN = sSN;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public void print(){
		StringBuilder builder = new StringBuilder();
		builder.append(employeeId)
			.append(", "+firstName)
			.append(" "+middleInitial)
			.append(" "+lastName)
			.append(", "+birthDate)
			.append(", "+SSN)
			.append(", "+salary);
		System.out.println("   . "+builder.toString());
	}
	
	
}
