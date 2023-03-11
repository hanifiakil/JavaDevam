package day22_Arrays;

import java.util.Arrays;

public class C03_Split {
	public static void main(String[] args) {
		//"java öðrendim,  #çok para ?kazandým.," cümlesinin kelimelerini, özel karakterler ve
		//noktalama iþaretleri olmadan harf sýrasýna göre yazdýralým
		
		String cümle="java ogrendim,  #cok para ?kazandim.,";
		String kelimeler[]=cümle.split(" ");
		
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
