package day32_varargs_StringBuilder;

public class C04_varargs {

	public static void main(String[] args) {
		kafanag�rei�lem(5,8,10,12);

		//Varargs da hi� eleman olmasada java itiraz etmez
		//�nce int olarak tan�mlanan say�lar� e�le�tirir
		//kalan t�m say�lar� varargs a d�nd�r�r
	}

	private static void kafanag�rei�lem(int say�1,int say�2,int say�3,int ...say�lar) {
		int toplam=0;
		
		for (int each: say�lar) {
			
			toplam+=each;
			
		}
		System.out.println("girilen say�lar�n toplam� : " + toplam);
		
	}
	}


