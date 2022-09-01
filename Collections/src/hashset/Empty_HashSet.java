package hashset;

import java.util.HashSet;

public class Empty_HashSet
{

	public static void main(String[] args) {
	
		HashSet hs=new HashSet();
		
		hs.add("Sai");
		hs.add(2022);
		hs.add('M');
		hs.add(222);
		hs.add("Teja");
		hs.add("SFS");
		
		System.out.println("Hash Set Has "+hs);
		hs.clear();
		System.out.println("Hash Set After Using Clear "+hs);
		hs.retainAll(hs);
		System.out.println(hs);
	}
}
