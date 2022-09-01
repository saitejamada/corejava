package arraylist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Prime_Armstrong {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Number");
		int n=sc.nextInt();
		
		ArrayList a=new ArrayList();
		LinkedList l=new LinkedList();
		
		Prime_Armstrong pm=new Prime_Armstrong();
		
		boolean amres=pm.armstrong(n);
		boolean pmres=pm.prime(n);
		
		if(amres==true)
		{
			//System.out.println("No is Armstrong");
			l.add(n);
		}
		else if(pmres==true)
		{
			//System.out.println("No is Prime");
			a.add(n);
		}
		else
		{
			System.out.println("Number Is Not Prime Or Armstrong ");
		}
		
		System.out.println("Elements in Array List Are : "+a);
		System.out.println("Elemets in Linked List Are : "+l);
	}
	
	boolean armstrong(int n)
	{
		int n1=n,r=0,s=0;
		while(n1>0)
		{
		r=n1%10;
		n1=n1/10;
		s=s+(r*r*r);
		}
		if(s==n)
			return true;
		else
			return false;
	}
	
	boolean prime(int n)
	{
		int count=0;
		for(int i=2;i<=n-1;i++)
		{
		  if(n%i==0)
		 count++;
		}
		if(count>=1)
			return false;
		else
			return true;
	}
}
