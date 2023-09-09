package COM.JSP.JDBC;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class QuaeryExcution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url = 
				"jdbc:mysql://localhost:3306?user=root&password=12345";
				String query = "insert into student.student values(107,'sampath',85)";
				try
				{
				Connection connection = DriverManager.getConnection(url);
				System.out.println("Connection Established...!");
				Statement stmt = connection.createStatement();
				System.out.println("Platform Created...!");
				stmt.executeUpdate(query);
				System.out.println("Query Executed...!");
				} 
				catch (SQLException e) 
				{
				e.printStackTrace();
				}
				

	}

}
