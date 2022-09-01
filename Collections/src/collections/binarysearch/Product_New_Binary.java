package collections.binarysearch;

import java.util.*;

class Product1 
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
	
	public Product1(int id, String name, int price, int quantity) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "Product1 [id=" + id + ", name=" + name + ", price=" + price + ", quantity=" + quantity + "]";
	}
	
		
		
}
class ComparatorById implements Comparator
{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		Product1 p=(Product1)o1;
		Product1 p1=(Product1)o2;
		
		if(p.id<p1.id)
			return -1;
		else if(p.id>p1.id)
			return 1;
		else
			return 0;
	}
	
}
class ComparatorByName implements Comparator
{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		Product1 p=(Product1)o1;
		Product1 p1=(Product1)o2;
		
		
			return p.name.compareTo(p1.name);
	}
	
}
class ComparatorByPrice implements Comparator
{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		Product1 p=(Product1)o1;
		Product1 p1=(Product1)o2;
		
		if(p.price<p1.price)
			return -1;
		else if(p.price>p1.price)
			return 1;
		else
			return 0;
	}
	
}
class ComparatorByQuantity implements Comparator
{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		Product1 p=(Product1)o1;
		Product1 p1=(Product1)o2;
		
		if(p.quantity<p1.quantity)
			return -1;
		else if(p.quantity>p1.quantity)
			return 1;
		else
			return 0;
	}
	
}

public class Product_New_Binary {

	public static void main(String[] args) {
		
		ArrayList a=new ArrayList();
		Scanner sc=new Scanner(System.in);
		
		Product1 p1=new Product1(11,"phone",5000,5);
		Product1 p2=new Product1(1,"owen",2000,4);
		Product1 p3=new Product1(2,"geyser",15000,2);
		Product1 p4=new Product1(71,"fridge",25000,1);
		a.add(p1);
		a.add(p2);
		a.add(p3);
		a.add(p4);
		
	
		System.out.println(" "+a);
		
		Collections.sort(a, new ComparatorById());
		System.out.println(" After Sorting "+a);
		
		System.out.println("choose The Option For Searching ");
			
		System.out.println("1.search by name 2.search by price 3.search by quantity");
		int op=sc.nextInt();
			
			if(op==1)
			{
				System.out.println("Enter The name To Search");
				String sname=sc.next();
				Product1 pp1=new Product1(0,sname,0,0);
				int index=Collections.binarySearch(a,pp1, new ComparatorByName());
				
				if(index<0)
				System.out.println("Element Not Found ");
				else
				System.out.println("Element Found at "+index+" Item Name Is "+a.get(index));
			}
		
				else if(op==2)
				{
					
					System.out.println("Enter The Price To Search");
					int sprice=sc.nextInt();
					Product1 pp2=new Product1(0,null,sprice,0);
					int index=Collections.binarySearch(a, pp2, new ComparatorByPrice());
					
					if(index<0)
						System.out.println("Element Not Found ");
					else
						System.out.println("Element Found at "+index+" Item Name Is "+a.get(index));
				}
					else if(op==3)
					{
							System.out.println("Enter The Quantity To Search");
							int squantity=sc.nextInt();
							Product1 pp3=new Product1(0,null,0,squantity);
							int index=Collections.binarySearch(a, pp3, new ComparatorByQuantity());
							if(index<0)
								System.out.println("Element Not Found ");
							else
								System.out.println("Element Found at "+index);
					}
		
	}
}
