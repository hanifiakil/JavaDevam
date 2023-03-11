package day40;

public class C01_exception {

	public static void main(String[] args) {
		
		int a=20;
		int b=0;
		
		
		
		try {System.out.println("sayýlarýn bölümü : " + a/b);
			
		} catch (ArithmeticException e) {
			System.out.println("sýfýr a bölüm yapýlamaz");
			//System.out.println(e.getMessage());//   /by zero
			e.printStackTrace();//java.lang.ArithmeticException: / by zero
			                    //at ders_mehmet/day40.C01_exception.main(C01_exception.java:12)
		}
		
		System.out.println("görev tamamlandý");

	}

}
