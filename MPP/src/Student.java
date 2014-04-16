import java.util.ArrayList;
import java.util.List;


public class Student extends Person {
	private double GPA;
	private List<Course> courses;
	public Student(String name, String phone, int age) {
		super(name, phone, age);
		courses = new ArrayList<Course>();
	}
	public double getGPA() {
		return GPA;
	}
	public void setGPA(double gPA) {
		GPA = gPA;
	}
	public int getTotalUnits(){
		int total = 0;
		if(courses.size() > 0 )
		{
			for(Course cs : courses){
				total += cs.getUnits();
			}
		}
		return total;
	}
}
