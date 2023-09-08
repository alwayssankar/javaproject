package COM.JSP.JDBC;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1.creating the connection
		try {
			Connection con = DriverManager.getConnection("JDBC:MYSQL://localhost/:3306/sankar","root","12345");
			
				Statement stm = con.createStatement();
				String str = "INSERT INTO STUDENT VALUES(104,'SAI RAM',MECH)";
				String str1 = "UPDATE  STUDENT SET  SNAMe='siva'where sid=105";
				String str2 = "  DELECT FROM STUDENT WHERE SID=103";
			
				stm.execute(str);
				con.close();
				System.out.println("Query Excuted......");
			
		

		}
		}
	}



	}

}
