
// 13 
package javapackage;

public class Operators5 {

	public static void main(String[] args) {
		int a =12;
		int b=13;
		int c=10;
		// Logical Operator - if first condition false , 2nd condition will not check 
		
		System.out.println(a<b && a<c);  
		
		// Bitwise Operator  - will check both conditions 
		
		System.out.println(a<b & a<c);    // only true & true becomes true   ,,,,otherwise false 
	}

}
