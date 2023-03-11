package day31_dataanttime;

import java.time.LocalTime;

public class C04_ {

	public static void main(String[] args) {
		// bir String ve bir int variable oluþturalým
		//bir loop içerisin de bu variable larý 1000 kere deðiþtirelim
		//ve iþlem sürelerini kýyaslayalým
		
		
        LocalTime saat=LocalTime.now();
		
		
		
		int sayý=10;
		for (int i = 0; i <10000; i++) {
			
			sayý++;
		}

		LocalTime bitiþsaat=LocalTime.now();//
		
		
		
		double nanobaþlangýç=saat.getNano();
		double nanobitiþ=bitiþsaat.getNano();
		
		System.out.println("for loop un çalýþma süresi : " +(nanobitiþ-nanobaþlangýç));
	
		LocalTime baþlangýçsaatS=LocalTime.now();
		
	String isim="hanifi";
	for (int i = 0; i < 10000; i++) {
		isim+=" ";
	}
	
	LocalTime bitiþsaatýS=LocalTime.now();
	
	double nanobaþlangýçS=baþlangýçsaatS.getNano();
	double nanobitiþS=bitiþsaatýS.getNano();
	
	System.out.println("String for loop un çalýþma süresi : " +(nanobitiþS-nanobaþlangýçS));
	
	double intforloopsüresi=(nanobitiþ-nanobaþlangýç);
	double Stringforloopsüresi=(nanobitiþS-nanobaþlangýçS);
	
	
	System.out.println("int for loop hýzý String ten " + (-intforloopsüresi+Stringforloopsüresi) + "nano saniye daha hýzlýdýr");
	}
	//verilen iki doðum tarihinin hangisinin daha önce olduðunu bulunuz
		
		
		

	}


