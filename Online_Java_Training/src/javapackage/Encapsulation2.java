package javapackage;

public class Encapsulation2  extends  Enscapsulation1{

/*	final void d() {
 * 
    System.out.println("final method")
    
 this method cannot be override     because the final method cannot override 
}*/
	
	public static void main(String[] args) {
		
		Encapsulation2 e2=new Encapsulation2();
		e2.setName("Selenium");
		System.out.println(e2.getName());

}
}
