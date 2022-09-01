package hash_map;

import java.util.TreeMap;
import java.util.TreeSet;

class Product implements Comparable
{
	int id;
	String name;
	int price,quantity;
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
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
public class Product_binary_Search {

	public static void main(String[] args) {
		TreeSet ts=new TreeSet();
		
		Product p1=new Product(11,"phone",5000,5);
		Product p2=new Product(1,"owen",2000,4);
		Product p3=new Product(2,"geyser",15000,2);
		Product p4=new Product(71,"fridge",25000,1);
	
		ts.add(p1);
		ts.add(p2);
		ts.add(p3);
		ts.add(p4);
		
		System.out.println(ts);
		
	}
}
