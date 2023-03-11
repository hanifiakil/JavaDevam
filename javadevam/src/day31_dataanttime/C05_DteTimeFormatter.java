package day31_dataanttime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class C05_DteTimeFormatter {

	public static void main(String[] args) {
		LocalDateTime tarihsaat=LocalDateTime.now();
		
		//eðer tarih veya saat i kendi istediðiöiz biçimde yazdýrmak istersek
		//gün / ay / yýl   saat:dakika
		
		DateTimeFormatter düzenle=DateTimeFormatter.ofPattern("dd / MM / YYYY EEE HH : mm");
		
		
		System.out.println(düzenle.format(tarihsaat));  //13 / 06 / 2022 Pzt 14 : 24
/*FORMAT OLUÞTURURKEN 
 * GÜN
 * d:baþta 0 varsa onu yazmadan gün numarasý
 * dd: tek haneli günleri 01 gibi baþýna sýfýr yazarak gün numarasý
 * DDD : yýlýn kaçýncý günü olduðunu yazar
 * E,EE,EEE : gün isminin ilk üç harfini 
 * EEEE : gün isminin tamamýný
 * 
 * AY(ay için M , dakika için m kullanýlýr)
 * M : baþta 0 varsa onu yazmadan ay numarasýný
 * MM :dd : TEK HANELÝ AYLARI 01 GÝBÝ BAÞINA SIFIR YAZARAK AY NUMARASI
 * MMM : ay isminin ilk üç harfi
 * MMMM: ay isminin tamamý
 * 
 * YIL:
 * YY : yýlýn son 2 rakamý
 * YYYY:yýlýn tamamýný
 * 
 * SAAT:(24 saat üzerinden istiyorsak H, 12 saat üzerinden istiyorsak h)
 * HH : saat in tamamý
 * H   : tek rakamlý saat olursa sadece saati
 * a yazarsak AM veya PM deðeri yazar
 * 
 */
	}

}
