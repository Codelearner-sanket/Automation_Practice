package javapackage;


/// final variable cannot be changed 
///final method cannot  be overriden 
/// final class camnot be extend 
public class Enscapsulation1 {

	String name ;
	int b;
	final int c=4 ;    // final must be initialize
	
	public void a() {
	//	c=5   we can not change the value 
	}
	
	final void d() {
		System.out.println("final method");
		
	}
	
	public void setName(String s) {
		this.name=s;
		this.b=5;
		System.out.println(b);
		System.out.println(c);
	}
	public String getName() {
		return name;
	}
	
	
}
