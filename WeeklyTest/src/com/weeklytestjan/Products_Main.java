package com.weeklytestjan;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
class SortByName implements Comparator
{

	@Override
	public int compare(Object o1, Object o2) {
		Product p1=(Product)o1;
		Product p2=(Product)o2;
		return p1.pname.compareTo(p2.pname);
	}
	
}

class Product
{
	int pid;
	String pname;
	int price;
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Product(int pid, String pname, int price) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", price=" + price + "]";
	}
	
}
class Cart
{
	Product p;
	int quantity;
	
	public Cart(Product p,int q)
	{
		this.p=p;
		this.quantity=q;
		
	}
	public void bill()
	{
		System.out.println(" Id is  "+p.pid);
		System.out.println(" Name is "+p.pname);
		System.out.println(" Price is "+p.price);
		int total=p.price*quantity;
		System.out.println(" Total Price is "+total);
	}
	
}
public class Products_Main 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in); 
		ArrayList al=new ArrayList();
		Product p[]=new Product[5];	
		 p[0]=new Product(112,"Tea Powder",150);
		 p[1]=new Product(13,"Coffee",250);
		 p[2]=new Product(11,"Deteregent",100);
		 p[3]=new Product(121,"House Cleaner",350);
		 p[4]=new Product(123,"Rice Bag",1450);
	
		 for(int i=0;i<p.length;i++)
		 {
			 al.add(p[i]);
		 }
		 Collections.sort(al, new SortByName());
		 for(int i=0;i<al.size();i++)
		 {
			System.out.println("Select "+i+" For "+al.get(i)); 
		 }
		
			 System.out.println("Enter The Choice");
			 int c=sc.nextInt();
			 System.out.println("Enter Quantity");
			 int quantity=sc.nextInt();
			 Product pp=p[c];
			 Cart cart=new Cart(pp,quantity);
			 cart.bill();
			
			
		
		 
	}

}
