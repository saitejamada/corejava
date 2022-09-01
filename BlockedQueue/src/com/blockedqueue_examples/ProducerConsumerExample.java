package com.blockedqueue_examples;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

class ProducerPP implements Runnable {

	 private final BlockingQueue<Integer> blockingQueue;

	 public ProducerPP(BlockingQueue<Integer> blockingQueue) {
	  this.blockingQueue = blockingQueue;
	 }

	 public void run() {
	  for (int i = 10; i <= 100; i += 10) {
	   try {
	      System.out.println("Data produced : " + i);
	      blockingQueue.put(i);
	    } catch (InterruptedException ex) {
	      System.out.println("Producer thread interrupted.");
	    }
	   }
	  }
	}

class ConsumerPP implements Runnable {

 private final BlockingQueue<Integer> blockingQueue;

 public ConsumerPP(BlockingQueue<Integer> blockingQueue) {
  this.blockingQueue = blockingQueue;
 }

 public void run() {
  while (true) {
   try {
    System.out.println("Data consumed : " + blockingQueue.take());
   } catch (InterruptedException ex) {
    System.out.println("Consumer thread interrupted.");
   }
  }
 }
}
public class ProducerConsumerExample {

	 public static void main(String[] args) {

	  // Common buffer created using LinkedBlockingQueue
	  BlockingQueue<Integer> blockingQueue =  
	                                  new LinkedBlockingQueue<Integer>();

	  // Producer thread creation
	  Thread producer = new Thread(new ProducerPP(blockingQueue));

	  // Consumer thread creation
	  Thread consumer = new Thread(new ConsumerPP(blockingQueue));

	  // Start Producer and Consumer thread
	  producer.start();
	  consumer.start();

	 }

	}
