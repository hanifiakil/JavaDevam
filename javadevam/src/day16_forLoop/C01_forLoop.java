package day16_forLoop;

public class C01_forLoop {

	public static void main(String[] args) {
		
		for (int i = 0; i < 10; i++) {System.out.print(i + " ");
			
		}
		
		//for loop ba�lang�� ve biti� �art� bir say�n�n de�erlerine ba�l� olan
		//durumlarda tercih edilir.
		
		//e�er ba�lang�� say�s� art��/azal�� ile biti� de�erine yakla�m�yorsa loop hi� durmaz
		
		
		for (int i = 0; i > 10; i++) {System.out.println(i);
			
		}
		
		//kot �al���r ama ilk de�er i�in biti� �art� false oldu�u i�in
		//hi� bir i�lem yapmaz ve sonraki sat�ra ge�er.
		
		
	}

}
