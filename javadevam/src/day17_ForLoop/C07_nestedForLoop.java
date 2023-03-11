package day17_ForLoop;

public class C07_nestedForLoop {

	public static void main(String[] args) {
	//1 den 4 e kadar sayýlarý yan yana aralarýnda bir boþluk býrakarak yazdýrýn
		
		
		
		for (int satýr = 1; satýr <=6; satýr++) {
			for (int i = 1; i <=4; i++) {System.out.print(satýr*i + " ");
			
		}//iç içe girilen for loop larda sýra ile yazma gerçekleþir
			System.out.println("");//ilk for loop bir tur attýktan sonra alt satýra geçmesi için
		}

	}

}
