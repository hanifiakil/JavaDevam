package day47_maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class C01_Maps {

	public static void main(String[] args) {
		//1) bir map olu�turmadan �nce, map e koyaca��m�z key ve value de�erlerini incelemeliyiz
		//t�m de�erleri koyabilmek i�in key ve value i�in object, object se�ebiliriz
		//ama bu durumda map i�erisindeki elemanlara ait bilgilere ula�makta zorlanabiliriz
		//data t�r�n� se�erken hem i�ine koyaca��m�z t�m elemanlar� kapsayacak bir data t�r� se�meliyiz
		//hem de i�ine koydu�umuz t�m elemanlar� i�leyebilecek �ekilde basit data t�r� se�meliyiz
		
		//2) map i olu�tururken map in t�r�ne de karar vermek gerekir
		
		
		Map<Integer,String> s�n�f =new HashMap<>();
		
		s�n�f.put(101,"ali, can, j.dev");
        s�n�f.put(102,"veli, yan, qa");
        s�n�f.put(103,"ali, yan, c#");
        
        int no=104;
        String isim="ay�e";
        String soyisim="can";
        String bran�="qa";
        
        s�n�f.put(no, isim+", "+soyisim+", "+bran� );
        
        System.out.println(s�n�f);
        //  {             101=ali, can, j.dev,  102=veli, yan, qa, 103=ali, yan, c#, 104=ay�e, can, qa}
		//map parantezi   key1=value1          key2=value2 
	
        //no su 102 olan ��rencinin bilgilerini g�relim
        
        System.out.println(s�n�f.get(102));//veli, yan, qa
	
        // map deki t�m key leri g�relim
        
        System.out.println(s�n�f.keySet());//[101, 102, 103, 104]
	
        //map deki t�m value lar� g�rmek istersek
        
        System.out.println(s�n�f.values());
        //[ali, can, j.dev, veli, yan, qa, ali, yan, c#, ay�e, can, qa]
	    //yazd�rma i�lemi d���nda bir�ey yapamay�z
        //s�n�ftaki ��rencilerin isimlerini bir listeye ekleyip yazd�ral�m
        
        List<String> valueList=new ArrayList<>((s�n�f.values()));
	
        System.out.println(valueList);
        //[ali, can, j.dev, veli, yan, qa, ali, yan, c#, ay�e, can, qa]
	
        System.out.println(valueList.size());//4
        
        List<String> isimListesi=new ArrayList<>();
        
        String bilgiler[]=new String[3];
        
        for (int i = 0; i < valueList.size(); i++) {
        	
        	bilgiler=valueList.get(i).split(",");
        	isimListesi.add(bilgiler[0]);
		}
        System.out.println(isimListesi);//[ali, veli, ali, ay�e]
	}

}
