package comparator_Examples;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

class Product
{
	int id;
	String name;
	int price;
	int quantity;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public Product(int id, String name, int price, int quantity) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + ", quantity=" + quantity + "]";
	}
		
}

class SortById implements Comparator
{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		Product p1=(Product)o1;
		Product p2=(Product)o2;
		if(p1.id<p2.id)
			return -1;
		else if(p1.id>p2.id)
			return 1;
		else
		return 0;
	}
}
class SortByName implements Comparator
{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		Product p1=(Product)o1;
		Product p2=(Product)o2;
		return p1.name.compareTo(p2.name);
	}
	
}

class SortByPrice implements Comparator
{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		Product p1=(Product)o1;
		Product p2=(Product)o2;
		if(p1.price<p2.price)
			return -1;
		else if(p1.price>p2.price)
			return 1;
		else
		return 0;
	}
}
class SortByQuantity implements Comparator
{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		Product p1=(Product)o1;
		Product p2=(Product)o2;
		if(p1.quantity<p2.quantity)
			return -1;
		else if(p1.quantity>p2.quantity)
			return 1;
		else
		return 0;
	}
}

public class Product_Comparator {

	public static void main(String[] args) {
		
		Comparator c;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println(" Select Sorting Option ");
		System.out.println("1.Sort By Id 2.Sort By Name  3.Sort By Price 4.Sort By Qunatity");
		
		int option=sc.nextInt();
		
		if(option==2)
		{
			c=new SortByName();
			System.out.print("Sorting Done By Name ");
		}
		else if(option==3)
		{
			c=new SortByPrice();
			System.out.print("Sorting Done By Price ");
		}
		else if(option==4)
		{
			c=new SortByQuantity();
			System.out.print("Sorting Done By Quantity ");
		}
		else
		{
			c=new SortById();
			System.out.print("Sorting Done By Id ");
		}
		
		TreeSet ts=new TreeSet(c);
		
		ts.add(new Product(11,"Tea Powder",55,1));
		ts.add(new Product(5,"Dish Washer",50,2));
		ts.add(new Product(1,"Aata",60,3));
		ts.add(new Product(8,"Washing Powder",70,2));
		ts.add(new Product(22,"Perfume",110,5));
		
		System.out.println(""+ts);
	}
}
