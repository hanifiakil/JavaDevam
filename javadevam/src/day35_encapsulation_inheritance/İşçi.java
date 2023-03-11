package day35_encapsulation_inheritance;

public class Ýþçi extends Muhasebe{
	protected String statü;
	protected String mesleði;
	protected String sendika;
public Ýþçi(){
	System.out.println("iþçi parametresiz constructor çalýþtý");
}
	public static void main(String[] args) {
		
		Ýþçi iþçi1=new Ýþçi();
		iþçi1.mesleði="kaynakçý";
		iþçi1.saatÜcreti=20;
		iþçi1.isim="emine";
		iþçi1.maaþ=iþçi1.maaþHesaplama();
System.out.println(iþçi1.isim + " in maaþý : " +iþçi1.maaþ);

	}

}
