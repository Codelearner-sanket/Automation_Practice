package javapackage;

public class Abstraction2 extends Abstraction1{

	public static void main(String[] args) {
		
		Abstraction2 ab2=new Abstraction2();
		ab2.eat();
		ab2.a();
		
		
	}
// unimplemented method 
//	@Override
	void eat() {
		System.out.println("Please eat");
	}
    

}
