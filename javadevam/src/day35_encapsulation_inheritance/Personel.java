package day35_encapsulation_inheritance;

public class Personel {
	
	protected String isim;
	protected String soyisim;
	protected boolean çalýþýyorMu;
	protected String telNo;
	protected int yaþ;
	
	Personel(){
		System.out.println("personel parametresiz constructor çalýþtý");
	}
	
	/*eðer variable lara access modifier yazmazsak
	java access modifier olarak default acc. mod.atar
	böyle olursa sadece opackage altýndaki child class lar
	Personel class ýný Ýnherit edebilir
	baþka package lardaki child class larýn da Personel i inherit edebilmesi için
	variable ve method larýn acc. mod. larýný protected yaparýz
	public yapsakta inherit edilebilir ama biz herkesin eriþmesini deðil de
	sadece child class larýn eriþmesini istediðimizden protected ý tercih ederiz*/

	public static void main(String[] args) {
		

	}

}
