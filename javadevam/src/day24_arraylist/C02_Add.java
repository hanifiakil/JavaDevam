package day24_arraylist;

import java.util.ArrayList;
import java.util.List;

public class C02_Add {

	public static void main(String[] args) {
		List<String> isimler =new ArrayList<>();
		System.out.println("bo� liste : " + isimler);
		isimler.add("ali");
		System.out.println("bir elemanl� : " + isimler);
		isimler.add("veli");
		System.out.println("iki elemanl� : " + isimler);
		//add method u listenin sonuna ekleme yapar
		isimler.add("can");
		System.out.println("�� elemanl� : " + isimler);
		
		isimler.add(1, "ay�e");//1. index e ay�e ekledik
		
		System.out.println("1. index e ay�e ekledik: " + isimler);
		
		List<String> liste2=new ArrayList<>();
		
		liste2.add("g�ll�");
		liste2.add("cam��");
		
		System.out.println("liste2 elemanlar� : " + liste2);
		
		isimler.addAll(4, liste2);
		
		System.out.println("liste2 nin eklenmi� hali : " + isimler);
		
		isimler.addAll(liste2);
		
		System.out.println(" son k�sm�na index siz liste2 nin eklenmi� hali : " + isimler);
	}

}
