package day21_scope_arrays;

public class C03_Arrays {

	public static void main(String[] args) {
		//elemanlarý "ali" , "veli", "ayþe" ve "fatma" olan bir array oluþturun
		
		String arr[]=new String[4];
		arr[0]="ali";
		arr[1]="veli";
		arr[2]="ayþe";
		arr[3]="fatma";
		
		//yada
		
		String arr2[]= {"ali","veli","ayþe","fatma"};
		
		//bir önceki sorudaki elemanlardan "ali" yerine "can" , "ayþe" yerine "gül" atayýn

		arr2[0]="can";
		arr2[2]="gül";
		System.out.println(arr[1]);//veli
		//son elementi yazdýrýn
		System.out.println(arr[arr.length-1]);//fatma
	}

}
