package day36_�nhritance;

import day35_encapsulation_inheritance.Muhasebe;

public class Memur extends Muhasebe{

	public static void main(String[] args) {
		
		Memur memur1=new Memur();
		
		memur1.isim="hasan";
		memur1.saat�creti=16;
		memur1.maa�=memur1.maa�Hesaplama();
		System.out.println("memur1 in maa�� : " + memur1.maa�);

	}

}
