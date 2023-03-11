package day19_whileloop_dowhileloop;

import java.util.Scanner;

public class C05_doWhileLoop {

	public static void main(String[] args) {
		/* kullanýcýdan bir þifre girmesini isteyin. girilen þifreyi aþaðýdaki þartlara göre kontrol
		 * edin ve þifredeki hatalarý yazdýrýn
		 * kullanýcý geçerli bir þifre girinceye kadar bu iþlemi tekrar edin ve geçerli þifre
		 * girdiðinde "þifreniz kabul edilmiþtir"yazdýrýn.
		 * -þifre küçük harf içermelidir
		 * -þifre büyük harf içermelidir
		 * -þifre özel karakter içermelidir
		 * -þifre en az 8 karakter olmalýdýr */
		
		/*
	}*/
			Scanner scan=new Scanner (System.in);
			String þifre="";
			boolean khk=false;
			boolean bhk=false;
			boolean ökk=false;
			boolean uk=false;
			
			do {
				System.out.println("lütfen bir þifre giriniz");
				þifre=scan.nextLine();
				khk=küçükharfkontrol(þifre);
				bhk=büyükharfkontrol(þifre);
				ökk=özelkarakterkontrol(þifre);
				uk=uzunlukkontrol(þifre);
				
			} while (!khk || !bhk || !ökk || !uk);
			System.out.println("þifreniz baþarýyla kaydedilmiþtir");
			
			scan.close();
		}

	private static boolean uzunlukkontrol(String þifre) {
		boolean uk=false;
		
		if (þifre.length()>=8) {
			uk=true;
			
		} else {System.out.println("þifre en az 8 karakter içermelidir");

		}
		return uk;
	}

	private static boolean özelkarakterkontrol(String þifre) {
		boolean ökk=false;
		String harfler="é!'^+%&/()=?_<>£#$½6{[]}";
		for (int i = 0; i < þifre.length(); i++) {
			if (harfler.contains(þifre.substring(i,i+1))) {
				ökk=true;
				break;//break kullanmamýzýn sebebi: soruda 1 tane harf olmasý yeterli
				       //biz küçük harfi bulduktan sonra kodu durdurmazsak
				      //sonradan karþýmýza çýkacak büyük harfler bizi yanýltýr
			}
			
		}
		if (!ökk) {
			System.out.println("þifreniz en az bir özel karakter içermelidir");
		}
		return ökk;
		
		
	}

	

	private static boolean büyükharfkontrol(String þifre) {
		boolean bhk=false;
		String harfler="ABCDEFGHIÝJKLMNOÖPRSTUÜVYZQWX";
		for (int i = 0; i < þifre.length(); i++) {
			if (harfler.contains(þifre.substring(i,i+1))) {
				bhk=true;
				break;//break kullanmamýzýn sebebi: soruda 1 tane harf olmasý yeterli
				       //biz küçük harfi bulduktan sonra kodu durdurmazsak
				      //sonradan karþýmýza çýkacak büyük harfler bizi yanýltýr
			}
			
		}
		if (!bhk) {
			System.out.println("þifreniz en az bir büyük harf içermelidir");
		}
		return bhk;
		
		
	}

	private static boolean küçükharfkontrol(String þifre) {
		boolean  khk=false;
		String harfler="abcdefghýijklmnoöprstuüvyzqwx";
		for (int i = 0; i < þifre.length(); i++) {
			if (harfler.contains(þifre.substring(i,i+1))) {
				khk=true;
				break;//break kullanmamýzýn sebebi: soruda 1 tane harf olmasý yeterli
				       //biz küçük harfi bulduktan sonra kodu durdurmazsak
				      //sonradan karþýmýza çýkacak büyük harfler bizi yanýltýr
			}
			
		}
		if (!khk) {
			System.out.println("þifreniz en az bir küçük harf içermelidir");
		}
		return khk;
		
	}
				
	}


