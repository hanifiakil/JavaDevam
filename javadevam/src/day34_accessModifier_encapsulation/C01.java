package day34_accessModifier_encapsulation;

public class C01 {
	
	private int sayıprivate=10;
	int sayıDefault=20;
	protected int sayıProtected=30;
	public int sayıPublic=40;

	public static void main(String[] args) {
		
		C01 obj =new C01();
		
		System.out.println(obj.sayıprivate);
		System.out.println(obj.sayıDefault);
		System.out.println(obj.sayıProtected);
		System.out.println(obj.sayıPublic);
		
	}
		
		public void staticOlmayanMethod() {
			
			C01 obj =new C01();
			
			System.out.println(obj.sayıprivate);
			System.out.println(obj.sayıDefault);
			System.out.println(obj.sayıProtected);
			System.out.println(obj.sayıPublic);
		

	}
		

}
