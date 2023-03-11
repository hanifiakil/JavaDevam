package day35_encapsulation_inheritance;

public class Muhasebe extends Personel{
	protected int saatÜcreti;
	protected String statü;
	protected int maaş;
	
	public Muhasebe(){System.out.println("muhasebe parametresiz constructor çalıştı");}

	public static void main(String[] args) {
		
		Muhasebe çalışan1=new Muhasebe();
		çalışan1.isim="ali";
		System.out.println(çalışan1.soyisim);//null
		
		

	}
	
	public int maaşHesaplama() {
		
		int maaş= 8*25*saatÜcreti;
		
		return maaş;
	}

}
