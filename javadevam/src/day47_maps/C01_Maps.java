package day47_maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class C01_Maps {

	public static void main(String[] args) {
		//1) bir map oluþturmadan önce, map e koyacaðýmýz key ve value deðerlerini incelemeliyiz
		//tüm deðerleri koyabilmek için key ve value için object, object seçebiliriz
		//ama bu durumda map içerisindeki elemanlara ait bilgilere ulaþmakta zorlanabiliriz
		//data türünü seçerken hem içine koyacaðýmýz tüm elemanlarý kapsayacak bir data türü seçmeliyiz
		//hem de içine koyduðumuz tüm elemanlarý iþleyebilecek þekilde basit data türü seçmeliyiz
		
		//2) map i oluþtururken map in türüne de karar vermek gerekir
		
		
		Map<Integer,String> sýnýf =new HashMap<>();
		
		sýnýf.put(101,"ali, can, j.dev");
        sýnýf.put(102,"veli, yan, qa");
        sýnýf.put(103,"ali, yan, c#");
        
        int no=104;
        String isim="ayþe";
        String soyisim="can";
        String branþ="qa";
        
        sýnýf.put(no, isim+", "+soyisim+", "+branþ );
        
        System.out.println(sýnýf);
        //  {             101=ali, can, j.dev,  102=veli, yan, qa, 103=ali, yan, c#, 104=ayþe, can, qa}
		//map parantezi   key1=value1          key2=value2 
	
        //no su 102 olan öðrencinin bilgilerini görelim
        
        System.out.println(sýnýf.get(102));//veli, yan, qa
	
        // map deki tüm key leri görelim
        
        System.out.println(sýnýf.keySet());//[101, 102, 103, 104]
	
        //map deki tüm value larý görmek istersek
        
        System.out.println(sýnýf.values());
        //[ali, can, j.dev, veli, yan, qa, ali, yan, c#, ayþe, can, qa]
	    //yazdýrma iþlemi dýþýnda birþey yapamayýz
        //sýnýftaki öðrencilerin isimlerini bir listeye ekleyip yazdýralým
        
        List<String> valueList=new ArrayList<>((sýnýf.values()));
	
        System.out.println(valueList);
        //[ali, can, j.dev, veli, yan, qa, ali, yan, c#, ayþe, can, qa]
	
        System.out.println(valueList.size());//4
        
        List<String> isimListesi=new ArrayList<>();
        
        String bilgiler[]=new String[3];
        
        for (int i = 0; i < valueList.size(); i++) {
        	
        	bilgiler=valueList.get(i).split(",");
        	isimListesi.add(bilgiler[0]);
		}
        System.out.println(isimListesi);//[ali, veli, ali, ayþe]
	}

}
