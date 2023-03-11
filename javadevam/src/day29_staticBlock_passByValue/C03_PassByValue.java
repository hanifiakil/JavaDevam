package day29_staticBlock_passByValue;

public class C03_PassByValue {

	public static void main(String[] args) {
		// mein metod dan diðer metodlara veya diðer metod lardan main metod a bir variable gönderirseniz
		//java orjinal variable larý deðil onlarýn deðerlerini(value) götürür orjinal variable in deðeri deðiþmez
		
				int fiyat=100;
				
				indirimyap25(fiyat);
				
				System.out.println("method uygulandýktan sonraki fiyat : " + fiyat);
				
				fiyat=indirimyap10(fiyat);
				//indirimi kalýcý yapmak istiyorsanýz main method a atama yapmamýz gerekir
				
				System.out.println("method uygulandýktan sonraki fiyat : " + fiyat);
			}

			private static int indirimyap10(int fiyat) {
				fiyat*=0.90;
				
				System.out.println("%10 indirim yapýlmýþ hali : " + fiyat);
				return fiyat;
				
			}

			private static int indirimyap25(int fiyat) {
				fiyat*=0.75;
				
				return fiyat;

		}

	}


