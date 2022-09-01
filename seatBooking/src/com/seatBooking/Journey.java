package com.seatBooking;

class Journey
{
	String from;
	String to;
	int date;
	int month;
	
	public Journey(String from, String to, int date2,int month2) 
	{
		super();
		this.from = from;
		this.to = to;
		this.date = date2;
		this.month = month2;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public int getDate() {
		return date;
	}

	public void setDate(int date) {
		this.date = date;
	}
	
}