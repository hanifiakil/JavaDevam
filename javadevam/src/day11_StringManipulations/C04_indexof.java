package day11_StringManipulations;

public class C04_indexof {

	public static void main(String[] args) {
		
		String srt="Çalýþýrsanýz, Java çok kolay";
		
		System.out.println(srt.indexOf('s'));//7
		System.out.println(srt.indexOf("J"));//14
		
		//indexof metodu bize herzaman int bir deðerle döner
		
		int index=srt.indexOf("a");//1
		
		System.out.println(index);
		
		System.out.println(srt.indexOf('q'));//olmayan karakterlerde indexof -1 ile karþýlýk verir
		
		// büyük küçük duyarlýlýðý da vardýr   -1
		
		System.out.println(srt.indexOf("Java"));//þeklinde alýnan kesitlerde de baþ harfin index i
		//ile belirlenir.  14
		
		System.out.println(srt.indexOf('a',11));// 11. index ten sonraki karakteri buldurur.
		//11 dahil   15
		
		
		
		

	}

}
