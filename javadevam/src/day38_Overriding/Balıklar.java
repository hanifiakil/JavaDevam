package day38_Overriding;

public class Bal�klar extends Animals{

	public static void main(String[] args) {
		Bal�klar bal�k1=new Bal�klar();
		bal�k1.beslenme();//t�m hayvanlar beslenir
		bal�k1.hareket();//bal�klar y�zerek hareket eder
		bal�k1.solunum();//bal�klar solunga�lar�yla nefes al�rlar

	}
	@Override
	//child class daki bir method parent class dan bir method u override ediyorsa
	//bunu istersek @Override rotasyonu ile deklare edebiliriz
	//deklare etmesekte kodlar�m�z �al���r
	//ancak deklare etti�imiz de java overriden method u s�rekli kontrol eder
	//ve o method da overriding e uymayan bir de�i�iklik olursa CTE verir
	public void hareket() {
		System.out.println("bal�klar y�zerek hareket eder");
	}
	
	
	public void solunum() {
		System.out.println("bal�klar solunga�lar�yla nefes al�rlar");

}
}
