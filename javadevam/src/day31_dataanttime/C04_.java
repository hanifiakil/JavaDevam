package day31_dataanttime;

import java.time.LocalTime;

public class C04_ {

	public static void main(String[] args) {
		// bir String ve bir int variable olu�tural�m
		//bir loop i�erisin de bu variable lar� 1000 kere de�i�tirelim
		//ve i�lem s�relerini k�yaslayal�m
		
		
        LocalTime saat=LocalTime.now();
		
		
		
		int say�=10;
		for (int i = 0; i <10000; i++) {
			
			say�++;
		}

		LocalTime biti�saat=LocalTime.now();//
		
		
		
		double nanoba�lang��=saat.getNano();
		double nanobiti�=biti�saat.getNano();
		
		System.out.println("for loop un �al��ma s�resi : " +(nanobiti�-nanoba�lang��));
	
		LocalTime ba�lang��saatS=LocalTime.now();
		
	String isim="hanifi";
	for (int i = 0; i < 10000; i++) {
		isim+=" ";
	}
	
	LocalTime biti�saat�S=LocalTime.now();
	
	double nanoba�lang��S=ba�lang��saatS.getNano();
	double nanobiti�S=biti�saat�S.getNano();
	
	System.out.println("String for loop un �al��ma s�resi : " +(nanobiti�S-nanoba�lang��S));
	
	double intforloops�resi=(nanobiti�-nanoba�lang��);
	double Stringforloops�resi=(nanobiti�S-nanoba�lang��S);
	
	
	System.out.println("int for loop h�z� String ten " + (-intforloops�resi+Stringforloops�resi) + "nano saniye daha h�zl�d�r");
	}
	//verilen iki do�um tarihinin hangisinin daha �nce oldu�unu bulunuz
		
		
		

	}


