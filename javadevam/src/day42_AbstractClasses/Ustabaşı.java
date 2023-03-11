package day42_AbstractClasses;

public class Ustabaþý extends Ýþçi{
	
	public void statü() {
		System.out.println("bu class taki tüm personel ustabaþýdýr. imza ustabaþý");
	}
	
	public void maaþ() {
		System.out.println("ustabaþlarý aylýk 10000 tl maaþ alýr. imza: ustabaþý");
	}
	
	public void mesai() {
		System.out.println("ustabaþý arýza durumunda arýza çözümüne kadar çalýþýr . imza:ustabaþý");
	}

	//obje oluþturduðumuz en alttaki class parent class lardaki method larý
	//override edince, class dan oluþturulan objeler en doðru ve spesifik özelliklere kavuþtu
	
	//ama klasik parent-child iliþkisinde tüm method larý override etme mecburiyeti YOKTUR.
	
	//java parent class lardaki tüm metodlarý override etmek MECBURÝYETÝ kazandýrmak için
	//abstract class yapýsý oluþturmuþtur
	
	//yani bir class ý abstract olarak tanýmlarsanýz child class lar tüm metod larý override etmek zorunda kalýr
	
	//dolayýsýyla abstract yaptýðýmýz parent class lar sadece kalýp görevi yapacaklar
	public static void main(String[] args) {
	
		Ustabaþý ust1=new Ustabaþý();
		ust1.statü();
		ust1.maaþ();
		ust1.mesai();

	}

}
