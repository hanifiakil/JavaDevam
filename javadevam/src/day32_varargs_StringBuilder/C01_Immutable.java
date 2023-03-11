package day32_varargs_StringBuilder;

public class C01_Immutable {

	public static void main(String[] args) {
		
		String s="hello";
		
		String t =new String(s);
		if("hello".equals(s)) System.out.println("one");
		if(t==s)System.out.println("two");
		if(t.equals(s)) System.out.println("three");
		if("hello"==s)System.out.println("four");
		if("hello"==t)System.out.println("five");

	}

}
