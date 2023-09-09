package COM.JSP.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class PlatformCreation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url = "JDBC:MYSQL://LOCALHOST:3306?USER=ROOT:PASSWORD:123456:";
		try {
			Connection con = DriverManager.getConnection(url);
		Statement stmt = Connection.createStatement();
		System.out.println("plateform created");
		
		}
		catch (SQLException e)
		{
			e.printStackTrace();
			
		}

	}

}
