package javapackage;

public abstract class Abstraction1 {

		/* It is process of hiding the data and showing the funcatioanlity 
		 * Abstract keyword we use for abstraction 
		 * abstract method will not have body 
		 * Abstarct class can have abstract and non abstract method 
		 */
    
	static int a = 5;  // static varible
	final int c= 10;  // final variable 
	int b=5;            // global variable 
	
	// abstract method 
	abstract void eat();  // abstract method doesnot have body 
	
	public void a() {
		System.out.println("Non abstract method ");
	}
	
}
