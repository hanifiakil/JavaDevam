package day33_StringBuilder;

public class C06_SubSquence {

	public static void main(String[] args) {
		StringBuilder sb =new StringBuilder("java ne kadar kolay");
		
		System.out.println(sb.substring(14));//kolay
		
		System.out.println(sb.subSequence(14, 19));//kolay
		
		//ikiside ayný sonucu döndürür
		//ancak substring() String class ýn dan geldiði için substring kullandýðýmda
		//arkasýndan strin metodlarý kullanabilirim 
		//ancak subSequence kullandýðýmda bu mümkün olmaz
		
		

	}

}
