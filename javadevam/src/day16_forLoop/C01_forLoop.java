package day16_forLoop;

public class C01_forLoop {

	public static void main(String[] args) {
		
		for (int i = 0; i < 10; i++) {System.out.print(i + " ");
			
		}
		
		//for loop baþlangýç ve bitiþ þartý bir sayýnýn deðerlerine baðlý olan
		//durumlarda tercih edilir.
		
		//eðer baþlangýç sayýsý artýþ/azalýþ ile bitiþ deðerine yaklaþmýyorsa loop hiç durmaz
		
		
		for (int i = 0; i > 10; i++) {System.out.println(i);
			
		}
		
		//kot çalýþýr ama ilk deðer için bitiþ þartý false olduðu için
		//hiç bir iþlem yapmaz ve sonraki satýra geçer.
		
		
	}

}
