package tree_map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

//Write a Java program to copy all of the mappings from the specified map to another map
public class Cloning_Two_Maps {

	public static void main(String[] args) {
		
		TreeMap tm=new TreeMap();
		
		tm.put("100","ABC");
		tm.put("1","202");
		tm.put("2","Sai");
		tm.put("101","222");
		tm.put("99","TEJA");
		tm.put("6","849");
		tm.put("0","21354");
		tm.put("abc","21354");
		
		HashMap h=new HashMap();
		
		h.putAll(tm);
		System.out.println(h);
		
	}
}
