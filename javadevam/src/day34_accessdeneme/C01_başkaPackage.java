package day34_accessdeneme;

import day34_accessModifier_encapsulation.C01;

public class C01_ba�kaPackage {
	public static void main (String[]args) {
		
C01 obj =new C01();
		
	//	System.out.println(obj.say�private);
	//	System.out.println(obj.say�Default);  sadece ayn� package dakiler ula�abilir
	//	System.out.println(obj.say�Protected);  ayn� package daki class lar ve child class lar ula�abilir
		System.out.println(obj.say�Public);
		
	}
	
	

}
