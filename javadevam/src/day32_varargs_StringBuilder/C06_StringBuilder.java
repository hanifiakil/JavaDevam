package day32_varargs_StringBuilder;

public class C06_StringBuilder {

	public static void main(String[] args) {
		
		String str = "alican";
		String str2 = new String("velican");
		
		StringBuilder sb = new StringBuilder("ya�as�n java");
		
		sb.append("!!!");
		System.out.println(sb);
		sb.toString().toUpperCase();// �al��mas� i�in yeni bir String kurup atama yapmam�z laz�m

		System.out.println(sb);
	}

}
