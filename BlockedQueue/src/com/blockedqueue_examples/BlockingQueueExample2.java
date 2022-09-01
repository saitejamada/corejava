package com.blockedqueue_examples;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

class Producer implements Runnable
{

	BlockingQueue queue=null;

	Producer(BlockingQueue queue)
	{
		this.queue=queue;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try
		{
			Thread.sleep(1000);
			System.out.println("Producing Items1");
			queue.put("10");
			Thread.sleep(1000);
			System.out.println("Producing Items2");
			queue.put("20");
			Thread.sleep(1000);
			System.out.println("Producing Items3");
			queue.put("30");
			System.out.println("Producing Items4");
			queue.put("40");
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
	}
}

	class Consumer implements Runnable
	{
		BlockingQueue queue=null; 
		
		Consumer(BlockingQueue queue)
		{
			this.queue=queue;
		}
		
		@Override
		public void run() {
			// TODO Auto-generated method stub
			try
			{
				System.out.println("Consuming Item1="+queue.take());
				System.out.println("Consuming Item2="+queue.take());
				System.out.println("Consuming Item3="+queue.take());
				System.out.println("Consuming Item4="+queue.take());
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
}

	public class BlockingQueueExample2 {

		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub

				BlockingQueue<String> bq=new ArrayBlockingQueue<String>(3);

					Producer p=new Producer(bq);
					Consumer q=new Consumer(bq);
						Thread t1=new Thread(p);
						Thread t2=new Thread(q);
						t1.start();
						t2.start();
						Thread.sleep(4000);
		}
}

