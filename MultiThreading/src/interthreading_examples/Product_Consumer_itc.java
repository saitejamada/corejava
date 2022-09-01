package interthreading_examples;

import java.util.LinkedList;
import java.util.Scanner;

class List
{
	int n=0;
	int list_capacity=0;
	LinkedList l=new LinkedList();
	
	public int get()
	{
		synchronized(this)
		{
			if(list_capacity<=2)
			{
				System.out.println("InSufficent items To Consume Waiting For Producer To Produce");
				try {
					wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.println("consuming The product "+l.get(n));
			n++;
			list_capacity--;
			notify();
			return n;
			
		}
	}
	public void put(int n)
	{
		synchronized(this)
		{
			if(list_capacity>=5)
			{
				try {
					wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			l.add(n);
			System.out.println("Producing Product "+n);
			list_capacity++;
			notify();
		}
	}
	
}
class Producer extends Thread
{
	List l;

	public Producer(List l) {
		super();
		this.l = l;
		new Thread(this,"Producer").start();
	}
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the Product");
			
			l.put(i);
		}
	}
	
}
class Consumer extends Thread
{
	List l;
	
	Consumer(List l)
	{
		this.l=l;
		new Thread(this,"Consumer").start();
	}
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			l.get();
		}
	}
}
public class Product_Consumer_itc {

	public static void main(String[] args) {
		List l=new List();
		Consumer c=new Consumer(l);
		Producer p=new Producer(l);
		
		
		
	}
}
