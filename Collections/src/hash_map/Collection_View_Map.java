package hash_map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
//Write a Java program to get a collection view of the values contained in this map
public class Collection_View_Map {

	public static void main(String[] args) {
		
		HashMap hm=new HashMap();
		
		hm.put(100,"ABC");
		hm.put(1,202);
		hm.put(2,"Sai");
		hm.put(101,222);
		hm.put(99,"TEJA");
		hm.put(6,849);
		hm.put(0,null);

		Set  hs=hm.entrySet();
		Iterator it=hs.iterator();
		
		while(it.hasNext())
		{
			Map.Entry mp=(Entry) it.next();
			System.out.println(mp.getValue());
		}
		
		
	}
}
