package day26_forEachloop_constructor;

public class Jeep_runner {

	public static void main(String[] args) {
		// jeep class ýndan bir obje oluþturalým ve özelliklerini yazdýralým
		
		Jeep jeep1=new Jeep();
		
		System.out.println(jeep1.fiyat + " " +jeep1.ilanno + " " 
		+jeep1.marka + " "+jeep1.model + " "+jeep1.yýl + " " );//10000 1001 null null 2001
		
		//jeep class ýndaki variable lar instance variable lar olduklarýndan
		//atadýðým deðerler sadece benim objem için deðerleri deðiþtirir
		//jeep class ýn daki deðerlere hiçbir þey yapmaz
		jeep1.fiyat=56000;
		jeep1.ilanno=1003;
		jeep1.marka="ford";
		jeep1.model="fusion";
		jeep1.yýl=2007;
		
		
		System.out.println(jeep1.fiyat + " " +jeep1.ilanno + " " 
				+jeep1.marka + " "+jeep1.model + " "+jeep1.yýl + " " );//56000 1003 ford fusion 2007
		
		jeep1.hýz(200);
		jeep1.yakýt("4.8 litre");

	}

}
