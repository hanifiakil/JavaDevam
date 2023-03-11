package day31_dataanttime;

import java.time.LocalDateTime;

public class C03_LocalDateTime {

	public static void main(String[] args) {
		LocalDateTime tarihsaat=LocalDateTime.now();
		
		System.out.println(tarihsaat);
		
		
		System.out.println(tarihsaat.toString().startsWith("2021"));

	}

}
