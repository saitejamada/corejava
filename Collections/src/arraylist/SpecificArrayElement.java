package arraylist;

import java.util.ArrayList;

public class SpecificArrayElement {

	public static void main(String[] args) {
		ArrayList a=new ArrayList();
		
		a.add(19);
		a.add(96);
		a.add("Mada");
		a.add("Sai");
		a.add("Teja");
		a.add(84);
		a.add("Indu");
		
		System.out.println("Elements In ArrayList "+a);
		int n=a.indexOf("Mada");
		a.remove(n);
		a.add(n, 'M');
		
		System.out.println("Elements After Replacing"+a);
	}
}
