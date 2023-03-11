package day31_dataanttime;

import java.time.LocalDate;
import java.time.Month;

public class C01_localDate {

	public static void main(String[] args) {

		LocalDate tarih= LocalDate.now();
	System.out.println(tarih);	//2022-06-13 �imdiki tarih i verir bize
	
	System.out.println(tarih.getDayOfYear());//y�l�n ka��nc� g�n� 164
	System.out.println(tarih.getDayOfMonth());//ay�n ka��nc� g�n� 13
	System.out.println(tarih.getDayOfWeek());//hangi g�n oldu�u g�n�n ad� yani  monday
	System.out.println(tarih.getMonthValue());//ka��nc� ay   6
	System.out.println(tarih.getMonth());//hangi ay     june
	
	
	System.out.println(tarih.plusDays(35));  //g�n sonra ki tarih       2022-07-18
	System.out.println(tarih.plusMonths(5));  //ay sonra ki tarih       2022-11-13
	System.out.println(tarih.plusWeeks(15));  //hafta sonra ki tarih    2022-09-26   
	
	System.out.println(tarih.plusYears(10).plusMonths(10).plusDays(1)); 
	//10 y�l 10 ay 1 g�n sonraki tarih                2033-04-14
	
	System.out.println(tarih.minusDays(15)); //g�n �nceki tarih         2022-05-29
	
	LocalDate do�umtarihi1=LocalDate.of(1990,Month.OCTOBER,1);
	LocalDate do�umtarihi2=LocalDate.ofYearDay(1985,120);
	LocalDate do�umtarihi3=LocalDate.of(2000, 1, 10);
	
	System.out.println(do�umtarihi1.isAfter(do�umtarihi2));//1 2 de �nce mi true
	System.out.println(do�umtarihi2.isBefore(do�umtarihi3));//2 3 ten sonra m�  true
	}

}
