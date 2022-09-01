package com.filehandling_examples;
import java.io.*;
import java.util.Scanner;

class Product implements Serializable
{
	int pid;
	String name;
	int price;
	int quantity;
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public Product(int pid, String name, int price, int quantity) {
		super();
		this.pid = pid;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", name=" + name + ", price=" + price + ", quantity=" + quantity + "]";
	}
	
}

public class Product_Using_FileReader {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		Scanner sc=new Scanner(System.in);
		
		FileOutputStream fout=new FileOutputStream("c://java2/Product.txt");
		ObjectOutputStream out=new ObjectOutputStream(fout);
		
		Product p[]=new Product[5];
		
		for(int i=0;i<5;i++)
		{
			System.out.println("Enter Product Id");
			int id=sc.nextInt();
			System.out.println("Enter product name");
			String name=sc.next();
			System.out.println("Enter price");
			int price=sc.nextInt();
			System.out.println("Enter Quantity");
			int quantity=sc.nextInt();
			p[i]=new Product(id,name,price,quantity);
		}
		for(int i=0;i<5;i++)
		{
			out.writeObject(p[i]);
		}
		out.flush();
		out.close();
		
		FileInputStream fin=new FileInputStream("c://java2/Product.txt");
		ObjectInputStream oin=new ObjectInputStream(fin); 
		
		for(int i=0;i<5;i++)
		{
			Product pp=(Product) oin.readObject();
			System.out.println(" Product ID Is "+pp.getPid()+" Product Name Is "+pp.getName()+"  Price Is "+pp.getPrice()+"  Quantity Is "+pp.getQuantity());
		}
		
	}
}
