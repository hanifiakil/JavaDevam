package day33_StringBuilder;

public class C07_yar��ma {

	public static void main(String[] args) {
		// for loop ile 1000 defa bir i�lem yapal�m
		//�ncesinde ve sonras�nda zaman� kontrol edip
		//StringBuilder ve String class lar�n�n performanslar�n� kar��la�t�ral�m
		
		//ipucu:  long TimeSb =system.nanoTime(); kullanal�m
		
		String str = "merhaba";
		
		StringBuilder sb =new StringBuilder("merhaba");
		sb.trimToSize();//capacity i length boyutuna indirir
		long time =System.nanoTime();
		
		for (int i = 0; i < 1000; i++) {
			
			str+=" ";
			
		}
		
		long time2 =System.nanoTime();
		
		long strings�re=time2-time;
		
		long time3 =System.nanoTime();
		
		for (int i = 0; i < 1000; i++) {
			
			sb.append(" ");
			
		}
		long time4=System.nanoTime();
		
		long StringBuilders�re=time4-time3;
		
		if (StringBuilders�re>strings�re) {
			System.out.println("StringBuilder �al��ma performans� string ten : " 
		+ (StringBuilders�re/strings�re) + " kat daha yava�t�r");
			
		} else {System.out.println("StringBuilder �al��ma performans� string ten : " 
	+ (strings�re/StringBuilders�re) + " kat daha h�zl�d�r");

		}
		

	}

}
