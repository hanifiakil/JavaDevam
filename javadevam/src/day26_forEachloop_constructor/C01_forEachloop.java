package day26_forEachloop_constructor;

public class C01_forEachloop {

	public static void main(String[] args) {
		// iki String array olu�turunuz ve bu array lerdeki ortak elemanlar�
		//for-each loop kullanarak bulunuz. sonucu ekrana yazd�r�n�z.
		//ortak eleman yoksa ekrana "ortak eleman yok" yazd�r�n�z
		
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


