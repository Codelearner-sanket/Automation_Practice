//6
package javapackage;

public class Constructor2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructor1 c=new Constructor1(1,"john");  // if we does not use any parameter it will give error because the constructor having parameter 
		//  default constructor is called when we execute any program 
		Constructor1 d=new Constructor1(2,"san");
		
		Constructor1 e=new Constructor1(3,"man");
		
		c.getResult();
//		System.out.println(d.getClass().getName());
		System.out.println(c.roll);

	}

}
