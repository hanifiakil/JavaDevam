package day12_;

import java.util.Scanner;

public class C03_LastIndexOf {

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
				
			
				String kelime=scan.next();
			
				int ilkindex=cümle.indexOf(kelime);
				int sonindex = cümle.lastIndexOf(kelime);
				
				if(ilkindex==-1) {
					System.out.println("girilen kelime cümlede kullanýlmamýþtýr");
				}else if(ilkindex==sonindex) {
					System.out.println("girilen kelime cümlede bir defa kullanýlmýþtýr");
					
				}else {System.out.println("girilen kelime cümlede 1 den fazla kullanýlmýþtýr");}
				
				scan.close();

	}

}
