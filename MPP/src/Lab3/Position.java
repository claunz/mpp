package Lab3;

import java.util.ArrayList;
import java.util.List;

public class Position {
	private String title;
	private String description;
	private List<Employee> employees;
	
	public Position(String title) {
		this.title = title;
		employees = new ArrayList<Employee>();
	}
	public Position(String title, String description) {
		this(title);
		this.description = description;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public void print(){
		System.out.println("  *"+title+", "+description);
		if(employees != null){
			for(Employee emp : employees){
				emp.print();
			}
		}
	}
	public void addEmployee(Employee employee){
		employees.add(employee);
	}

}
