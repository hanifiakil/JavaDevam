package day34_accessModifier_encapsulation;

public class C01 {
	
	private int say�private=10;
	int say�Default=20;
	protected int say�Protected=30;
	public int say�Public=40;

	public static void main(String[] args) {
		
		C01 obj =new C01();
		
		System.out.println(obj.say�private);
		System.out.println(obj.say�Default);
		System.out.println(obj.say�Protected);
		System.out.println(obj.say�Public);
		
	}
		
		public void staticOlmayanMethod() {
			
			C01 obj =new C01();
			
			System.out.println(obj.say�private);
			System.out.println(obj.say�Default);
			System.out.println(obj.say�Protected);
			System.out.println(obj.say�Public);
		

	}
		

}
