package day33_StringBuilder;

public class C01_append_capacity {

	public static void main(String[] args) {
	StringBuilder sb=new StringBuilder();
	
	System.out.println(sb.length());//0 sb in kullanýlan kýsmýnýn uzunluðu
	System.out.println(sb.capacity());// 16 sb in kapasitesini verir.
	
	StringBuilder sb2=new StringBuilder("java candýr");
	
	System.out.println(sb2.length());//11
	System.out.println(sb2.capacity());//27
	
	
StringBuilder sb3=new StringBuilder(7);

sb3.append("mehlika");

System.out.println(sb3.length());//7
System.out.println(sb3.capacity());//7


StringBuilder sb4=new StringBuilder(7);
	
System.out.println(sb4.length());//0
System.out.println(sb4.capacity());//7

sb4.append("nilgün");

System.out.println(sb4.length());//6
System.out.println(sb4.capacity());//7

sb4.append(" candýr");

System.out.println(sb4.length());//13
System.out.println(sb4.capacity());//16


	}

}
