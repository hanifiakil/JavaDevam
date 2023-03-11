package day34_accessModifier_encapsulation;

public class C02 {

	public static void main(String[] args) {
        C01 obj =new C01();
		
		//System.out.println(obj.sayıprivate);    private variable lara kendi class ı dışından ulaşılamaz
		System.out.println(obj.sayıDefault);
		System.out.println(obj.sayıProtected);
		System.out.println(obj.sayıPublic);

	}
	
	public void staticOlmayanMethod() {
        C01 obj =new C01();
		
		//System.out.println(obj.sayıprivate);
		System.out.println(obj.sayıDefault);
		System.out.println(obj.sayıProtected);
		System.out.println(obj.sayıPublic);
	}

}
