package day40;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C06_ParentChildException {

	public static void main(String[] args) {

		try {
			FileInputStream fis=new FileInputStream("src\\day40\\yazý.txd");
			int k=0;
			
				while((k=fis.read())!=-1) {
					System.out.print((char)k);
				}
			
			
		} catch (IOException e) {//FileNotFoundException e yeterli olmadýðý için geniþletildi
			
			e.printStackTrace();
		}
		System.out.println("");
System.out.println("görev tamamlandý");
	}

}
