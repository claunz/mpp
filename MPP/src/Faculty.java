
public class Faculty extends Person {
	private double salary;
	
	public Faculty(String name, String phone, int age) {
		super(name, phone, age);
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	public int getTotalUnits(){
		return 0;
	}
}
