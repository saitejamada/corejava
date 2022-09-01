package com.book;

import java.sql.*;
import java.util.Scanner;

public class BookApplication {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
	
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:oracle","c##scott2","tiger");
		Statement stmt=con.createStatement();
		
		Scanner sc=new Scanner(System.in);
		String sql=" ";
		char c;
		do
		{
		System.out.println("Enter 1.view 2.delete 3.update 4.to insert");
		int option=sc.nextInt();
		
		if(option==4)
		{
			int book_id;
			String bname;
			int price;
			String authour;
			
			System.out.println("Enter Book Id");
			book_id=sc.nextInt();
			System.out.println("Enter Book Name");
			bname=sc.next();
			System.out.println("Enter Price");
			price=sc.nextInt();
			System.out.println("Enter The authour");
			authour=sc.next();
			
			 sql="insert into book values("+book_id+",'"+bname+"',"+price+",'"+authour+"')";
			
		}
		else if(option==2)
		{
			System.out.println("Delete on basis of 1.id,2.name 3.price 4.authour");
			int ch=sc.nextInt();
			switch(ch)
			{
			case 1:System.out.println("enter book id");int book_id=sc.nextInt(); sql="delete from book where book_id="+book_id;break;
			case 2:System.out.println("enter book name");String bname=sc.next(); sql="delete from book where bname='"+bname+"'";break;
			case 3:System.out.println("enter book price");int price=sc.nextInt(); sql="delete from book where price="+price;break;
			case 4:System.out.println("enter book authour");String authour=sc.next();sql="delete from book where authour='"+authour+"'";
			}
		}
		else if(option==3)
		{
			System.out.println("update condition on basis of 1.id,2.name 3.price 4.authour");
			int ch=sc.nextInt();
			System.out.println("what you want to update 1.id 2.name 3.price 4.authour");
			int ch1=sc.nextInt();
			if(ch==1)
			{
				System.out.println("Enter book id (condition)");
				int bookid=sc.nextInt();
				if(ch1==1)
				{
					System.out.println("Enter the book id you want to update");
					int book_id=sc.nextInt();
					sql="update book set book_id="+book_id+"where book_id="+bookid;
				}
				else if(ch1==2)
				{
					System.out.println("Enter name");
					String name=sc.next();
					sql="update book set bname='"+name+"' where book_id="+bookid;
				}
				else if(ch1==3)
				{
					System.out.println("Enter the book price you want to update");
					int price=sc.nextInt();
					sql="update book set price="+price+"where book_id="+bookid;
				}
				else if(ch1==4)
				{
					System.out.println("Enter Authour name");
					String authourname=sc.next();
					sql="update book set authour='"+authourname+"' where book_id="+bookid;
				}
				
			}
		}
		else if(option==1)
		{
			ResultSet rs=stmt.executeQuery("select * from book");
			while(rs.next())
			{
			System.out.print(" "+rs.getInt("book_id"));
			System.out.print(" "+rs.getString("bname"));
			System.out.print(" "+rs.getInt("price"));
			System.out.println(" "+rs.getString("authour"));
			}
		}
		else
		{
			System.err.println("InValid Option");
		}
		if(option!=1)
		{
			int n=stmt.executeUpdate(sql);
		}
		System.out.println("Operation Succesfully");
		System.out.println("Dou you wish to continue");
		c=sc.next().charAt(0);
		}while(c=='y');
		con.close();
	
	}
}
