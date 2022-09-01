package com.Interface.Drivable;

public class MainOfDrivable
{
	public static void main(String[] args)
	{
		Drivable a=new Automobile("Car","Left");
		
		a.startEngine();
		a.accelerate();
		((Automobile) a).honkHorn();
		a.turn();
		a.stopEngine();
		
		System.out.println("______________________________________");
		
		Drivable l=new LawnCutter("right");
		l.startEngine();
		((LawnCutter) l).cutGrass();
		l.accelerate();
		l.turn();
		l.stopEngine();
	}
}
