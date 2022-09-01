package com.assignments13jan;

abstract class Hotel
{
	int id;
	String name;
	String location;
	int price;
	
	public Hotel(int id, String name, String location, int price) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Hotel [id=" + id + ", name=" + name + ", location=" + location + ", price=" + price + "]";
	}
}

class Vamshi extends Hotel
{

	public Vamshi(int id, String name, String location, int price) {
		super(id, name, location, price);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Vamshi [id=" + id + ", name=" + name + ", location=" + location + ", price=" + price + "]";
	}
	
}
class Nikil extends Hotel
{

	public Nikil(int id, String name, String location, int price) {
		super(id, name, location, price);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Nikil [id=" + id + ", name=" + name + ", location=" + location + ", price=" + price + "]";
	}
	
}
public class Hotel_Main {

	
}
