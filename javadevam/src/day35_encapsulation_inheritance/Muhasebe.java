package day35_encapsulation_inheritance;

public class Muhasebe extends Personel{
	protected int saat�creti;
	protected String stat�;
	protected int maa�;
	
	public Muhasebe(){System.out.println("muhasebe parametresiz constructor �al��t�");}

	public static void main(String[] args) {
		
		Muhasebe �al��an1=new Muhasebe();
		�al��an1.isim="ali";
		System.out.println(�al��an1.soyisim);//null
		
		

	}
	
	public int maa�Hesaplama() {
		
		int maa�= 8*25*saat�creti;
		
		return maa�;
	}

}
