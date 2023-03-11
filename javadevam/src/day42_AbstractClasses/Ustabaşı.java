package day42_AbstractClasses;

public class Ustaba�� extends ���i{
	
	public void stat�() {
		System.out.println("bu class taki t�m personel ustaba��d�r. imza ustaba��");
	}
	
	public void maa�() {
		System.out.println("ustaba�lar� ayl�k 10000 tl maa� al�r. imza: ustaba��");
	}
	
	public void mesai() {
		System.out.println("ustaba�� ar�za durumunda ar�za ��z�m�ne kadar �al���r . imza:ustaba��");
	}

	//obje olu�turdu�umuz en alttaki class parent class lardaki method lar�
	//override edince, class dan olu�turulan objeler en do�ru ve spesifik �zelliklere kavu�tu
	
	//ama klasik parent-child ili�kisinde t�m method lar� override etme mecburiyeti YOKTUR.
	
	//java parent class lardaki t�m metodlar� override etmek MECBUR�YET� kazand�rmak i�in
	//abstract class yap�s� olu�turmu�tur
	
	//yani bir class � abstract olarak tan�mlarsan�z child class lar t�m metod lar� override etmek zorunda kal�r
	
	//dolay�s�yla abstract yapt���m�z parent class lar sadece kal�p g�revi yapacaklar
	public static void main(String[] args) {
	
		Ustaba�� ust1=new Ustaba��();
		ust1.stat�();
		ust1.maa�();
		ust1.mesai();

	}

}
