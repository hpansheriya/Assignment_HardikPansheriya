package DatabaseConnect;

import java.sql.DatabaseMetaData;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.io.*;

public class PreparedStatementDemo
{
	public static void main(String[] args)
	{
		try
		{
			DBConnect.connect();
			
//			InsertData
			
			String query1 = "insert into employee values(?,?,?,?)";
			PreparedStatement pst = DBConnect.conn.prepareStatement(query1);
//			
			pst.setInt(1, 1);
			pst.setString(2, "Hardik");
			pst.setString(3, "Patel");
			pst.setString(4, "hardikpansheriya@gmail.com");
			
			int i = pst.executeUpdate();
			System.out.println(i + " record inserted");
			
//			UpdateData
			
			String query2 = "update employee set email=? where id=?";
			PreparedStatement pst2 = DBConnect.conn.prepareStatement(query2);
			pst2.setString(1, "hardikpatel@gmail.com");
			pst2.setInt(2, 1);
			
			int i1 = pst2.executeUpdate();
			System.out.println(i1 + " record updated");
			
//			DeleteData
			
			String query3 = "delete from employee where id=?";
			PreparedStatement pst3 = DBConnect.conn.prepareStatement(query3);
			pst3.setInt(1, 2);
			
			int i2 = pst3.executeUpdate();
			System.out.println(i2 +" record deleted");
			
//			Insert Using User's value
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			do {
				System.out.println("Enter id :");
				int id = Integer.parseInt(br.readLine());
				
				System.out.println("Enter fname :");
				String fname = br.readLine();
				
				System.out.println("Enter lname :");
				String lname = br.readLine();
				
				System.out.println("Enter email :");
				String email = br.readLine();
				
				pst.setInt(1, id);
				pst.setString(2, fname);
				pst.setString(3, lname);
				pst.setString(4, email);
				
				int i3 = pst.executeUpdate();
				System.out.println(i3 + " record inserted");
				
				System.out.println("Do you want to continue? y/n");
				String s = br.readLine();
				if (s.startsWith("n")) {
					break;
				}
			}while(true);
			
			
//			ResultSetMetaData
			
			
			String query4 = "select * from employee";
			PreparedStatement pst4 = DBConnect.conn.prepareStatement(query4);
			ResultSet rs = pst4.executeQuery();
			
			ResultSetMetaData rsmd = rs.getMetaData();
			System.out.println("Total Column :"+ rsmd.getColumnCount());
			System.out.println("1st Column Name :"+ rsmd.getColumnName(1));
			System.out.println("1st Column Type Name :"+ rsmd.getColumnTypeName(1));
			
//			DatabaseMetaData
			
			DatabaseMetaData dbmd=DBConnect.conn.getMetaData();  
			  
			System.out.println("Driver Name: "+dbmd.getDriverName());  
			System.out.println("Driver Version: "+dbmd.getDriverVersion());  
			System.out.println("UserName: "+dbmd.getUserName());  
			System.out.println("Database Product Name: "+dbmd.getDatabaseProductName());  
			System.out.println("Database Product Version: "+dbmd.getDatabaseProductVersion()); 
			
			String table[]={"TABLE"};  
			ResultSet rs1=dbmd.getTables(null,null,null,table);  
			  
			while(rs1.next()){  
			System.out.println(rs1.getString(3));  
			}  
			
			String view[]={"VIEW"};  
			ResultSet rs2=dbmd.getTables(null,null,null,view);  
			  
			while(rs2.next()){  
			System.out.println(rs2.getString(3));  
			}  
			
			
			DBConnect.conn.close();
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		
	}
}
