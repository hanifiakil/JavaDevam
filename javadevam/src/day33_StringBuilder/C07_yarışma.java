package day33_StringBuilder;

public class C07_yarýþma {

	public static void main(String[] args) {
		// for loop ile 1000 defa bir iþlem yapalým
		//öncesinde ve sonrasýnda zamaný kontrol edip
		//StringBuilder ve String class larýnýn performanslarýný karþýlaþtýralým
		
		//ipucu:  long TimeSb =system.nanoTime(); kullanalým
		
		String str = "merhaba";
		
		StringBuilder sb =new StringBuilder("merhaba");
		sb.trimToSize();//capacity i length boyutuna indirir
		long time =System.nanoTime();
		
		for (int i = 0; i < 1000; i++) {
			
			str+=" ";
			
		}
		
		long time2 =System.nanoTime();
		
		long stringsüre=time2-time;
		
		long time3 =System.nanoTime();
		
		for (int i = 0; i < 1000; i++) {
			
			sb.append(" ");
			
		}
		long time4=System.nanoTime();
		
		long StringBuildersüre=time4-time3;
		
		if (StringBuildersüre>stringsüre) {
			System.out.println("StringBuilder çalýþma performansý string ten : " 
		+ (StringBuildersüre/stringsüre) + " kat daha yavaþtýr");
			
		} else {System.out.println("StringBuilder çalýþma performansý string ten : " 
	+ (stringsüre/StringBuildersüre) + " kat daha hýzlýdýr");

		}
		

	}

}
