package hashset;

import java.util.HashSet;

public class RemovingAll_Elements_HashSet 
{

	public static void main(String[] args) {
		
HashSet hs=new HashSet();
		
		hs.add("Sai");
		hs.add("2022");
		hs.add("M");
		hs.add("222");
		hs.add("Teja");
		hs.add("SFS");
		
		System.out.println("Before Removing Elements "+hs);
		hs.removeAll(hs);
		System.out.println("After removing Elements "+hs);
		
	}
	
}
