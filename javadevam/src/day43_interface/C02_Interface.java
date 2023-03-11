package day43_interface;

public interface C02_Interface {
	
	void motor(); //normal class larda access modifier yazmazsan�z java default access mo. kabul eder
	              //interface de ise access modifier yazmazsan�z java public olarak kabul eder
	
	int say�=10; //final ve static olarak kabul etti
	
	
	//interface de body si olan bir method yazmak isterseniz java size 2 alternatif sunar
	//1-method un ba��na "default" keyword yazabilirsiniz
	//    ancak burada yaz�lan default access modifier de�il, javan�n interface i�in �zel kabul etti�i bie keyword d�r
	//
	public default void kaporta() {
		
	}
	
	public static void �anzuman() {
		
	}

}
