package com.book;
import java.util.Scanner;
import java.sql.*;

public class UpadeBook {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
	
		Scanner sc=new Scanner(System.in);
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:oracle","c##scott2","tiger");
		Statement stmt=con.createStatement();

		//Step 4 execute the query
		ResultSet rs=stmt.executeQuery("select * from book");

		while(rs.next())
		{
		System.out.print(" "+rs.getInt("book_id"));
		System.out.print(" "+rs.getString("bname"));
		System.out.print(" "+rs.getInt("price"));
		System.out.println(" "+rs.getString("authour"));
		}
	
		System.out.println("Row Updated Succesfully");
		con.close();
		
	}
}
