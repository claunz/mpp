package Lab3;

public class ShrApplication {

	public static void main(String[] args) {
		
		try{
			Company company = new Company("Amazon inc.");
			Department customerServices = new Department("Customer services", "Ontario, California");
			Department shipping	= new Department("Shipping department", "Kansas city, MO");
			company.addDepartMent(customerServices);
			company.addDepartMent(shipping);
			
			Position pos1 = new Position("Driver", "Shipping truck driver");
			pos1.addEmployee(new Employee("112233", "Jacob", "M", "Smit", "25/02/89", "123456789", 50000));
			Position pos2 = new Position("Receiver", "Receiving and processing packages");
			pos2.addEmployee(new Employee("222233", "Dawn", "k", "carrey", "15/01/67", "123456489", 60000));
			Position pos3 = new Position("Store keeper", "Sorting packages ");
			shipping.addPosition(pos1);
			shipping.addPosition(pos2);
			shipping.addPosition(pos3);
			
			
			Position pos11 = new Position("Driver", "Shipping truck driver");
			pos11.addEmployee(new Employee("112233", "Jacob", "M", "Smit", "25/02/89", "123456789", 50000));
			Position pos22 = new Position("Receiver", "Receiving and processing packages");
			pos22.addEmployee(new Employee("222233", "Dawn", "k", "carrey", "15/01/67", "123456489", 60000));
			Position pos33 = new Position("Store keeper", "Sorting packages ");
			customerServices.addPosition(pos11);
			customerServices.addPosition(pos22);
			customerServices.addPosition(pos33);
			
			company.print();
		}
		catch(Exception ex){
			ex.printStackTrace();
		}
	}

}
