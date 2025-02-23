
//10

package javapackage;

public class Operators2 {

	public static void main(String[] args) {
		int a= 10; //Local variable 
		int b= 10;// local variable

		
		System.out.println(a++);  //10,11
		System.out.println(a++  +  ++a); // 11, 12    +  13 , 13 = 24 (first element addition )
		System.out.println(b++  +  b--);  //  10,11   +  11, 10  = 21 
		System.out.println(b++  +  b--);  // 10,11  + 11, 10 =21 
		System.out.println(b);    // 10 
		}

}
