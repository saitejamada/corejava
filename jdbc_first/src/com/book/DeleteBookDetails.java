package com.book;

import java.sql.*;
import java.util.Scanner;

public class DeleteBookDetails {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:oracle","c##scott2","tiger");
		Scanner sc=new Scanner(System.in);
		System.out.println("Delete on basis of 1.id,2.name 3.price 4.authour");
		int ch=sc.nextInt();
		String sql="";
		switch(ch)
		{
		case 1:System.out.println("enter book id");int book_id=sc.nextInt(); sql="delete from book where book_id="+book_id;break;
		case 2:System.out.println("enter book name");String bname=sc.next(); sql="delete from book where bname='"+bname+"'";break;
		case 3:System.out.println("enter book price");int price=sc.nextInt(); sql="delete from book where price="+price;break;
		case 4:System.out.println("enter book authour");String authour=sc.next();sql="delete from book where authour='"+authour+"'";
		}
		
		Statement stmt=con.createStatement();
		int n=stmt.executeUpdate(sql);
		System.out.println("Row Deleted Succesfully"+n);
		con.close();
	}
}
