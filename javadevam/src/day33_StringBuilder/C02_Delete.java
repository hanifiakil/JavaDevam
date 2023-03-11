package day33_StringBuilder;

public class C02_Delete {

	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder("java candýr can");
		
		sb.deleteCharAt(11);//sadece 11. index deki karakteri siler
		System.out.println(sb);
		
		sb.delete(11,(sb.length()));
		
		System.out.println(sb);

	}

}
