package com.casting;

class Super 
{
	   void sample() 
	   {
	      System.out.println("method of super class");
	   }
}

	class Sub extends Super 
	{
	   void sample1() 
	   {
	      System.out.println("method of sub class");
	   }
	   
	   void demo()
	   {
		   System.out.println("In Demo Method");
	   }
	}
	
public class SampleUpcastingDowncasting 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		   Super obj =(Super) new Sub(); //upcasting
	       obj.sample();
	       //obj.sample1();
	      
	      
	      Sub sub = (Sub) obj; //downcasting
	      sub.sample1();
	      sub.sample();
	      sub.demo();
	}

}
