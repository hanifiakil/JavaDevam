package day22_Arrays;

import java.util.Arrays;

public class C03_Split {
	public static void main(String[] args) {
		//"java ��rendim,  #�ok para ?kazand�m.," c�mlesinin kelimelerini, �zel karakterler ve
		//noktalama i�aretleri olmadan harf s�ras�na g�re yazd�ral�m
		
		String c�mle="java ogrendim,  #cok para ?kazandim.,";
		String kelimeler[]=c�mle.split(" ");
		
		System.out.println(Arrays.toString(kelimeler));
		
		for (int i = 0; i < kelimeler.length; i++) {
			
			kelimeler[i]=kelimeler[i].replaceAll("\\W","");
			
			
			System.out.println(kelimeler[i]);	
		}
		 System.out.println(Arrays.toString(kelimeler));
		 
		Arrays.sort(kelimeler);
		System.out.println(Arrays.toString(kelimeler));
		
		for (int i = 0; i < kelimeler.length; i++) {
			System.out.println(kelimeler[i]);
			
		}

}}
