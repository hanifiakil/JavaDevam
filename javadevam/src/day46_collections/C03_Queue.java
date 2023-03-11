package day46_collections;

import java.util.LinkedList;
import java.util.Queue;

public class C03_Queue {

	public static void main(String[] args) {
		
		//gelen sona gelir silinen baþtan silinir FIFO
		
		Queue<String> kuyruk = new LinkedList<>();
		
		kuyruk.add("lütfullah");
		kuyruk.add("mustafa");
		kuyruk.add("rýdvan");
		
		System.out.println(kuyruk);//[lütfullah, mustafa, rýdvan]
		
		kuyruk.remove();
		
		System.out.println(kuyruk);//[mustafa, rýdvan]
		
		kuyruk.remove();
		
		System.out.println(kuyruk);//[rýdvan]

		kuyruk.add("rýdvan");
		kuyruk.add(null);
		kuyruk.add(null);
		kuyruk.add(null);
		
		System.out.println(kuyruk);//[rýdvan, rýdvan, null, null, null]
	}

}
