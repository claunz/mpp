import java.util.ArrayList;
import java.util.List;


public class Department {

	private String name;
	private List<Faculty> faculties;
	private List<Staff>  staffs;
	private List<Student> students;
	
	private List<Course> courses;	
	
	public Department(String name) {
		this.name = name;
		faculties = new ArrayList<Faculty>();
		staffs = new ArrayList<Staff>();
		students = new ArrayList<Student>();
		courses  = new ArrayList<Course>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public double getStaffTotalSalary(){
		double totalSalary = 0;
		if(staffs != null){
			for(Staff st : staffs){
				totalSalary += st.getSalary();
			}
		}
		return totalSalary;
	}
	public double getFacultyTotalSalary(){
		double totalSalary = 0;
		if(faculties != null){
			for(Faculty fac : faculties){
				totalSalary += fac.getSalary();
			}
		}
		return totalSalary;
	}
	
	public double getTotalSalary(){
		return getFacultyTotalSalary()+getStaffTotalSalary();
	}
	public void showAllMembers(){
		
	}
	public int unitsPerFaclty(){
		int unitsPerFaculty = 0;
		return unitsPerFaculty;
	}
	public void addFaculty(Faculty faculty){
		faculties.add(faculty);
	}
	public void addStaff(Staff staff){
		staffs.add(staff);
	}
	public void addStudent(Student student){
		students.add(student);
	}
	public void addCourse(Course course){
		courses.add(course);
	}
}
