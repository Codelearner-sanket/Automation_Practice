package javapackage;

public class Accessmodifiers {
	
	static private int a =5;  // we can access within the class
	static int b = 10;     // we can access within the package 
	protected static int c =5;  // within the pacakge and outside pacakge through child class 
	public static int d =7;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		

	}

}
