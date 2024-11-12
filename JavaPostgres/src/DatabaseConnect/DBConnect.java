package DatabaseConnect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnect
{
	public static Connection conn;
	
	public static void connect() throws SQLException{
		conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/demo","postgres","Hardik@123");
 		if (conn != null) {
 			System.out.println("Connected to the database!");
 		}else {
 			System.out.println("Failed to make connection!");
 		}
	}
	
	public static void main(String[] args) 	{
		 	try{
		 		DBConnect.connect();
		 		
		 		String query1 = "Insert into person(name) values ('Hardik')";
		 		
		 		Statement st = conn.createStatement();
		 		st.execute(query1);
		 		
		 		String query3 = "delete from person where name='Om'";
		 		int result = st.executeUpdate(query3);
		 		
		 		String query2 = "Select * from person";
		 		ResultSet rs = st.executeQuery(query2);
		 		
		 		System.out.println(result);
		 		while(rs.next()) {
		 			System.out.println(rs.getString(1));
		 		}
		 		conn.close();
		 	}
			catch (SQLException e)
			{
				e.printStackTrace();
			}
	}
}
