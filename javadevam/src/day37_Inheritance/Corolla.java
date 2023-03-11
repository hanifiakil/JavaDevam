package day37_Inheritance;

public class Corolla extends Toyota {
	
	String renk;
	int fiyat;
	boolean elektriklimi;
	int tekersayýsý=4;
	String üretimyeri="türkiye";
	

	public static void main(String[] args) {
		

		     Corolla             arb1          =           new       Corolla();
		
	//Class ismi && Data türü  obje ismi   assignment    keyword    Constructor
		
		//java da obje oluþturduðumuz her class ismi ayný zaman da bir data türüdür
		//bu örneðimiz için corolla hem class adý hem de oluþturduðumuz arb1 objesinin data type dýr
		//java da obje üretilen her bir class ayný zamanda non-primitive data türü olur
		     Toyota arb2 = new Corolla();
		
		Araba arb3=new Corolla();
		
		
		String str = new String("filiz");
		
	}

}
