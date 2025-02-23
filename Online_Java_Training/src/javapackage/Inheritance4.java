
//29
package javapackage;

public class Inheritance4 extends Inheritance3{

	public  void multiply(int x, int y ) {
		z=x*y;
		System.out.println(z);
		
	}
	
	public static void main(String[] args ) {
		int x =20 ; 
		int y=10 ;
		
		Inheritance4 i4 = new Inheritance4();
		i4.add(x, y);
		i4.subtract(5,y);
		i4.subtract(5,4);
		i4.multiply(4,6);
	}

}
