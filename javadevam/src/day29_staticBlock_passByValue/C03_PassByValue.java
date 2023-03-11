package day29_staticBlock_passByValue;

public class C03_PassByValue {

	public static void main(String[] args) {
		// mein metod dan di�er metodlara veya di�er metod lardan main metod a bir variable g�nderirseniz
		//java orjinal variable lar� de�il onlar�n de�erlerini(value) g�t�r�r orjinal variable in de�eri de�i�mez
		
				int fiyat=100;
				
				indirimyap25(fiyat);
				
				System.out.println("method uyguland�ktan sonraki fiyat : " + fiyat);
				
				fiyat=indirimyap10(fiyat);
				//indirimi kal�c� yapmak istiyorsan�z main method a atama yapmam�z gerekir
				
				System.out.println("method uyguland�ktan sonraki fiyat : " + fiyat);
			}

			private static int indirimyap10(int fiyat) {
				fiyat*=0.90;
				
				System.out.println("%10 indirim yap�lm�� hali : " + fiyat);
				return fiyat;
				
			}

			private static int indirimyap25(int fiyat) {
				fiyat*=0.75;
				
				return fiyat;

		}

	}


