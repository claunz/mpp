
public class Country {

	public static void main(String[] args) {

		MyHashTable table = new MyHashTable();
		table.put("Et", "Ethiopia");
		table.put("Np", "Nepal");
		table.put("Jp", "Japan");
		
		System.out.println(table.get("Et"));
		
	}

}
