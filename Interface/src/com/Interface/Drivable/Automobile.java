package com.Interface.Drivable;

public class Automobile implements Drivable{
 
	String vechile,turn;

	public Automobile(String vechile, String turn)
	{
		super();
		this.vechile = vechile;
		this.turn = turn;
	}

	@Override
	public void startEngine() {
		// TODO Auto-generated method stub
		System.out.println("Starting A "+vechile+" Engine ");
	}

	@Override
	public void stopEngine() {
		// TODO Auto-generated method stub
		System.out.println("Switching Off A "+vechile+"  Engine");
	}

	@Override
	public void accelerate() {
		// TODO Auto-generated method stub
		System.out.println("Pushing The Throtlle ");
	}

	@Override
	public void turn() {
		// TODO Auto-generated method stub
		System.out.println("Turning The"+vechile+" To The "+turn+" Side");
	}
	
	void honkHorn()
	{
		System.out.println("   Honking ");
	}

}
