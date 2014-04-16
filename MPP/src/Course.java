
public class Course {
	private String number;
	private String title;
	private int units;
	
	private String facultyName;
	public Course(String number, String title, int units, String facultyName) {
		this.number = number;
		this.title = title;
		this.units = units;
		this.facultyName = facultyName;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		
		this.title = title;
	}
	public int getUnits() {
		return units;
	}
	public void setUnits(int units) {
		this.units = units;
	}
	public String getFacultyName() {
		return facultyName;
	}
	public void setFacultyName(String facultyName) {
		this.facultyName = facultyName;
	}
	
	
}
