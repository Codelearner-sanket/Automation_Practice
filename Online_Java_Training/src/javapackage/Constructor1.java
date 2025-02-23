//5
package javapackage;

public class Constructor1 {
	
	int roll ;
	String name ;
	static String college= "IIT Bombay";//static variable 
    
	// constructor
	
	Constructor1(int r , String n){
		roll =r;
		name =n ;		
	}
	public void getResult() {
		System.out.println(roll + " "+ name + " "+ college );
		
	}
// object id created in main method so , main method is in next class 
}
