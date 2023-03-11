package day13_stringManipulations;

public class C04_ReplaceAll {
	public static void main(String[] args) {
		
		String str="*java 98ogrenmek c..ok k876olay";
		
		//replaceAll methotlarý kullanarak java öðrenmek çok kolay elde edelim.
		
		str=str.replaceAll("\\d","");//\\d cümledeki tüm sayýlarý siler  *java ogrenmek c..ok kolay
			
		str=str.replaceAll("\\s","x");//\\s cümledeki space leri deðiþtirir.*javaxogrenmekxc..okxkolay
			
		str=str.replaceAll("\\W","");//\\W wort dýþýndaki karakterleri atar 
		//küçük w ise de wort yani yazýlarý atar. javaxogrenmekxcokxkolay
		
		str=str.replace("x"," ");// x ile space leri deðiþtirir.java ogrenmek cok kolay
		
		System.out.println(str);//farklý kullaným þekillerini de internetten bulabiliriz

}
}
