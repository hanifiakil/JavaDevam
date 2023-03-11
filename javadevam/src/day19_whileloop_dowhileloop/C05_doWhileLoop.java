package day19_whileloop_dowhileloop;

import java.util.Scanner;

public class C05_doWhileLoop {

	public static void main(String[] args) {
		/* kullan�c�dan bir �ifre girmesini isteyin. girilen �ifreyi a�a��daki �artlara g�re kontrol
		 * edin ve �ifredeki hatalar� yazd�r�n
		 * kullan�c� ge�erli bir �ifre girinceye kadar bu i�lemi tekrar edin ve ge�erli �ifre
		 * girdi�inde "�ifreniz kabul edilmi�tir"yazd�r�n.
		 * -�ifre k���k harf i�ermelidir
		 * -�ifre b�y�k harf i�ermelidir
		 * -�ifre �zel karakter i�ermelidir
		 * -�ifre en az 8 karakter olmal�d�r */
		
		/*
	}*/
			Scanner scan=new Scanner (System.in);
			String �ifre="";
			boolean khk=false;
			boolean bhk=false;
			boolean �kk=false;
			boolean uk=false;
			
			do {
				System.out.println("l�tfen bir �ifre giriniz");
				�ifre=scan.nextLine();
				khk=k���kharfkontrol(�ifre);
				bhk=b�y�kharfkontrol(�ifre);
				�kk=�zelkarakterkontrol(�ifre);
				uk=uzunlukkontrol(�ifre);
				
			} while (!khk || !bhk || !�kk || !uk);
			System.out.println("�ifreniz ba�ar�yla kaydedilmi�tir");
			
			scan.close();
		}

	private static boolean uzunlukkontrol(String �ifre) {
		boolean uk=false;
		
		if (�ifre.length()>=8) {
			uk=true;
			
		} else {System.out.println("�ifre en az 8 karakter i�ermelidir");

		}
		return uk;
	}

	private static boolean �zelkarakterkontrol(String �ifre) {
		boolean �kk=false;
		String harfler="�!'^+%&/()=?_<>�#$�6{[]}";
		for (int i = 0; i < �ifre.length(); i++) {
			if (harfler.contains(�ifre.substring(i,i+1))) {
				�kk=true;
				break;//break kullanmam�z�n sebebi: soruda 1 tane harf olmas� yeterli
				       //biz k���k harfi bulduktan sonra kodu durdurmazsak
				      //sonradan kar��m�za ��kacak b�y�k harfler bizi yan�lt�r
			}
			
		}
		if (!�kk) {
			System.out.println("�ifreniz en az bir �zel karakter i�ermelidir");
		}
		return �kk;
		
		
	}

	

	private static boolean b�y�kharfkontrol(String �ifre) {
		boolean bhk=false;
		String harfler="ABCDEFGHI�JKLMNO�PRSTU�VYZQWX";
		for (int i = 0; i < �ifre.length(); i++) {
			if (harfler.contains(�ifre.substring(i,i+1))) {
				bhk=true;
				break;//break kullanmam�z�n sebebi: soruda 1 tane harf olmas� yeterli
				       //biz k���k harfi bulduktan sonra kodu durdurmazsak
				      //sonradan kar��m�za ��kacak b�y�k harfler bizi yan�lt�r
			}
			
		}
		if (!bhk) {
			System.out.println("�ifreniz en az bir b�y�k harf i�ermelidir");
		}
		return bhk;
		
		
	}

	private static boolean k���kharfkontrol(String �ifre) {
		boolean  khk=false;
		String harfler="abcdefgh�ijklmno�prstu�vyzqwx";
		for (int i = 0; i < �ifre.length(); i++) {
			if (harfler.contains(�ifre.substring(i,i+1))) {
				khk=true;
				break;//break kullanmam�z�n sebebi: soruda 1 tane harf olmas� yeterli
				       //biz k���k harfi bulduktan sonra kodu durdurmazsak
				      //sonradan kar��m�za ��kacak b�y�k harfler bizi yan�lt�r
			}
			
		}
		if (!khk) {
			System.out.println("�ifreniz en az bir k���k harf i�ermelidir");
		}
		return khk;
		
	}
				
	}


