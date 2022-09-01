package hashset;

import java.util.HashSet;

public class Comparing_Two_HashSet {

	public static void main(String[] args) {
		HashSet hs=new HashSet();
		HashSet hs1=new HashSet();
		
		hs.add("Sai");
		hs.add(2022);
		hs.add('M');
		hs.add(222);
		hs.add("Teja");
		hs.add("SFS");
		
		hs1.add("Sai");
		hs1.add(2025);
		hs1.add('M');
		hs1.add(222);
		hs1.add("Teja");
		hs1.add("SFS");
		
		
		
		/*hs1.add(null);
		hs1.add(8499);
		hs1.add("Indu");
		hs1.add("Nzb");
		hs1.add('I');
		hs1.add("TS");
		*/
		System.out.println("Comparing Two HashSet "+hs.containsAll(hs1));
		System.out.println("2"+hs.equals(hs1));
		
	}
}
