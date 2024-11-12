package DatabaseConnectivity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectDB
{
	public static void main(String[] args)
	{
		ConnectDB cb = new ConnectDB();
		System.out.println(cb.get_connection());
	}
	
	public Connection get_connection() {
		Connection conn = null;
		String host = "localhost";
		String port = "5432";
		String dbName = "demo";
		String user = "postgres";
		String password = "root";
		
		String url = "jdbc:postgresql://127.0.0.1:5432/demo";
		
		try
		{
			Class.forName("org.postgresql.Driver");
			conn = DriverManager.getConnection(url,user,password);
			if (conn != null) {
				System.out.println("Connection success..");				
				System.out.println(conn.isValid(2));
			}else {
				System.out.println("Failed..");
			}
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		return conn;
	}
}
