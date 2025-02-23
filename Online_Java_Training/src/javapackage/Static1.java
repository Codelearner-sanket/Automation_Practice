//7

package javapackage;

public class Static1 {
	
	static int z=5; // static variable 
	int y=1;   // global varible 
	
	// static method 
	public static void a() {
		z=10;
		System.out.println(z);
		
	}
	// Non - static method 
	public void b() {
		z=15;
		System.out.println(z);
		a();
	}
	public static void main(String[] args) {
		System.out.println(z);
         a();
         
         Static1 s1=  new  Static1();
         s1.b();
      
	}

}
