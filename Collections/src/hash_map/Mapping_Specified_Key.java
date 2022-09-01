package hash_map;

import java.util.HashMap;
//)Write a Java program to test if a map contains a mapping for the specified ke
public class Mapping_Specified_Key {

	public static void main(String[] args) {
		
		HashMap hm=new HashMap();
		
		hm.put("100","ABC");
		hm.put(1,202);
		hm.put(2,"Sai");
		hm.put(101,222);
		hm.put(99,"TEJA");
		hm.put(6,849);
		hm.put(0,null);
		
		System.out.println(hm);
		System.out.println("Does Map Contains Key 9 = "+hm.containsKey(9));
		System.out.println("Does Map Contains Key 1 ="+hm.containsKey(1));
	}
}
