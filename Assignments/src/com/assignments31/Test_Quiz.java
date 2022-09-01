package com.assignments31;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.locks.ReentrantLock;

class Quiz
{
	
	static public void takeTest()
	{
		synchronized(Test_Quiz.class)
		{
			int numCor =0;
			Scanner sc=new Scanner(System.in);
			ArrayList al1=new ArrayList();
			
			al1.add("who invented java programming ?  "+"\n"+"a)guido b)james gosling  c)Dennis  d)Bjarne");
			al1.add("which one of the following is not java feature ?  "+"\n"+"a)object oriented b)use of pointers  c)portable d)dynamic");
			al1.add("what is the extension of java codefiles?  "+"\n"+"a).js b).txt  c).class  d).java");
			al1.add("which of the following is not a oops concept ?  "+"\n"+"a)polymorphism b)Inheritance c)Compilation  d)Encapsulation");
			al1.add("what is the extension of compiled java classes ?  "+"\n"+"a).js b).txt  c).class  d).java");
			al1.add("which of the class is superclass of every java class in java?  "+"\n"+"a)Object class b)string  c)Arraylist  d)abstract class");
			al1.add("which of the following is not an access modifer ? "+"\n"+"a)Protected b)Public  c)void  d)private");
			al1.add("which of these classes is not included in java.lang ?  "+"\n"+"a)Byte b)Integer c)Array  d)class");
			al1.add("which of the package stores all the simple data types in java?  "+"\n"+"a)lang b)java c)util  d)java.packages");
			al1.add("which is the process of converting a simple datatype to a class ?  "+"\n"+"a)type wrapping b)type casting c)type conversion d)none");

			ArrayList a=new ArrayList();
			a.add("b");
			a.add("b");
			a.add("d");
			a.add("c");
			a.add("c");
			a.add("a");
			a.add("c");
			a.add("c");
			a.add("a");
			a.add("a");
			Random r=new Random();
			int n;
			ArrayList s=new ArrayList();
			int score = 0;
			for(int i=0;i<5;i++)
			{
				n=r.nextInt(5);
				System.out.println(al1.get(n));
				String option=sc.next();
				if(option.equals(a.get(n)))
				{
					 numCor++;
					System.out.println("Correct answer");
				}
				else
				{
					System.out.println("wrong answer");
				}	
			}
			System.out.println("The score"+numCor);
			final int count=numCor;
			numCor=0;
	
			if(count>numCor) {
				System.out.println("Player1 Winner");
			}
			else if(count<numCor)
			{
				System.out.println("Player 2 Wins");
			}
			else
			{
				System.out.println("Scores equal");
			}
		}
				
	}
	
}
class Person extends Thread
{
	Quiz s;
	public Person(Quiz s) {
		super();
		this.s = s;
	}
	public void run()
	{	
		s.takeTest();		
	}	
}

public class Test_Quiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Quiz q=new Quiz();
		Person p1=new Person(q);
		Person p2=new Person(q);
		p1.setName("Player1");
		p2.setName("Player2");
		p1.start();		
		p2.start();
		

	}

}
