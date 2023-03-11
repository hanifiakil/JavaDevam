package day34_accessdeneme;

import day34_accessModifier_encapsulation.C01;

public class C02_başkaPackageChildClass extends C01{

	public static void main(String[] args) {
	
C01 obj =new C01();
		
		//System.out.println(obj.sayıprivate);
	//	System.out.println(obj.sayıDefault);
	//	System.out.println(obj.sayıProtected);
		System.out.println(obj.sayıPublic);
		
	}
		
		public void staticolmayanmetod() {
			
			C01 obj =new C01();
			
	//		System.out.println(obj.sayıprivate);
	//		System.out.println(obj.sayıDefault);
			System.out.println(sayıProtected);//bu class da sayıProtected diye bir variable
			                                  //olmadığı halde, parent class da var olduğu için
			                                  //java problem yapmadı
			System.out.println(obj.sayıPublic);
			
		}

	

}
