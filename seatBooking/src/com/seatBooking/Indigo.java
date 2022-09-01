package com.seatBooking;

class Indigo extends Plane
{
	String model;
	String name;
	int capacity;
	String destination;
	String depature;
	int fair;
	int seatsavailale;
	
	
	@Override
	public String toString() {
		return "Indigo [model=" + model + ", name=" + name + ", capacity=" + capacity + ", destination=" + destination
				+ ", depature=" + depature + ", fair=" + fair + ", seatsavailale=" + seatsavailale + "]";
	}
	public Indigo(String model, String name, int capacity, String destination, String depature, int fair,
			int seatsavailale) {
		super();
		this.model = model;
		this.name = name;
		this.capacity = capacity;
		this.destination = destination;
		this.depature = depature;
		this.fair = fair;
		this.seatsavailale = seatsavailale;
	}
	public int getSeatsavailale() {
		return seatsavailale;
	}
	public void setSeatsavailale(int seatsavailale) {
		this.seatsavailale = seatsavailale;
	}
	public int getFair() {
		return fair;
	}
	public void setFair(int fair) {
		this.fair = fair;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public String getDepature() {
		return depature;
	}
	public void setDepature(String depature) {
		this.depature = depature;
	}
	
	
}