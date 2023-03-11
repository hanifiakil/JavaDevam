package day13_stringManipulations;

public class C02_Replace {

	public static void main(String[] args) {
		// String olarak verilen 10.000 sayýsýnýn
		//binden büyük olup olmadýðýný yazdýrýn
		
		String sonuç="10.000";
		
		sonuç=sonuç.replace(".","");//10000 e çevirip sonuç assign ettik
		                            // = olduðu için sonuç kalýcý olarak deðiþti
		
		if(Integer.valueOf(sonuç)>1000) {System.out.println("bulunan sonuç sayýsý 1000 den çok");
			
		}else {System.out.println("bulunan sonuç sayýsý 1000 den küçük");
			
		}
		

	}

}
