package day28_constructor_constructorCall;

public class C02 {
	
	int x=3;// her obje de yeniden ba�lar ba�a d�ner
	
	static int y=5;// static te farkl� objelere ge�se dahi yap�lan de�i�iklikler kal�c� olur class i�in

	public static void main(String[] args) {
		// 
		
		C02 obje1=new C02();
		System.out.println("obje1 in x de�eri : " + obje1.x + " obje1 in y de�eri : " + y);

		obje1.x++;
		y++;
		
		System.out.println("i�lem sonras� obje1 in x de�eri : " 
		+ obje1.x + " i�lem sonras� obje1 in y de�eri : " + y);
		
		C02 obje2=new C02();
		obje2.x++;
		y++;
		
		System.out.println("obje2 in x de�eri : " + obje2.x + " obje2 in y de�eri : " + y);

		

	}

}
