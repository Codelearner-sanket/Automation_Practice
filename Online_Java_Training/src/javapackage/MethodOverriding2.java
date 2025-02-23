package javapackage;

public class MethodOverriding2 extends MethodOverride1 {
	
	public void eat() {
		System.out.println("you are eating ");
	}

	
	public static void main(String[] args) {
		MethodOverriding2 mo2=new MethodOverriding2();
		mo2.eat(); // it prints child classs method
		
		MethodOverride1  mo3=new MethodOverride1();
		mo3.eat();   // to call parents class meyhod 
		
		//  parent_ reference = new child_ class() object 
		// object child create kelay ,, we have pass the refrence of the parent class and we have created the child vlass object 
		// then we cant access the child class method  // dynamic method dispatch in java 
	}
}
