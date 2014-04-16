package Lab3;

import java.util.ArrayList;
import java.util.List;

public class Company {
	private String name;
	private List<Department> departments;

	public Company(String name) {
		this.name = name;
		departments = new ArrayList<Department>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void print(){
		System.out.println(name);
		if(departments != null){
			for(Department department : departments){
				department.print();
			}
		}
	}
	public void addDepartMent(Department department){
		departments.add(department);
	}
}
