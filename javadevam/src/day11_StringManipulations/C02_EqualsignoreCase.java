package day11_StringManipulations;

public class C02_EqualsignoreCase {
	
	public static void main(String[] args) {
	String str1="ali";
	String str2="can";
	String str3="Ali Can";
	String str4=str1 + " " + str2;
	
	System.out.println(str3==str4); //false yazar 
	
	System.out.println(str3.equals(str4));//b�y�k k���k harf farkl�l��� oldugu i�in false yazar
	

	System.out.println(str3.equalsIgnoreCase(str4));// burada ise b�y�k k���k harf ayr�m� yapmaz

}
}