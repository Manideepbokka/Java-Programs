package com.jdbcconnection;
import java.sql.*;
public class DataBaseConnection {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		String username="Saimanideep";
		String password="Manideep";
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection(url,username,password);
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select * from students where sid=521");
		while(rs.next())
		{
		System.out.println(rs.getString(0)+"  "+rs.getString("name")+"  "+rs.getString("age")+"  "+rs.getString("Branch"));
		}
		st.close();
		con.close();	
	}
}
