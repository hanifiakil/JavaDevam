package day20_Scope;

public class StaticVariables {

	static int no=20;
	static int sayý;
	static String adres="ankara";
	static String cedde;
	static boolean aktifmi=true;
	static boolean tatildemi;
	
	public static void main(String[] args) {
		//static variable lara main metod dan direk ulaþýlabilir mi? EVET

		System.out.println(no);//20
		no++;
		System.out.println(no);//21
		staticMethod();
		System.out.println(no);//22
		StaticVariables obje=new StaticVariables();//static olmayan metod için obje oluþturup
		                                           //main metod a ekledik
		obje.staticolmayanmethod();
		
	}

	public static void staticMethod() {
		
		//static variable lara main metod dan direk ulaþýlabilir mi? EVET
		no++;
		System.out.println("staticMetod içindeki no : " + no);
		
		
	}
	public void staticolmayanmethod() {
		//static olmayan variable lara main metod dan direk ulaþýlabilir mi? EVET
	no++;
	System.out.println("static olmayan metod da no : " + no);
	}
}
