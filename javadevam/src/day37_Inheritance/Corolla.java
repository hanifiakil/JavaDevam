package day37_Inheritance;

public class Corolla extends Toyota {
	
	String renk;
	int fiyat;
	boolean elektriklimi;
	int tekersay�s�=4;
	String �retimyeri="t�rkiye";
	

	public static void main(String[] args) {
		

		     Corolla             arb1          =           new       Corolla();
		
	//Class ismi && Data t�r�  obje ismi   assignment    keyword    Constructor
		
		//java da obje olu�turdu�umuz her class ismi ayn� zaman da bir data t�r�d�r
		//bu �rne�imiz i�in corolla hem class ad� hem de olu�turdu�umuz arb1 objesinin data type d�r
		//java da obje �retilen her bir class ayn� zamanda non-primitive data t�r� olur
		     Toyota arb2 = new Corolla();
		
		Araba arb3=new Corolla();
		
		
		String str = new String("filiz");
		
	}

}
