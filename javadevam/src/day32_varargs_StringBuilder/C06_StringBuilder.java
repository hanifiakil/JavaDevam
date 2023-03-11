package day32_varargs_StringBuilder;

public class C06_StringBuilder {

	public static void main(String[] args) {
		
		String str = "alican";
		String str2 = new String("velican");
		
		StringBuilder sb = new StringBuilder("yaþasýn java");
		
		sb.append("!!!");
		System.out.println(sb);
		sb.toString().toUpperCase();// çalýþmasý için yeni bir String kurup atama yapmamýz lazým

		System.out.println(sb);
	}

}
