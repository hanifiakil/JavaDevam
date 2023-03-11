package day46_collections;

import java.util.LinkedList;
import java.util.Queue;

public class C03_Queue {

	public static void main(String[] args) {
		
		//gelen sona gelir silinen ba�tan silinir FIFO
		
		Queue<String> kuyruk = new LinkedList<>();
		
		kuyruk.add("l�tfullah");
		kuyruk.add("mustafa");
		kuyruk.add("r�dvan");
		
		System.out.println(kuyruk);//[l�tfullah, mustafa, r�dvan]
		
		kuyruk.remove();
		
		System.out.println(kuyruk);//[mustafa, r�dvan]
		
		kuyruk.remove();
		
		System.out.println(kuyruk);//[r�dvan]

		kuyruk.add("r�dvan");
		kuyruk.add(null);
		kuyruk.add(null);
		kuyruk.add(null);
		
		System.out.println(kuyruk);//[r�dvan, r�dvan, null, null, null]
	}

}
