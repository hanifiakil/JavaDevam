package day26_forEachloop_constructor;

public class Jeep_runner {

	public static void main(String[] args) {
		// jeep class �ndan bir obje olu�tural�m ve �zelliklerini yazd�ral�m
		
		Jeep jeep1=new Jeep();
		
		System.out.println(jeep1.fiyat + " " +jeep1.ilanno + " " 
		+jeep1.marka + " "+jeep1.model + " "+jeep1.y�l + " " );//10000 1001 null null 2001
		
		//jeep class �ndaki variable lar instance variable lar olduklar�ndan
		//atad���m de�erler sadece benim objem i�in de�erleri de�i�tirir
		//jeep class �n daki de�erlere hi�bir �ey yapmaz
		jeep1.fiyat=56000;
		jeep1.ilanno=1003;
		jeep1.marka="ford";
		jeep1.model="fusion";
		jeep1.y�l=2007;
		
		
		System.out.println(jeep1.fiyat + " " +jeep1.ilanno + " " 
				+jeep1.marka + " "+jeep1.model + " "+jeep1.y�l + " " );//56000 1003 ford fusion 2007
		
		jeep1.h�z(200);
		jeep1.yak�t("4.8 litre");

	}

}
