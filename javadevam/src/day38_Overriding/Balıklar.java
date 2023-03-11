package day38_Overriding;

public class Balýklar extends Animals{

	public static void main(String[] args) {
		Balýklar balýk1=new Balýklar();
		balýk1.beslenme();//tüm hayvanlar beslenir
		balýk1.hareket();//balýklar yüzerek hareket eder
		balýk1.solunum();//balýklar solungaçlarýyla nefes alýrlar

	}
	@Override
	//child class daki bir method parent class dan bir method u override ediyorsa
	//bunu istersek @Override rotasyonu ile deklare edebiliriz
	//deklare etmesekte kodlarýmýz çalýþýr
	//ancak deklare ettiðimiz de java overriden method u sürekli kontrol eder
	//ve o method da overriding e uymayan bir deðiþiklik olursa CTE verir
	public void hareket() {
		System.out.println("balýklar yüzerek hareket eder");
	}
	
	
	public void solunum() {
		System.out.println("balýklar solungaçlarýyla nefes alýrlar");

}
}
