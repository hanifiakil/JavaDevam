package day34_accessdeneme;

import day34_accessModifier_encapsulation.C01;

public class C01_başkaPackage {
	public static void main (String[]args) {
		
C01 obj =new C01();
		
	//	System.out.println(obj.sayıprivate);
	//	System.out.println(obj.sayıDefault);  sadece aynı package dakiler ulaşabilir
	//	System.out.println(obj.sayıProtected);  aynı package daki class lar ve child class lar ulaşabilir
		System.out.println(obj.sayıPublic);
		
	}
	
	

}
