package day30_immutable;

public class C03_DoubleEqual {

	public static void main(String[] args) {
		/*java da String iki türlü oluþturulabilir
		 * 1- non-primitive olduðu için new keyword ile
		 * java önce eþitliðin saðýna baktýðýndan
		 * new kelimesi olduðu için önce obje oluþturulur
		 * sonra deðer atar
		 * yani bu oluþturma þeklinde her zaman
		 * yeni bir obje oluþur
		 * 
		 * 2-bugüne kadar öðrendiðimiz gibi oluþturursak
		 * String str2="mustafa"
		 * java bu durumda eþitliðin saðýnda olan
		 * String in STRÝNG HAVUZU nda olup olmadýðýný
		 * kontrol eder ve havuzda varsa
		 * yeni obje oluþturmaz, öncekinin referansýna
		 * yeninin referansýný da ekler
		 */
		
		String str1="mustafa";
		String str2="mustafa";
		String str3=new String("mustafa");
		String str4 =new String("mustafa");
		
		System.out.println(str1==str3);//false
		System.out.println(str1.equals(str3));//true
		System.out.println(str4==str3);//false
		System.out.println(str4.equals(str3));//true
		
		
		System.out.println(str1==str2);//TRUE
		

	}

}
