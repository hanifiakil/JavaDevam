package day31_dataanttime;

import java.time.LocalDate;
import java.time.Month;

public class C01_localDate {

	public static void main(String[] args) {

		LocalDate tarih= LocalDate.now();
	System.out.println(tarih);	//2022-06-13 þimdiki tarih i verir bize
	
	System.out.println(tarih.getDayOfYear());//yýlýn kaçýncý günü 164
	System.out.println(tarih.getDayOfMonth());//ayýn kaçýncý günü 13
	System.out.println(tarih.getDayOfWeek());//hangi gün olduðu günün adý yani  monday
	System.out.println(tarih.getMonthValue());//kaçýncý ay   6
	System.out.println(tarih.getMonth());//hangi ay     june
	
	
	System.out.println(tarih.plusDays(35));  //gün sonra ki tarih       2022-07-18
	System.out.println(tarih.plusMonths(5));  //ay sonra ki tarih       2022-11-13
	System.out.println(tarih.plusWeeks(15));  //hafta sonra ki tarih    2022-09-26   
	
	System.out.println(tarih.plusYears(10).plusMonths(10).plusDays(1)); 
	//10 yýl 10 ay 1 gün sonraki tarih                2033-04-14
	
	System.out.println(tarih.minusDays(15)); //gün önceki tarih         2022-05-29
	
	LocalDate doðumtarihi1=LocalDate.of(1990,Month.OCTOBER,1);
	LocalDate doðumtarihi2=LocalDate.ofYearDay(1985,120);
	LocalDate doðumtarihi3=LocalDate.of(2000, 1, 10);
	
	System.out.println(doðumtarihi1.isAfter(doðumtarihi2));//1 2 de önce mi true
	System.out.println(doðumtarihi2.isBefore(doðumtarihi3));//2 3 ten sonra mý  true
	}

}
