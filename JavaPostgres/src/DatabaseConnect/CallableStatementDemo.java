package DatabaseConnect;

import java.sql.CallableStatement;
import java.sql.SQLException;

public class CallableStatementDemo
{
	public static void main(String[] args)
	{
		try
		{
			DBConnect.connect();
			String query1 = "{ CALL insertempdata(?,?,?,?) }";
			
			CallableStatement cst = DBConnect.conn.prepareCall(query1);
			cst.setInt(1, 5);
			cst.setString(2, "O");
			cst.setString(3, "P");
			cst.setString(4, "op@gmail.com");
			
			cst.execute();
			System.out.println("inserted");
			
		}
		catch (SQLException e)
		{
			e.printStackTrace();		}
	}
}
