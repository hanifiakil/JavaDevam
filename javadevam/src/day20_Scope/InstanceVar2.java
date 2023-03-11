package day20_Scope;

public class InstanceVar2 {

	String adres="ankara";
	String dogumyeri;
	double notortalamasý;
	double yaþort=12.3;
	char cinsiyet='e';
	char karakter;
	boolean öðrencimi=true;
	boolean izinlimi;
	
	public static void main(String[] args) {
		//instance variable lara main metod dan direk ulaþýlabilir mi? HAYIR
		//nasýl ulaþýlabilir? OBJE OLUÞTURARAK
		
		InstanceVar2 hanifi=new InstanceVar2();
		
		System.out.println(hanifi.adres);//ankara
		System.out.println(hanifi.dogumyeri);//null
		System.out.println(hanifi.notortalamasý);//0
		System.out.println(hanifi.yaþort);//12.3
		System.out.println(hanifi.cinsiyet);//e
		System.out.println(hanifi.karakter);//" "
		System.out.println(hanifi.öðrencimi);//true
		System.out.println(hanifi.izinlimi);//false
		
		

	}

	public static void staticMethod() {
		//instance variable lara static metod dan direk ulaþýlabilir mi? HAYIR
		//nasýl ulaþýlabilir? OBJE OLUÞTURARAK
		
	}
	
	public void staticolmayanmethod() {
		//instance variable lara static olmayan metod dan direk ulaþýlabilir mi? EVET
		
	}
}
