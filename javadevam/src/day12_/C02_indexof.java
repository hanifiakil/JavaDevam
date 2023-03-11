package day12_;

import java.util.Scanner;

public class C02_indexof {

	public static void main(String[] args) {
		//kullanýcýdan bir cümle ve kelime isteyi .
		//kelimenin cümledeki kullanýmýna bakarak aþaðýdaki 3 þeyi yazdýrýn
		
		/*girilen kelime cümlede kullanýlmamýþtýr
		 * girilen kelime cümlede bir defa kullanýlmýþtýr
		 * girilen kelime cümlede 1 den fazla kullanýlmýþtýr*/
		

		Scanner scan = new Scanner(System.in); 
	
		System.out.print("Lütfen bir cümle giriniz : ");
	
	
		String cümle=scan.nextLine();
	
	
		System.out.print("lütfen varlýðýný kontrol etmek için bir kelime giriniz : ");
		
		String kelime =scan.next();
		
		int index=cümle.indexOf(kelime);
		int index2=cümle.indexOf(kelime,index+1);
		
		
		if(index<0) {System.out.println("girilen kelime cümlede kullanýlmamýþtýr");
			
		}else {if(index2>=0) {System.out.println("girilen kelime cümlede 1 den fazla kullanýlmýþtýr");
			
		}else {System.out.println("girilen kelime cümlede 1 den fazla kullanýlmamýþtýr");
		
		
		scan.close();
		}
			
		}
		
		
	
	
	
}}
