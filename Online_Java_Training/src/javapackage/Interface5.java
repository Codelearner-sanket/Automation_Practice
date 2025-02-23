package javapackage;

public class Interface5 extends Inheritance1 implements Interface3,Interface4{
	// we can create a class where it inherit one class implements 2 interface 
	
public static void main(String[] args ) {
	Interface5 i5=new Interface5();
	i5.a();
	i5.b();
	System.out.println(i5.roll);
		
}

public void b() {
	// TODO Auto-generated method stub
	System.out.println("b method");
	
}

public void a() {
	// TODO Auto-generated method stub
	System.out.println("a method");
	
}
}
