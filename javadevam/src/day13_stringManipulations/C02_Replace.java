package day13_stringManipulations;

public class C02_Replace {

	public static void main(String[] args) {
		// String olarak verilen 10.000 say�s�n�n
		//binden b�y�k olup olmad���n� yazd�r�n
		
		String sonu�="10.000";
		
		sonu�=sonu�.replace(".","");//10000 e �evirip sonu� assign ettik
		                            // = oldu�u i�in sonu� kal�c� olarak de�i�ti
		
		if(Integer.valueOf(sonu�)>1000) {System.out.println("bulunan sonu� say�s� 1000 den �ok");
			
		}else {System.out.println("bulunan sonu� say�s� 1000 den k���k");
			
		}
		

	}

}
