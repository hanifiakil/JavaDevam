package day20_Scope;

public class InstanceVar2 {

	String adres="ankara";
	String dogumyeri;
	double notortalamas�;
	double ya�ort=12.3;
	char cinsiyet='e';
	char karakter;
	boolean ��rencimi=true;
	boolean izinlimi;
	
	public static void main(String[] args) {
		//instance variable lara main metod dan direk ula��labilir mi? HAYIR
		//nas�l ula��labilir? OBJE OLU�TURARAK
		
		InstanceVar2 hanifi=new InstanceVar2();
		
		System.out.println(hanifi.adres);//ankara
		System.out.println(hanifi.dogumyeri);//null
		System.out.println(hanifi.notortalamas�);//0
		System.out.println(hanifi.ya�ort);//12.3
		System.out.println(hanifi.cinsiyet);//e
		System.out.println(hanifi.karakter);//" "
		System.out.println(hanifi.��rencimi);//true
		System.out.println(hanifi.izinlimi);//false
		
		

	}

	public static void staticMethod() {
		//instance variable lara static metod dan direk ula��labilir mi? HAYIR
		//nas�l ula��labilir? OBJE OLU�TURARAK
		
	}
	
	public void staticolmayanmethod() {
		//instance variable lara static olmayan metod dan direk ula��labilir mi? EVET
		
	}
}
