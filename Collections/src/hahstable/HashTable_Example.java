package hahstable;

import java.util.Enumeration;
import java.util.Hashtable;


public class HashTable_Example {

	public static void main(String[] args) {
		
		Hashtable ht=new Hashtable();
		
		ht.put(4, 89);
		ht.put(3, 50);
		ht.put(2, 70);
		ht.put(1,8);
		ht.put(6, 110);
		
		
		Enumeration e=ht.elements();
		
		while(e.hasMoreElements())
		{
			System.out.println(" "+e.nextElement());
		}
	}
}
