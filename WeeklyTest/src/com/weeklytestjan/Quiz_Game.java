package com.weeklytestjan;

import java.util.*;
import java.util.concurrent.*;

class Quiz
{
	ArrayList a=new ArrayList();
	ArrayList a1=new ArrayList();
	ArrayList a2=new ArrayList();
	int score=0;
	
	void putquestions()
	{
		a.add("Father of Computers  \n a.j.k Rowling \n b.Charles Babbage  \n c.James Gosling \n d.Geroge r.r Martin");
		a.add("Authour of Game Of Thrones \n a.j.k Rowling \n b.Charles Babbage \n c.James Gosling \n d.Geroge r.r Martin");
		a.add("Father of Java \n  a.j.k Rowling \n b.Charles Babbage \n c.James Gosling \n d.Geroge r.r Martin");
		a.add("Authour Of HarryPotter of Java   \n a.j.k Rowling \n b.Charles Babbage \n c.James Gosling \n d.Geroge r.r Martin");
		a.add("Extends is A   \n a.keyword \n b.class \n c.interface \n d.none");
		a.add("By deafult How many Threads Program conatin  \n a.none \n b.2 \n c.1 \n d.0");
		a.add("static is  \n a.word \n b.keyword \n c.datatype \n d.none");
		a.add("inheitance done by using  is  \n a.extends \n b.implements  \n c.class \n d.none");
		a.add("Byte code \n a.javafile \n b.classfile \n c.jar file \n d.none");
		a.add("jvm is \n a.software \n b.hardware \n c.vitual machine \n d.none");
	}
	
	void answers()
	{
		a1.add("b");
		a1.add("d");
		a1.add("c");
		a1.add("a");
		a1.add("a");
		a1.add("c");
		a1.add("b");
		a1.add("a");
		a1.add("b");
		a1.add("c");
	}
	
	void quiz()
	{
		putquestions();
		answers();
		Scanner sc=new Scanner(System.in);
		Random r=new Random();
		
		for(int i=0;i<5;i++)
		{
			int n=r.nextInt(a.size());
			System.out.println(a.get(n));
			System.out.println("Enter Your Option ");
			String op=sc.next();
			
			if(op.equals(a1.get(n)))
			{
				score++;
				System.out.println("Correct Answer");
			}
			else
			{
				System.err.println("Wrong Option , Correct Option Is "+a1.get(n));
			}
		}
		System.out.println(" Your Score is "+score+" Of 5 ");
		a2.add(score);
		score=0;
		
		if(a2.size()>1)
		{
			if((int) a2.get(0) > (int) a2.get(1))
			{
				System.out.println(" The Player 1 Is Winner Congrats ");
			}
			else if((int) a2.get(0) < (int) a2.get(1))
			{
				System.out.println("The Player 2 Winner Congrats ");
			}
			else
			{
				System.out.println("Scores Are Equal Match Is Tie");
			}
		}
		
	}
}
class Player implements Runnable
{
	Quiz q;
	String name;
	
	public Player(String name,Quiz q) {
		super();
		this.name = name;
		this.q=q;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
	
		System.out.println(name+" Player Is Playing Quiz ");
		q.quiz();
	}
	
}

public class Quiz_Game {

	public static void main(String[] args) {
	
		Quiz q=new Quiz();
		ExecutorService e1=Executors.newSingleThreadExecutor();
		e1.execute(new Player("First",q));
		e1.execute(new Player("Second",q));
		e1.shutdown();

	}

}