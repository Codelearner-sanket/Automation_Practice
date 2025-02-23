package javapackage;

import java.util.HashMap;
import java.util.Hashtable;

public class HashTable{

	public static void main(String[] args) {
		
		
		Hashtable<Integer,String> hm=new Hashtable<Integer,String>();
		
		hm.put(1,"Jan");
		hm.put(2,"Feb");
	    hm.put(5,"Mar");
	System.out.println(hm.get(1));
	System.out.println(hm.get(2));
	System.out.println(hm.get(3));
	
	System.out.println(hm); // all values with key  // it is synchronized// it goes botttom to top 
	
	
		
	}
	
}
