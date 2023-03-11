package day43_interface;

public interface C02_Interface {
	
	void motor(); //normal class larda access modifier yazmazsanýz java default access mo. kabul eder
	              //interface de ise access modifier yazmazsanýz java public olarak kabul eder
	
	int sayý=10; //final ve static olarak kabul etti
	
	
	//interface de body si olan bir method yazmak isterseniz java size 2 alternatif sunar
	//1-method un baþýna "default" keyword yazabilirsiniz
	//    ancak burada yazýlan default access modifier deðil, javanýn interface için özel kabul ettiði bie keyword dür
	//
	public default void kaporta() {
		
	}
	
	public static void þanzuman() {
		
	}

}
