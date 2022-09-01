package java1;

import java1.advjava.*;
import java1.corejava.collect.*;
import java1.corejava.oops.*;
import java1.corejava.thread.*;


public class TestPackage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A1 a=new A1();
		System.out.println(a.a1());
		A2 a1=new A2();
		System.out.println(a1.a2());
		
		O1 o=new O1();
		System.out.println(o.o1());
		O2 o1=new O2();
		System.out.println(o1.o2());
		
		C1 c=new C1();
		System.out.println(c.c1());
		C2 c1=new C2();
		System.out.println(c1.c2());
		
		T1 t=new T1();
		System.out.println(t.t1());
		T2 t1=new T2();
		System.out.println(t1.t2());
		
	}

}
