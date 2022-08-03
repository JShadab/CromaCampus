package p1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SelectDemo {

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
		String sql = "SELECT * FROM employee";

		// Step#4 Get a Career
		PreparedStatement ps = connection.prepareStatement(sql);

		// Step#5 Execute SQL query
		ResultSet rs = ps.executeQuery();

		while (rs.next()) {
			String name = rs.getString("name");
			int age = rs.getInt("age");
			double salary = rs.getDouble("salary");

			System.out.println("name = " + name + ", age = " + age + ", salary = " + salary);
		}

		// Step#6 close
		rs.close();
		ps.close();
		connection.close();

	}

}
