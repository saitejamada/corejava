package tree_map;

import java.util.TreeMap;

public class Greatest_Mapping {

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
		
		
		
		System.out.println(tm);
		System.out.println("Highest Key Is "+tm.lastKey());
		
		
		
	}
}
