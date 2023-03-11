package day14_methodCreation;

public class C01_methodCreation {

	public static void main(String[] args) {
	//verilen iki say�n�n toplam�n� ve �arp�m�n� yap�p yazd�ran iki ayr� method olu�turun
		
	//method olu�turmak i�in 4 ad�m takip edelim,
	//1. ad�m method call yazal�m
	//2. ad�m method a arguman yazacak m�y�z karar vermeliyiz
		
	int say�1=4;
	int say�2=5;
	
	toplama(say�1,say�2);//method call
	//3. ad�m 1 ve 2. ad�m� yapt�ktan sonra java dan yard�m al�p method u olu�tururuz
	
	�arpma(say�1,say�2);

	
	}

	public static void �arpma(int say�1, int say�2) {
	
		
		System.out.println("say�lar�n �arp�m� : " + (say�1*say�2));
		
	}

	public static void toplama(int say�1, int say�2) {
		// 4. ad�m eri�im d�zenleyici ve return type a karar vermeliyiz
		//eri�im d�zenleyici axcess modifier : public yapt�k
		//return type : bizden sadece yazd�rma istedi�i i�in void kalabilir
		
		System.out.println("say�lar�n toplam� : " + (say�1+say�2));
		
	}

}
