package day34_accessModifier_encapsulation;

public class C02 {

	public static void main(String[] args) {
        C01 obj =new C01();
		
		//System.out.println(obj.say�private);    private variable lara kendi class � d���ndan ula��lamaz
		System.out.println(obj.say�Default);
		System.out.println(obj.say�Protected);
		System.out.println(obj.say�Public);

	}
	
	public void staticOlmayanMethod() {
        C01 obj =new C01();
		
		//System.out.println(obj.say�private);
		System.out.println(obj.say�Default);
		System.out.println(obj.say�Protected);
		System.out.println(obj.say�Public);
	}

}
