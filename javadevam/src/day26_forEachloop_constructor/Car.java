package day26_forEachloop_constructor;

public class Car {
	/*java biz bir class oluþturduðumuz da o class dan obje üreteceðimizi bilir
	 * ve her class a default bir constructor yerleþtirir
	 * java nýn class a koyduðu bu default constructor görülmez
	 * ama obje üretmek üzere kod yazdýðýmýzda otomatik olarak devreye girer */
	
	/*bir constructor oluþturmak çok kolaydýr
	 * method a benzer ama metod dan farklýdýr
	 * 1- constructor ismi class ismi ile ayný olmalýdýr
	 * class isimleri büyük harfle baþladýðý için constructor ismi de büyük harfle baþlar
	 * metod dan 1. farký budur method lar küçük harf ile baþlar 
	 * 2- constructor larýn return tyope i olmaz*/
	
	public Car() {
		
	}// java nýn her class da oluþturduðu constructor budur
	
	public int yýl;
	
	String renk;
	String model;
	int km;
	boolean satýlýkmý;
	

}
