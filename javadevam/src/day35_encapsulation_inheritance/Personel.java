package day35_encapsulation_inheritance;

public class Personel {
	
	protected String isim;
	protected String soyisim;
	protected boolean �al���yorMu;
	protected String telNo;
	protected int ya�;
	
	Personel(){
		System.out.println("personel parametresiz constructor �al��t�");
	}
	
	/*e�er variable lara access modifier yazmazsak
	java access modifier olarak default acc. mod.atar
	b�yle olursa sadece opackage alt�ndaki child class lar
	Personel class �n� �nherit edebilir
	ba�ka package lardaki child class lar�n da Personel i inherit edebilmesi i�in
	variable ve method lar�n acc. mod. lar�n� protected yapar�z
	public yapsakta inherit edilebilir ama biz herkesin eri�mesini de�il de
	sadece child class lar�n eri�mesini istedi�imizden protected � tercih ederiz*/

	public static void main(String[] args) {
		

	}

}
