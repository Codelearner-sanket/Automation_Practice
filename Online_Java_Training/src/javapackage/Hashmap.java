package javapackage;

import java.util.HashMap;

public class Hashmap{

	public static void main(String[] args) {
		// n=both are used for data  mapping   1-jan , 2-feb , 3 -mar 
		
		// will use put() method to set data and get() method to get data 
		
		// Hashmap is non synchronized (faster)
		// hashtable is synchronized (slower)
		
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		
		hm.put(1,"Jan");
		hm.put(2,"Feb");
	hm.put(5,"Mar");
	System.out.println(hm.get(1));
	System.out.println(hm.get(2));
	System.out.println(hm.get(3));
	
	System.out.println(hm);
	
		
	}
	
}
