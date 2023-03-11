package day36_Ýnhritance;

import day35_encapsulation_inheritance.Muhasebe;

public class Memur extends Muhasebe{

	public static void main(String[] args) {
		
		Memur memur1=new Memur();
		
		memur1.isim="hasan";
		memur1.saatÜcreti=16;
		memur1.maaþ=memur1.maaþHesaplama();
		System.out.println("memur1 in maaþý : " + memur1.maaþ);

	}

}
