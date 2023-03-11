package day14_methodCreation;

public class C01_methodCreation {

	public static void main(String[] args) {
	//verilen iki sayýnýn toplamýný ve çarpýmýný yapýp yazdýran iki ayrý method oluþturun
		
	//method oluþturmak için 4 adým takip edelim,
	//1. adým method call yazalým
	//2. adým method a arguman yazacak mýyýz karar vermeliyiz
		
	int sayý1=4;
	int sayý2=5;
	
	toplama(sayý1,sayý2);//method call
	//3. adým 1 ve 2. adýmý yaptýktan sonra java dan yardým alýp method u oluþtururuz
	
	çarpma(sayý1,sayý2);

	
	}

	public static void çarpma(int sayý1, int sayý2) {
	
		
		System.out.println("sayýlarýn çarpýmý : " + (sayý1*sayý2));
		
	}

	public static void toplama(int sayý1, int sayý2) {
		// 4. adým eriþim düzenleyici ve return type a karar vermeliyiz
		//eriþim düzenleyici axcess modifier : public yaptýk
		//return type : bizden sadece yazdýrma istediði için void kalabilir
		
		System.out.println("sayýlarýn toplamý : " + (sayý1+sayý2));
		
	}

}
