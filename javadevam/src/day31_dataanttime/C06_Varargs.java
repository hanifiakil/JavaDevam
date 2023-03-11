package day31_dataanttime;

public class C06_Varargs {

	public static void main(String[] args) {
		// verilen sayýlarý toplayan bir method oluþturmak istiyorum
		
		int a=10;
		int b=20;
		int c=30;
		int d=40;
		int e=50;
		int f=60;
		
		topla(a,b);
		topla(a,b,c);
		topla(a,b,c,d);
		topla(a,b,c,d,e);
		topla(a,b,c,d,e,f);
		
		
	}

	private static void topla(int... a) {
		System.out.println("varargs");
		
	}

	private static void topla(int a, int b, int c) {
		System.out.println(a+b+c);
		
	}

	private static void topla(int a, int b) {
		System.out.println(a+b);
		
	}

	
	}


