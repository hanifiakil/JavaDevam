package day22_Arrays;

import java.util.Arrays;

public class C02_Split {

	public static void main(String[] args) {
		// "java ��renmek �ok g�zel" c�mlesinin kelimelerini ters s�ra yazd�r�n
		String c�mle="java ��renmek �ok g�zel";
		
		String kelimeler[]=c�mle.split(" ");
		
		System.out.println(Arrays.toString(kelimeler));

		for (int i = kelimeler.length-1;i>=0; i--) {
			System.out.print(kelimeler[i] + " ");
			
		}
	}

}
