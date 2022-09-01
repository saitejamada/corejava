package com.Interface.Drivable;

public class LawnCutter implements Drivable {

	String turn;
	
	public LawnCutter(String turn)
	{
		super();
		this.turn = turn;
	}

	@Override
	public void startEngine() {
		// TODO Auto-generated method stub
		System.out.println("Starting The Lawn Cutter Engine");
	}

	@Override
	public void stopEngine() {
		// TODO Auto-generated method stub
		System.out.println("Switching Off The lawn cutter engine");
	}

	@Override
	public void accelerate() {
		// TODO Auto-generated method stub
		System.out.println("Giving More Power to the engine");
	}

	@Override
	public void turn() {
		// TODO Auto-generated method stub
		System.out.println("Turning To The "+turn+" Side");
	}

	void cutGrass()
	{
		System.out.println("Cutting The Grass  ");
	}
}
