package day38_Overriding;

public class KümesHayvanlarý extends Kuþlar {

	public static void main(String[] args) {
		
		KümesHayvanlarý kms1= new KümesHayvanlarý();
		
		kms1.beslenme();
		kms1.hareket();
		kms1.solunum();
		
		Kuþlar kms2=new KümesHayvanlarý();
		
		kms2.beslenme();//animals   tüm hayvanlar beslenir
		kms2.hareket();// kuþlar   kümes hayvanlarý yürüyerek hareket eder
		kms2.solunum();//kuþlar    kuþlar akciðerleriyle nefes alýrlar
		//kendi spesifik özellikleri dýþýnda kuþlara tabi oluyor
		//ama spesifik bir durumu varsa farkýný ortaya koyuyor
		
		Kuþlar kms3=new Kuþlar();
		
		kms3.beslenme();//animals     tüm hayvanlar beslenir
		kms3.hareket();//kuþlar       kuþlar uçarak hareket eder
		kms3.solunum();//kuþlar       kuþlar akciðerleriyle nefes alýrlar

	}
	
	public void hareket() {
		System.out.println("kümes hayvanlarý yürüyerek hareket eder");
	
}

}
