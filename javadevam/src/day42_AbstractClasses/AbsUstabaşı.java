package day42_AbstractClasses;

public  class AbsUstaba�� extends Abs���i{
	
	//concrete bir child class parent i olan abstract class lardaki t�m abstract metod lar� implement etmelidir
	//ama parent � olan abstract class lardaki concrete method lar� implement etmek zorunda de�ildir

	public static void main(String[] args) {
		
		AbsUstaba�� ust1=new AbsUstaba��();
		ust1.maa�();
		ust1.mesai();
		ust1.stat�();

	}

	@Override
	public void mesai() {
		
		System.out.println("ustaba�� ar�za durumunda ar�za ��z�m�ne kadar �al���r . imza:ustaba��");
	}

	@Override
	public void maa�() {
		
		System.out.println("ustaba�lar� ayl�k 10000 tl maa� al�r. imza: ustaba��");
	}

	@Override
	public void stat�() {
		System.out.println("bu class taki t�m personel ustaba��d�r. imza ustaba��");
		
	}

	@Override
	public void abstractMethod() {
		// TODO Auto-generated method stub
		
	}

}
