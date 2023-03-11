package day31_dataanttime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class C05_DteTimeFormatter {

	public static void main(String[] args) {
		LocalDateTime tarihsaat=LocalDateTime.now();
		
		//e�er tarih veya saat i kendi istedi�i�iz bi�imde yazd�rmak istersek
		//g�n / ay / y�l   saat:dakika
		
		DateTimeFormatter d�zenle=DateTimeFormatter.ofPattern("dd / MM / YYYY EEE HH : mm");
		
		
		System.out.println(d�zenle.format(tarihsaat));  //13 / 06 / 2022 Pzt 14 : 24
/*FORMAT OLU�TURURKEN 
 * G�N
 * d:ba�ta 0 varsa onu yazmadan g�n numaras�
 * dd: tek haneli g�nleri 01 gibi ba��na s�f�r yazarak g�n numaras�
 * DDD : y�l�n ka��nc� g�n� oldu�unu yazar
 * E,EE,EEE : g�n isminin ilk �� harfini 
 * EEEE : g�n isminin tamam�n�
 * 
 * AY(ay i�in M , dakika i�in m kullan�l�r)
 * M : ba�ta 0 varsa onu yazmadan ay numaras�n�
 * MM :dd : TEK HANEL� AYLARI 01 G�B� BA�INA SIFIR YAZARAK AY NUMARASI
 * MMM : ay isminin ilk �� harfi
 * MMMM: ay isminin tamam�
 * 
 * YIL:
 * YY : y�l�n son 2 rakam�
 * YYYY:y�l�n tamam�n�
 * 
 * SAAT:(24 saat �zerinden istiyorsak H, 12 saat �zerinden istiyorsak h)
 * HH : saat in tamam�
 * H   : tek rakaml� saat olursa sadece saati
 * a yazarsak AM veya PM de�eri yazar
 * 
 */
	}

}
