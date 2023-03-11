package day33_StringBuilder;

public class C04_Insert {

	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder("java öðrendik");
		
		//araya çok iyi ekleyelim
		
		sb.insert(4,"yý çok iyi");
		
		System.out.println(sb);
		
		//sonuna yaþasýn ekleyelim
		
		sb.insert(7,"çok iyiyim", 0,4);
		
		System.out.println(sb);

	}

}
