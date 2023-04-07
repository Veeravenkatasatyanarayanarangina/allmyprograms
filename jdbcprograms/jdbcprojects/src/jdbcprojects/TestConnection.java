package jdbcprojects;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TestConnection 
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/motivitylabs";
		String user = "root";
		String password = "root";
		Connection connection = DriverManager.getConnection(url, user, password);
		if (connection != null)
		{
			System.out.println("connection established..");
			
		}
		
		
	}

}
