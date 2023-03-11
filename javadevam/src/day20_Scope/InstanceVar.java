package day20_Scope;

public class InstanceVar {
	int notMat=50;
	int notFen;
	//instance variable'larýn scope'unda main method yoktur

	public static void main(String[] args) {
		
		//System.out.println(notMat);//main method static olduðu için static olmayan variable'lar
		                           //main method'da direk kullanýlamaz veya görüntülenemez
		
		/*instance variable'lara main method dan ulaþmak istersek obje oluþturup
		 * obje üzerinden eriþim saðlanabiliriz
		 * 
		 * Scanner scan=new Scanner(System.in)
		 * içinde olduðumuz class dan bir obje oluþturalým */
		InstanceVar rukiye=new InstanceVar ();
		System.out.println(rukiye.notMat);//50

		InstanceVar hanifi=new InstanceVar();
		
		hanifi.notMat=90;
		
		System.out.println(hanifi.notMat);//90
		/*instance variable larda deðer atamazsak java instance atanan deðeri alýr
		 * bu class için not
		 * ama istersek deðerde atayabiliriz
		 * bu durumda deðer atadýðýmýz obje için yeni deðer geçerli olur*/
		
		System.out.println(rukiye.notMat);//50
		
		rukiye.notMat=85;
		
		System.out.println(rukiye.notMat);//90
		
		rukiye.method2();
		
	}
public static void staticMethod() {
	
//	System.out.println(notFen); instance variable lara static metod lardan direk ulaþýlamaz
}
public void method2() {
	System.out.println("metod2 deki notFen : " + notFen);//bu metod static olmadýðý için instance
	                                                     //bu durumda java default deðerler atar
	                                                     //int için default deðer 0(sýfýr) dýr
	notFen=100;
	System.out.println("method2 deki düzeltilmiþ notfen : " + notFen);
}
}
