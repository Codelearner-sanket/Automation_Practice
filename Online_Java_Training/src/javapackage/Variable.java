// 2 program 
package javapackage;

public class Variable {
      int s=9;     // global variable get memory allocation once the object of the class created 
    static int p=99;  // static variable get memory allocation at the time of class loading 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          String s="Hello Java";    // local variable get memory location when it is called 
          System.out.println(s);
          
          a();// when method is static we can dircetly call to the method without creating the object 
//          f();   if we are creatimg the non static class , while calling we have to create the object of the class [inside the main method ]
        System.out.println(p);        // directly access because variable is static without creation of object 
          Variable v=new Variable();  // we have to access this variable by object of class
          System.out.println(v.s);
	}
	
	// the member which is created outside of the method with static keyword is called static members 
	public static void a() {
		int e=2;
		  System.out.println(e);
		
	}
	public void b() {
		int f=2;
		  System.out.println(f);
		
	}

}
