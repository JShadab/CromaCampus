package p1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DeleteDemo {

	public static void main(String[] args) throws Exception {

		String URL = "jdbc:mysql://localhost:3306/croma_db";
		// String URL ="jdbc:postgresql://localhost:5432/croma_db";

		String USER_NAME = "root";
		String PASSWORD = "root";

		Employee emp = new Employee("Suresh", 29, 21000);

		// Step#1 Load the driver class
		Class.forName("com.mysql.cj.jdbc.Driver");
		// Class.forName("org.postgresql.Driver");

		// Step#2 Establish a connection
		Connection connection = DriverManager.getConnection(URL, USER_NAME, PASSWORD);

		// Step#3 Write SQL queries
		String sql = "DELETE FROM employee WHERE name =?";

		// Step#4 Get a Career
		PreparedStatement ps = connection.prepareStatement(sql);

		ps.setString(1, emp.getName());

		// Step#5 Execute SQL query
		ps.executeUpdate();

		// Step#6 close
		ps.close();
		connection.close();

		System.out.println("Values deleted Successfully");
	}

}
