package day34_accessdeneme;

import day34_accessModifier_encapsulation.C01;

public class C02_ba�kaPackageChildClass extends C01{

	public static void main(String[] args) {
	
C01 obj =new C01();
		
		//System.out.println(obj.say�private);
	//	System.out.println(obj.say�Default);
	//	System.out.println(obj.say�Protected);
		System.out.println(obj.say�Public);
		
	}
		
		public void staticolmayanmetod() {
			
			C01 obj =new C01();
			
	//		System.out.println(obj.say�private);
	//		System.out.println(obj.say�Default);
			System.out.println(say�Protected);//bu class da say�Protected diye bir variable
			                                  //olmad��� halde, parent class da var oldu�u i�in
			                                  //java problem yapmad�
			System.out.println(obj.say�Public);
			
		}

	

}
