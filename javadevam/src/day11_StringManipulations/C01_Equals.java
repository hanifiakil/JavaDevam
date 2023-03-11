package day11_StringManipulations;

public class C01_Equals {

	public static void main(String[] args) {
	
		int sayı1=10;
		int sayı2=sayı1+0;
		System.out.println(sayı1==sayı2);//true yazd�r�r
		
		char chr1='a';
		char chr2='a'+0;
		
		System.out.println(chr1==chr2);//true yazd�r�r
		
		String str1="ali";
		String str2="can";
		String str3="ali can";
		String str4=str1 + " " + str2;
		
		System.out.println(str3==str4); //false yazar 
		

		System.out.println(str3.equals(str4));//true yazd�r�r
	}

}
