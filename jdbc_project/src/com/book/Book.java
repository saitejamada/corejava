package com.book;

import java.sql.*;
import java.util.Scanner;

public class Book {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Scanner sc=new Scanner(System.in);
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:oracle","c##scott2","tiger");
		CallableStatement stmt;
		String sql;
		ResultSet rs;
		char c;
		
		do
		{
		System.out.println("Enter 1.view 2.delete 3.update 4.to insert");
		int option=sc.nextInt();
		
		if(option==1)
		{
			sql="select * from book";
			stmt=con.prepareCall(sql);
			rs=stmt.executeQuery();
			while(rs.next())
			{
				System.out.print("Book Id  "+rs.getInt(1));
				System.out.print(" Book  Name "+rs.getString(2));
				System.out.print(" Book Price "+rs.getInt(3));
				System.out.println(" Book Authour  "+rs.getString(4));
			}
		}
		else if(option==2)
		{
			stmt=con.prepareCall("call delete_bk(?)");
			System.out.println("Enter Book Id you Want to Delete");
			int bid=sc.nextInt();
			stmt.setInt(1, bid);
			stmt.execute();
			System.out.println("Book Deleted SucessFully");
		}
		else if(option==3)
		{
			System.out.println("Enter Book Id you Want to Update");
			int bid=sc.nextInt();
			System.out.println("what you want to update 1.id 2.name 3.price 4.authour");
			int ch1=sc.nextInt();
			if(ch1==1)
			{
				stmt=con.prepareCall("call update_bkid(?,?)");
				System.out.println("Enter The Book Id you Want to Updated With");
				int bid2=sc.nextInt();
				stmt.setInt(1, bid);
				stmt.setInt(2, bid2);
				stmt.execute();
				System.out.println("Book Updated SucessFully");
			}
			else if(ch1==2)
			{
				stmt=con.prepareCall("call update_bkname(?,?)");
				System.out.println("Enter The Book Name you Want to Updated With");
				String bname=sc.next();
				stmt.setInt(1, bid);
				stmt.setString(2, bname);
				stmt.execute();
				System.out.println("Book Updated SucessFully");
			}
			else if(ch1==3)
			{
				stmt=con.prepareCall("call update_bkprice(?,?)");
				System.out.println("Enter The Book Price you Want to Updated With");
				int bprice=sc.nextInt();
				stmt.setInt(1, bid);
				stmt.setInt(2, bprice);
				stmt.execute();
				System.out.println("Book Updated SucessFully");
			}
			else if(ch1==4)
			{
				stmt=con.prepareCall("call update_bkauth(?,?)");
				System.out.println("Enter The Book Authour you Want to Updated With");
				String bauthour=sc.next();
				stmt.setInt(1, bid);
				stmt.setString(2, bauthour);
				stmt.execute();
				System.out.println("Book Updated SucessFully");
			}
			else
			{
				System.err.println("Invalid Option Selected");
			}
		}
		else if(option==4)
		{
			stmt=con.prepareCall("call insert_bk(?,?,?,?)");
			System.out.println("Enter Book Id");
			int book_id=sc.nextInt();
			System.out.println("Enter Book Name");
			String bname=sc.next();
			System.out.println("Enter Price");
			int price=sc.nextInt();
			System.out.println("Enter The authour");
			String authour=sc.next();
			stmt.setInt(1,book_id);
			stmt.setString(2,bname);
			stmt.setInt(3,price);
			stmt.setString(4,authour);
			stmt.execute();
			System.out.println("Book Inserted SucessFully");
		}
		else
		{
			System.err.println("Invalid Option Selected");
		}
		System.out.println("Do You Wish To continue");
		c=sc.next().charAt(0);
		//con.close();
		}while(c=='y');
	}
}
