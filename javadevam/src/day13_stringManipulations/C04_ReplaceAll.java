package day13_stringManipulations;

public class C04_ReplaceAll {
	public static void main(String[] args) {
		
		String str="*java 98ogrenmek c..ok k876olay";
		
		//replaceAll methotlar� kullanarak java ��renmek �ok kolay elde edelim.
		
		str=str.replaceAll("\\d","");//\\d c�mledeki t�m say�lar� siler  *java ogrenmek c..ok kolay
			
		str=str.replaceAll("\\s","x");//\\s c�mledeki space leri de�i�tirir.*javaxogrenmekxc..okxkolay
			
		str=str.replaceAll("\\W","");//\\W wort d���ndaki karakterleri atar 
		//k���k w ise de wort yani yaz�lar� atar. javaxogrenmekxcokxkolay
		
		str=str.replace("x"," ");// x ile space leri de�i�tirir.java ogrenmek cok kolay
		
		System.out.println(str);//farkl� kullan�m �ekillerini de internetten bulabiliriz

}
}
