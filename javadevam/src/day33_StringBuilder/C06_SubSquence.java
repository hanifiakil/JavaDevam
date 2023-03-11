package day33_StringBuilder;

public class C06_SubSquence {

	public static void main(String[] args) {
		StringBuilder sb =new StringBuilder("java ne kadar kolay");
		
		System.out.println(sb.substring(14));//kolay
		
		System.out.println(sb.subSequence(14, 19));//kolay
		
		//ikiside ayn� sonucu d�nd�r�r
		//ancak substring() String class �n dan geldi�i i�in substring kulland���mda
		//arkas�ndan strin metodlar� kullanabilirim 
		//ancak subSequence kulland���mda bu m�mk�n olmaz
		
		

	}

}
