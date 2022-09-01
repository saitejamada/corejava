package interthreading_examples;

class TrailRoom
{
	boolean avaialbe=false;
	
	 public void getin()
	{
		synchronized(this)
		{
			
			if(!avaialbe)
			{
				try {
					System.out.println("TrailRoom IS Not avaiable Waiting "+Thread.currentThread().getName());
					wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.println(" Getting Into TrailRoom "+Thread.currentThread().getName());
			avaialbe=false;
			this.notifyAll();
		}
		
	}
	
	public void getout()
	{
		synchronized(this)
		{
			System.out.println("Getting out of TrailRoom "+Thread.currentThread().getName());
			this.avaialbe=true;
			this.notifyAll();
			
		}
		
	}
}
class Person1 extends Thread
{
	TrailRoom t;

	public Person1(TrailRoom t) {
		super();
		this.t = t;
		new Thread(this,"Person 1").start();
	}
	public void run()
	{
		System.out.println("Notified Person1");
		t.getout();
		
	}
}

class Person2 extends Thread
{
	TrailRoom t;

	public Person2(TrailRoom t) {
		super();
		this.t = t;
		new Thread(this,"Person 2").start();
	}
	public void run()
	{
		
		t.getin();
	}
}
class Person3 extends Thread
{
	TrailRoom t;

	public Person3(TrailRoom t) {
		super();
		this.t = t;
		new Thread(this,"Person 3").start();
	}
	public void run()
	{
		System.out.println("Notified Person3");
		t.getin();
		
	}
}
class Person4 extends Thread
{
	TrailRoom t;

	public Person4(TrailRoom t) {
		super();
		this.t = t;
		new Thread(this,"Person 4").start();
	}
	public void run()
	{
		System.out.println("Notified Person4");
		t.getin();
		
	}
}


public class Example_NotifyAll {

	public static void main(String[] args) {
		TrailRoom t=new TrailRoom();
		
		Person1 p1=new Person1(t);

		Person2 p3=new Person2(t);
		Person3 p4=new Person3(t);
		Person4 p2=new Person4(t);
	}
}
