package day12_;

import java.util.Scanner;

public class C03_LastIndexOf {

	public static void main(String[] args) {
		//kullan�c�dan bir c�mle ve kelime isteyi .
				//kelimenin c�mledeki kullan�m�na bakarak a�a��daki 3 �eyi yazd�r�n
				
				/*girilen kelime c�mlede kullan�lmam��t�r
				 * girilen kelime c�mlede bir defa kullan�lm��t�r
				 * girilen kelime c�mlede 1 den fazla kullan�lm��t�r*/
				

				Scanner scan = new Scanner(System.in); 
			
				System.out.print("L�tfen bir c�mle giriniz : ");
			
			
				String c�mle=scan.nextLine();
			
			
				System.out.print("l�tfen varl���n� kontrol etmek i�in bir kelime giriniz : ");
				
			
				String kelime=scan.next();
			
				int ilkindex=c�mle.indexOf(kelime);
				int sonindex = c�mle.lastIndexOf(kelime);
				
				if(ilkindex==-1) {
					System.out.println("girilen kelime c�mlede kullan�lmam��t�r");
				}else if(ilkindex==sonindex) {
					System.out.println("girilen kelime c�mlede bir defa kullan�lm��t�r");
					
				}else {System.out.println("girilen kelime c�mlede 1 den fazla kullan�lm��t�r");}
				
				scan.close();

	}

}
