package day26_forEachloop_constructor;

public class C01_forEachloop {

	public static void main(String[] args) {
		// iki String array oluþturunuz ve bu array lerdeki ortak elemanlarý
		//for-each loop kullanarak bulunuz. sonucu ekrana yazdýrýnýz.
		//ortak eleman yoksa ekrana "ortak eleman yok" yazdýrýnýz
		
		String arr1[]= {"a","c","b"};
		String arr2[]= {"a","k","o"};
		
		int flag=0;
		
		for (String each1 : arr1) {
			
			for (String each2: arr2) {
				
				if (each1.equals(each2)) {
					System.out.print(each1 + " ");
				
					flag++;
				}

				}
				
			}
			if (flag==0) {System.out.println("ortak eleman yok...");
				
			}
		}

	}


