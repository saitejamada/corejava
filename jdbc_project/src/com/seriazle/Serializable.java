package com.seriazle;

import java.io.*;
import java.sql.SQLException;
import java.util.Scanner;

import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;

public class Serializable {

	public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
		
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		JdbcRowSet rowset=RowSetProvider.newFactory().createJdbcRowSet();
		rowset.setUrl("jdbc:oracle:thin:@localhost:1521:oracle");
		rowset.setUsername("c##scott2");
		rowset.setPassword("tiger");
		rowset.setCommand("select * from product");
		rowset.execute();
		
		while(rowset.next())
		{
			int r=rowset.getInt(1);
			FileOutputStream fout=new FileOutputStream("C://java2/"+r+".txt");
			ObjectOutputStream out=new ObjectOutputStream(fout);
			Product p=new Product(rowset.getInt(1),rowset.getString(2),rowset.getInt(3),rowset.getInt(4),rowset.getInt(5));
			out.writeObject(p);
			out.flush();
			out.close();
			
		}
		rowset.setCommand("select * from product");
		rowset.execute();
		while(rowset.next())
		{
			
			int r=rowset.getInt(1);
			FileInputStream fin=new FileInputStream("C://java2/"+r+".txt");
			ObjectInputStream oin=new ObjectInputStream(fin);
			Product p=(Product) oin.readObject();
			System.out.print(" Prodcut id "+p.getProduct_id());
			System.out.print("Product name"+p.getProduct_name());
			System.out.print("category id "+p.getCategory_id());
			System.out.print("avaliable quantity "+p.getAvailabe_quantity());
			System.out.println("product price "+p.getPrice());
		}
	}
}
