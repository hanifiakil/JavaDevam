package day19_whileloop_dowhileloop;

import java.util.Scanner;

public class C01_whileloop {

	public static void main(String[] args) {
		// kullanýcýdan bir sayý alýn ve sayýyý tam bölen
		//sayýlarý ve toplam kaç tane olduklarýný ekranda yazdýrýn
		
		Scanner scan=new Scanner (System.in);
		System.out.println("lütfen bölenlerini bulmak için bir tam sayý giriniz");
		int sayý=scan.nextInt();
		
		int sayaç=0;
		int bölen=1;
		
		while (bölen<=sayý) {
			if (sayý%bölen==0) {System.out.print( bölen + " ");
			
			sayaç++;
			}bölen++;
			
			
		}System.out.println("");
		System.out.println("bölen sayýsý : " + sayaç);
		scan.close();
			
		}
	}


