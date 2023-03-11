package day24_arraylist;

import java.util.ArrayList;
import java.util.List;

public class C02_Add {

	public static void main(String[] args) {
		List<String> isimler =new ArrayList<>();
		System.out.println("boþ liste : " + isimler);
		isimler.add("ali");
		System.out.println("bir elemanlý : " + isimler);
		isimler.add("veli");
		System.out.println("iki elemanlý : " + isimler);
		//add method u listenin sonuna ekleme yapar
		isimler.add("can");
		System.out.println("üç elemanlý : " + isimler);
		
		isimler.add(1, "ayþe");//1. index e ayþe ekledik
		
		System.out.println("1. index e ayþe ekledik: " + isimler);
		
		List<String> liste2=new ArrayList<>();
		
		liste2.add("güllü");
		liste2.add("camýþ");
		
		System.out.println("liste2 elemanlarý : " + liste2);
		
		isimler.addAll(4, liste2);
		
		System.out.println("liste2 nin eklenmiþ hali : " + isimler);
		
		isimler.addAll(liste2);
		
		System.out.println(" son kýsmýna index siz liste2 nin eklenmiþ hali : " + isimler);
	}

}
