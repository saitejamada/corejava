package hash_map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Hashmap_Example {

	public static void main(String[] args) {
			HashMap hm=new HashMap();
		
		hm.put("abc","sai");
		hm.put(1, "teja");
		hm.put(2.2,"teja");//duplicate keys are not allowed duplicate values are allowed
		hm.put("mada",2027);
		
		System.out.println("Elements in Hashmap is "+hm);
		hm.remove("mada");
		System.out.println("After Removing Element");
		
		Set hs=hm.entrySet();
		Iterator it=hs.iterator();
		while(it.hasNext())
		{
			System.out.println(" "+it.next());
		}
	}
}
