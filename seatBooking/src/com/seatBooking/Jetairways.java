package com.seatBooking;

class Jetairways extends Plane
{
	String model;
	String name;
	int capacity;
	String destination;
	String depature;
	int fair;
	int seatsavailale;
	
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
	public String getModel() {
		return model;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public Jetairways(String model, String name, int capacity, String destination, String depature, int fair,
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
	@Override
	public String toString() {
		return "Jetairways [model=" + model + ", name=" + name + ", capacity=" + capacity + ", destination="
				+ destination + ", depature=" + depature + ", fair=" + fair + ", seatsavailale=" + seatsavailale + "]";
	}

}