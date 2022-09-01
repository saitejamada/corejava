package tree_map;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class TreeMap_Example {

	public static void main(String[] args) {
		TreeMap tm=new TreeMap();
		
		tm.put("abc","sai");
		tm.put("xyz",null);
		tm.put("aa","teja");//duplicate keys are not allowed duplicate values are allowed
		tm.put("bb",2027);
		
		System.out.println("Elements in Hashmap is "+tm);
		tm.remove("mada");
		System.out.println("After Removing Element");
		
		Set hs=tm.entrySet();
		Iterator it=hs.iterator();
		while(it.hasNext())
		{
			System.out.println(" "+it.next());
		}
	}
}
