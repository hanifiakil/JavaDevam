package day42_AbstractClasses;

public  class AbsUstabaþý extends AbsÝþçi{
	
	//concrete bir child class parent i olan abstract class lardaki tüm abstract metod larý implement etmelidir
	//ama parent ý olan abstract class lardaki concrete method larý implement etmek zorunda deðildir

	public static void main(String[] args) {
		
		AbsUstabaþý ust1=new AbsUstabaþý();
		ust1.maaþ();
		ust1.mesai();
		ust1.statü();

	}

	@Override
	public void mesai() {
		
		System.out.println("ustabaþý arýza durumunda arýza çözümüne kadar çalýþýr . imza:ustabaþý");
	}

	@Override
	public void maaþ() {
		
		System.out.println("ustabaþlarý aylýk 10000 tl maaþ alýr. imza: ustabaþý");
	}

	@Override
	public void statü() {
		System.out.println("bu class taki tüm personel ustabaþýdýr. imza ustabaþý");
		
	}

	@Override
	public void abstractMethod() {
		// TODO Auto-generated method stub
		
	}

}
