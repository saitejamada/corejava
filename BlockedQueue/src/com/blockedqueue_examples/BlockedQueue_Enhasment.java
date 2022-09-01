package com.blockedqueue_examples;
import java.util.Scanner;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

class ProducerP implements Runnable
{
	BlockingQueue<Integer> q;
	int capacity;boolean b;
	Scanner sc=new Scanner(System.in);
	
	public ProducerP(BlockingQueue<Integer> q,int capacity) {
		super();
		this.q = q;
		this.capacity=capacity;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=1;i<=capacity;i++)
		{
			try {
				System.out.println("Producing "+i);
				q.put(i);

				//System.out.println("Enter Product To Produce");
				//String p=sc.next();
			   // b=q.offer(i);
				//System.out.println(b);
			  
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}	
}

class ConsumerC implements Runnable
{
	BlockingQueue<Integer> q;
	int capacity;

	public ConsumerC(BlockingQueue<Integer> q,int capacity) {
		super();
		this.q = q;
		this.capacity=capacity;
	}


	@Override
	public void run() {
		// TODO Auto-generated method stub
		
//		for(int i=1;i<=capacity;i++)
//		{
//			try
//			{
//				System.out.println(" Product Consuming is "+q.take());	
//			}
//			catch(InterruptedException e)
//			{
//				e.printStackTrace();
//			}
//		}
		
		while(true)
		{
			try {
				
				System.out.println(" Consumer "+q.take());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
public class BlockedQueue_Enhasment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter The Capacity for Blocked Queue ");
		int c=sc.nextInt();
		
		BlockingQueue<Integer> q=new LinkedBlockingQueue<Integer>();
		
		ProducerP p=new ProducerP(q,c);
		ConsumerC cn=new ConsumerC(q,c);
		
		Thread t1=new Thread(p);
		Thread t2=new Thread(cn);
		
		t1.start();
		t2.start();
	}
}
