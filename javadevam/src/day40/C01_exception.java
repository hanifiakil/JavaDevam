package day40;

public class C01_exception {

	public static void main(String[] args) {
		
		int a=20;
		int b=0;
		
		
		
		try {System.out.println("say�lar�n b�l�m� : " + a/b);
			
		} catch (ArithmeticException e) {
			System.out.println("s�f�r a b�l�m yap�lamaz");
			//System.out.println(e.getMessage());//   /by zero
			e.printStackTrace();//java.lang.ArithmeticException: / by zero
			                    //at ders_mehmet/day40.C01_exception.main(C01_exception.java:12)
		}
		
		System.out.println("g�rev tamamland�");

	}

}
