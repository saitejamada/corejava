package com.filehandling_examples;

import java.io.*;
import java.util.*;

class ComparatorById1 implements Comparator
{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		Book b=(Book) o1;
		Book b1=(Book) o2;
		if(b.id<b1.id)
			return -1;
		else if(b.id>b1.id)
			return 1;
		else
			return 0;
	}	
}

class Book implements Serializable
{
	int id;
	String name;
	int price;
	
	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	public Book(int id, String name, int price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
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
	
	
}
public class BookExample {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
Scanner sc=new Scanner(System.in);
		
		FileOutputStream fout=new FileOutputStream("c://java2/Book.txt");
		ObjectOutputStream out=new ObjectOutputStream(fout);
		LinkedList l=new LinkedList();
		System.out.println("How many Books You Want To Enter");
		int cap=sc.nextInt();
		Book b[]=new Book[cap];
		
		for(int i=0;i<cap;i++)
		{
			System.out.println("Enter The BookId");
			int id=sc.nextInt();
			System.out.println("Enter The Name");
			String name=sc.next();
			System.out.println("Enter Price");
			int price=sc.nextInt();
			b[i]=new Book(id,name,price);
		}
		
		for(int i=0;i<cap;i++)
		{
			out.writeObject(b[i]);
		}
		out.flush();
		out.close();
		
		FileInputStream fin=new FileInputStream("c://java2/Book.txt");
		ObjectInputStream oin=new ObjectInputStream(fin); 
		
		for(int i=0;i<cap;i++)
		{
			Book b1=(Book) oin.readObject();
			l.add(b1);
			System.out.println(" Book ID Is "+b1.getId()+"  Name Is "+b1.getName()+"  Price Is "+b1.getPrice());
		}
		
		Collections.sort(l, new ComparatorById1());
		System.out.println("Enter The Book For Searching Based on Id ");
		int sid=sc.nextInt();
		
		Book bb1=new Book(sid,null,0);
		int index=Collections.binarySearch(l,bb1, new ComparatorById1());
	
		if(index<0)
		System.out.println("Book Not Found ");
		else
		System.out.println("Book Found at "+index+" Book Name Is "+l.get(index));
		
	}
}
