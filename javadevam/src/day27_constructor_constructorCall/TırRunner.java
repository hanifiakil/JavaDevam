package day27_constructor_constructorCall;

public class TýrRunner {

	public static void main(String[] args) {
		// bir tane tüm özellikleri deðiþtiren constructor oluþturalým
		
		Týr týr1=new Týr(5000,"axor","beyaz",2020,false);
		
		System.out.println(týr1.km + " " +týr1.model + " " +týr1.renk + " " +týr1.yýl + " " +týr1.satýlýkmý);
		
		
		Týr týr2=new Týr(2500,"fatih","kýrmýzý");
		
		System.out.println(týr2.km + " " +týr2.model + " " +týr2.renk + " " +týr2.yýl + " " +týr2.satýlýkmý);

	}

}
