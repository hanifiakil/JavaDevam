package day38_Overriding;

public class K�mesHayvanlar� extends Ku�lar {

	public static void main(String[] args) {
		
		K�mesHayvanlar� kms1= new K�mesHayvanlar�();
		
		kms1.beslenme();
		kms1.hareket();
		kms1.solunum();
		
		Ku�lar kms2=new K�mesHayvanlar�();
		
		kms2.beslenme();//animals   t�m hayvanlar beslenir
		kms2.hareket();// ku�lar   k�mes hayvanlar� y�r�yerek hareket eder
		kms2.solunum();//ku�lar    ku�lar akci�erleriyle nefes al�rlar
		//kendi spesifik �zellikleri d���nda ku�lara tabi oluyor
		//ama spesifik bir durumu varsa fark�n� ortaya koyuyor
		
		Ku�lar kms3=new Ku�lar();
		
		kms3.beslenme();//animals     t�m hayvanlar beslenir
		kms3.hareket();//ku�lar       ku�lar u�arak hareket eder
		kms3.solunum();//ku�lar       ku�lar akci�erleriyle nefes al�rlar

	}
	
	public void hareket() {
		System.out.println("k�mes hayvanlar� y�r�yerek hareket eder");
	
}

}
