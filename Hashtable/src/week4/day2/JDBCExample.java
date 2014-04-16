package week4.day2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCExample {

	public static void main(String[] args) {
		System.out.println("-------MySQL JDBC Connection Testing----------");
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println("Where is your MySQL JDBC Driver?");
			e.printStackTrace();
			return;
		}

		System.out.println("MySQL JDBC Driver Registered!");
		Connection connection = null;

		try {
			connection = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/testdb", "root", "");

		} catch (SQLException e) {
			System.out.println("Connection Failed! Check output console");
			e.printStackTrace();
			return;
		}

		if (connection != null) {
			System.out
					.println("You made it, take control to your database now!");
			try {
				Statement st = connection.createStatement();
				ResultSet students = st.executeQuery("SELECT * FROM student");

				while (students.next()) {
					System.out.println(students.getString("name"));
				}
				st.close();
				connection.close();
			} catch (SQLException e) {

			}

		} else {
			System.out.println("Failed to make communication!");
		}
	}

}
