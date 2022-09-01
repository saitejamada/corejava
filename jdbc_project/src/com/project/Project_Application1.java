package com.project;

import java.util.Scanner;
import java.sql.*;
import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;

public class Project_Application1 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Scanner sc=new Scanner(System.in);
		Class.forName("oracle.jdbc.driver.OracleDriver");
//		JdbcRowSet rowset=RowSetProvider.newFactory().createJdbcRowSet();
//		rowset.setUrl("jdbc:oracle:thin:@localhost:1521:oracle");
//		rowset.setUsername("c##scott2");
//		rowset.setPassword("tiger");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:oracle","c##scott2","tiger");
		CallableStatement stmt;
		String sql;
		PreparedStatement pstmt;
		ResultSet rs;
		System.out.println("Select  1.login 2.register");
		int ch=sc.nextInt();
		System.out.println();
		if(ch==1)
		{
			System.out.println("enter user id");
			int userid=sc.nextInt();
			System.out.println("Enter Password");
			String password=sc.next();
			sql="select user_id from users where user_id="+userid+"and password='"+password+"'";
			pstmt=con.prepareStatement(sql);		
			rs=pstmt.executeQuery();
			if(rs.next()==true)
			{
				System.out.println("Login Succesfull");
				sql="select user_type from users where user_id="+userid;
				pstmt=con.prepareStatement(sql);
				rs=pstmt.executeQuery();
				if(rs.next())
				{
					if(rs.getString("user_type").equals("admin"))
					{
						System.out.println("Welcome admin");
						System.out.println("select 1.add products 2.edit");
						int op=sc.nextInt();
						if(op==1)
						{
							stmt=con.prepareCall("call insert_product1(?,?,?,?,?)");
							System.out.println("enter product id");
							int productid=sc.nextInt();
							stmt.setInt(1,productid);
							System.out.println("enter product name");
							String pname=sc.next();
							stmt.setString(2, pname);
							System.out.println("enter category id");
							int cid=sc.nextInt();
							stmt.setInt(3,cid);
							System.out.println("enter avaiable quantity");
							int aq=sc.nextInt();
							stmt.setInt(4,aq);
							System.out.println("enter price");
							int price=sc.nextInt();
							stmt.setInt(5,price);
							stmt.execute();
							System.out.println("product added successfully");
						}
						else if(op==2)
						{
							System.out.println("enter product id you want to update");
							int pid=sc.nextInt();
							System.out.println("what you want to update 1.product id,2.product name,3.category id4.available quantity 4.price");
							int choice=sc.nextInt();
							switch(choice)
							{
							case 1:System.out.println("enter product id you want to change to");int prodid=sc.nextInt();sql="update product set product_id="+prodid+" where product_id="+pid;break;
							case 2:System.out.println("enter product name you want to change to");String prodname=sc.next();sql="update product set product_name='"+prodname+"' where product_id="+pid;break;
							case 3:System.out.println("enter category id you want to change to");int cid=sc.nextInt();sql="update product set category_id="+cid+" where product_id="+pid;break;
							case 4:System.out.println("enter available quantity you want to change to");int aq=sc.nextInt();sql="update product set avalable_quantity="+aq+" where product_id="+pid;break;
							case 5:System.out.println("enter productprice you want to change to");int pr=sc.nextInt();sql="update product set price="+pr+" where product_id="+pid;
							}
							pstmt=con.prepareStatement(sql);
							pstmt.executeUpdate();
							System.out.println("update successfull");
						}
						else
						{
							System.err.println("invalid option");
						}
					}
					else
					{
						System.out.println("welcome user displaying all products");
						sql="select * from product";
						pstmt=con.prepareStatement(sql);
						rs=pstmt.executeQuery();
						while(rs.next())
						{
							System.out.print("pid  "+rs.getInt(1));
							System.out.print(" pname  "+rs.getString(2));
							System.out.print(" categoryid "+rs.getInt(3));
							System.out.print(" available quantity  "+rs.getInt(4));
							System.out.println(" price   "+rs.getInt(5));
						}
						System.out.println("do you wish to add to bill y / n");
						char c=sc.next().charAt(0);
						if(c=='y')
						{
							stmt=con.prepareCall("call insert_bill(?,?,?,?,?)");
							System.out.println("enter bill no");
							int billno=sc.nextInt();
							System.out.println("enter product id");
							int pid=sc.nextInt();
							System.out.println("enter quantity");
							int qun=sc.nextInt();
							stmt.setInt(1, billno);
							stmt.setInt(2,userid);
							stmt.setInt(3,pid);
							stmt.setInt(4, qun);
							stmt.setInt(5, 1);
							stmt.execute();
							stmt=con.prepareCall("call update_bill(?,?,?,?,?)");
							stmt.setInt(1, billno);
							stmt.setInt(2,userid);
							stmt.setInt(3,pid);
							stmt.setInt(4, qun);
							stmt.registerOutParameter(5,Types.INTEGER);
							stmt.execute();
							int res=stmt.getInt(5);
							System.out.println("total amt is "+res);
						}  
					}
				}
			}
			else
			{
				System.err.println("Invalid _user Or password");
			}
		
		}
		else if(ch==2)
		{
			System.out.println("enter user id");
			int userid=sc.nextInt();
			System.out.println("enter username");
			String username=sc.next();
			System.out.println("enter password");
			String pass=sc.next();
			System.out.println("enter user type");
			String type=sc.next();
			stmt=con.prepareCall("call insert_users(?,?,?,?)");
			stmt.setInt(1,userid);
			stmt.setString(2,username);
			stmt.setString(3,pass);
			stmt.setString(4,type);
			stmt.execute();
			System.out.println("user addedd successfully");
			}
		else
		{
			System.err.println("in valid option");
		}
			con.close();
		}
}
