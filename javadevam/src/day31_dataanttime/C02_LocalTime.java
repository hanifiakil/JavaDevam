package day31_dataanttime;

import java.time.LocalTime;

public class C02_LocalTime {

	private static Object Zoneld;

	public static void main(String[] args) {
		LocalTime saat=LocalTime.now();//
		
		System.out.println("baþlangýç saati : " + saat); //11:59:56.883272600
		
		int sayý=10;
		for (int i = 0; i <10000; i++) {
			
			sayý++;
		}

		LocalTime bitiþsaat=LocalTime.now();//
		
		System.out.println("bitiþ saati : " + bitiþsaat);
		
		//eðer bir iþlemin baþlangýç ve bitiþ zamanýný kaydetmek istiyorsak
		//hem baþýnda hem de sonunda LcalTime objesi oluþturmalýyýz
		
		double nanobaþlangýç=saat.getNano();
		double nanobitiþ=bitiþsaat.getNano();
		
		System.out.println("for loop un çalýþma süresi : " +(nanobitiþ-nanobaþlangýç));
		
		System.out.println(saat.getMinute());//þuan ki dakika 59
		System.out.println(saat.plusMinutes(1000));//SANÝYE SONRA     06:41:19.982604900
		
		
	
	}

}
