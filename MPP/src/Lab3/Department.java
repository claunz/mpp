package Lab3;

import java.util.ArrayList;
import java.util.List;

public class Department {
	private String name;
	private String location;
	private List<Position> positions;
	
	public Department(String name) {
		this.name = name;
		positions = new ArrayList<Position>();
	}
	
	public Department(String name, String location) {
		this(name);
		this.location = location;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
	public void print(){
		System.out.println(" -Department of "+name+", "+location);
		if(positions != null){
			for(Position position: positions){
				position.print();
			}
		}
	}
	public void addPosition(Position position){
		positions.add(position);
	}
}
