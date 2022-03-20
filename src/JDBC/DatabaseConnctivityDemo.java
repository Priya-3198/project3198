package JDBC;

import java.sql.*;


public class DatabaseConnctivityDemo 
{

	public static void main(String[] args) throws SQLException 
	{
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql:///Java6772","root","12345");
			Statement st = con.createStatement();
			
		//	String query = "Create table Student1(RollNo int,name varchar(20)";
		//	st.executeUpdate(query);
			
			
			//ResultSet rs = st.executeQuery("select * from student");
		}
		catch (ClassNotFoundException e) 
		{
			System.out.println("Error Is Occured : " +e);
			e.printStackTrace();
		}
		
		
	}

}
