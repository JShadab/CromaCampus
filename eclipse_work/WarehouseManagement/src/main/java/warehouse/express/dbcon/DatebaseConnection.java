package warehouse.express.dbcon;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatebaseConnection {
	
public static Connection con;
	
	public static Connection getConnection() {
		if(con==null) {
			try {
					Class.forName("com.mysql.jdbc.Driver");
					con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Warehouse","root","root");
					System.out.println("connection created");
				
			}catch(Exception e) {
				System.out.println(e);
				return null;
			}
		}
		return con;
	}
}
