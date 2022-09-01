package arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class Joining_Two_ArrayList {

	public static void main(String[] args) {
		
		ArrayList al=new ArrayList();
		al.add("nasdnl");
		al.add(115);
		al.add('M');
		al.add("Sai");
		al.add(54);
		al.add("Teja");
		
		ArrayList a=new ArrayList();
		a.add("Red");
		a.add("Blue");
		a.add("Violet");
		a.add("Purple");
		a.add("Black");
		a.add("White");
		a.add("Yellow");
		a.add("Green");
		a.add("Orange");
		System.out.println("Before Joining Second Array List Elements Are "+a);
		a.addAll(al);
		System.out.println("After Adding First ArrayList Elements In Second Array List  ");
		Iterator it1=a.iterator();
		while(it1.hasNext())
		{
			System.out.println(it1.next());
		}
	}
}
