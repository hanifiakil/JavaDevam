package day33_StringBuilder;

public class C04_Insert {

	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder("java ��rendik");
		
		//araya �ok iyi ekleyelim
		
		sb.insert(4,"y� �ok iyi");
		
		System.out.println(sb);
		
		//sonuna ya�as�n ekleyelim
		
		sb.insert(7,"�ok iyiyim", 0,4);
		
		System.out.println(sb);

	}

}
