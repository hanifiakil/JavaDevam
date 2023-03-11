package day31_dataanttime;

import java.time.LocalTime;

public class C02_LocalTime {

	private static Object Zoneld;

	public static void main(String[] args) {
		LocalTime saat=LocalTime.now();//
		
		System.out.println("ba�lang�� saati : " + saat); //11:59:56.883272600
		
		int say�=10;
		for (int i = 0; i <10000; i++) {
			
			say�++;
		}

		LocalTime biti�saat=LocalTime.now();//
		
		System.out.println("biti� saati : " + biti�saat);
		
		//e�er bir i�lemin ba�lang�� ve biti� zaman�n� kaydetmek istiyorsak
		//hem ba��nda hem de sonunda LcalTime objesi olu�turmal�y�z
		
		double nanoba�lang��=saat.getNano();
		double nanobiti�=biti�saat.getNano();
		
		System.out.println("for loop un �al��ma s�resi : " +(nanobiti�-nanoba�lang��));
		
		System.out.println(saat.getMinute());//�uan ki dakika 59
		System.out.println(saat.plusMinutes(1000));//SAN�YE SONRA     06:41:19.982604900
		
		
	
	}

}
