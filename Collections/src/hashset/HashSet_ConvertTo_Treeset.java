package hashset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class HashSet_ConvertTo_Treeset {

	public static void main(String[] args) {
		
		HashSet hs=new HashSet();
		
		hs.add("Sai");
		hs.add("2022");
		hs.add("M");
		hs.add("222");
		hs.add("Teja");
		hs.add("SFS");
		
		TreeSet ts=new TreeSet();
		
		ts.addAll(hs);
		
		/*Iterator i=hs.iterator();
		while(i.hasNext())
		{
			ts.add(i.next());
		}*/
		
		System.out.println("After Converting into TreeSet"+ts);
	}
}
