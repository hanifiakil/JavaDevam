package day20_Scope;

public class StaticVariables {

	static int no=20;
	static int say�;
	static String adres="ankara";
	static String cedde;
	static boolean aktifmi=true;
	static boolean tatildemi;
	
	public static void main(String[] args) {
		//static variable lara main metod dan direk ula��labilir mi? EVET

		System.out.println(no);//20
		no++;
		System.out.println(no);//21
		staticMethod();
		System.out.println(no);//22
		StaticVariables obje=new StaticVariables();//static olmayan metod i�in obje olu�turup
		                                           //main metod a ekledik
		obje.staticolmayanmethod();
		
	}

	public static void staticMethod() {
		
		//static variable lara main metod dan direk ula��labilir mi? EVET
		no++;
		System.out.println("staticMetod i�indeki no : " + no);
		
		
	}
	public void staticolmayanmethod() {
		//static olmayan variable lara main metod dan direk ula��labilir mi? EVET
	no++;
	System.out.println("static olmayan metod da no : " + no);
	}
}
