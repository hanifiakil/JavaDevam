package day34_accessModifier_encapsulation;

public class C04 {

	public static void main(String[] args) {
		C03 obj=new C03();
		
		System.out.println(obj.isim);//ali
		System.out.println(obj.maa�);//1000
		
		obj.isim="veli cemmm";
		obj.maa�=15000;
		
		System.out.println(obj.isim);//veli cemmm
		System.out.println(obj.maa�);//15000

	}

}
