package day22_Arrays;

import java.util.Arrays;

public class C02_Split {

	public static void main(String[] args) {
		// "java öðrenmek çok güzel" cümlesinin kelimelerini ters sýra yazdýrýn
		String cümle="java öðrenmek çok güzel";
		
		String kelimeler[]=cümle.split(" ");
		
		System.out.println(Arrays.toString(kelimeler));

		for (int i = kelimeler.length-1;i>=0; i--) {
			System.out.print(kelimeler[i] + " ");
			
		}
	}

}
