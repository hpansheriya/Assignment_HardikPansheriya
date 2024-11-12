package DatabaseConnect;

import java.sql.SQLException;
import java.sql.Statement;

public class TransactionManagement
{
	public static void main(String[] args)
	{
			try
			{
				DBConnect.connect();
				
				DBConnect.conn.setAutoCommit(false);
				
				Statement st = DBConnect.conn.createStatement();
				
				String s1 = "insert into employee values (6,'0m','Patel','omp@gmail.com')";
				st.executeUpdate(s1);
				
				DBConnect.conn.commit();
//				DBConnect.conn.rollback();
				DBConnect.conn.close();
			}
			catch (SQLException e)
			{
				e.printStackTrace();
			}
	}
}
