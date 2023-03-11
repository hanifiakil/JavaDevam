package day28_constructor_constructorCall;

public class C02 {
	
	int x=3;// her obje de yeniden baþlar baþa döner
	
	static int y=5;// static te farklý objelere geçse dahi yapýlan deðiþiklikler kalýcý olur class için

	public static void main(String[] args) {
		// 
		
		C02 obje1=new C02();
		System.out.println("obje1 in x deðeri : " + obje1.x + " obje1 in y deðeri : " + y);

		obje1.x++;
		y++;
		
		System.out.println("iþlem sonrasý obje1 in x deðeri : " 
		+ obje1.x + " iþlem sonrasý obje1 in y deðeri : " + y);
		
		C02 obje2=new C02();
		obje2.x++;
		y++;
		
		System.out.println("obje2 in x deðeri : " + obje2.x + " obje2 in y deðeri : " + y);

		

	}

}
