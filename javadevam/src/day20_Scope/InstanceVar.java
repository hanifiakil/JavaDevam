package day20_Scope;

public class InstanceVar {
	int notMat=50;
	int notFen;
	//instance variable'lar�n scope'unda main method yoktur

	public static void main(String[] args) {
		
		//System.out.println(notMat);//main method static oldu�u i�in static olmayan variable'lar
		                           //main method'da direk kullan�lamaz veya g�r�nt�lenemez
		
		/*instance variable'lara main method dan ula�mak istersek obje olu�turup
		 * obje �zerinden eri�im sa�lanabiliriz
		 * 
		 * Scanner scan=new Scanner(System.in)
		 * i�inde oldu�umuz class dan bir obje olu�tural�m */
		InstanceVar rukiye=new InstanceVar ();
		System.out.println(rukiye.notMat);//50

		InstanceVar hanifi=new InstanceVar();
		
		hanifi.notMat=90;
		
		System.out.println(hanifi.notMat);//90
		/*instance variable larda de�er atamazsak java instance atanan de�eri al�r
		 * bu class i�in not
		 * ama istersek de�erde atayabiliriz
		 * bu durumda de�er atad���m�z obje i�in yeni de�er ge�erli olur*/
		
		System.out.println(rukiye.notMat);//50
		
		rukiye.notMat=85;
		
		System.out.println(rukiye.notMat);//90
		
		rukiye.method2();
		
	}
public static void staticMethod() {
	
//	System.out.println(notFen); instance variable lara static metod lardan direk ula��lamaz
}
public void method2() {
	System.out.println("metod2 deki notFen : " + notFen);//bu metod static olmad��� i�in instance
	                                                     //bu durumda java default de�erler atar
	                                                     //int i�in default de�er 0(s�f�r) d�r
	notFen=100;
	System.out.println("method2 deki d�zeltilmi� notfen : " + notFen);
}
}
