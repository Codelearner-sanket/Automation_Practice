//11

package javapackage;

public class Operators3 {

	public static void main(String[] args) {
		int a= 10; //Local variable 
		int b= 10;// local variable

		
		System.out.println(a++);  //10,11
		System.out.println(a++  +  ++a); // 11, 12    +  13 , 13 = 24 (first element addition )
		System.out.println(b++  +  ++b); // 10,11  + 12,12  = 22 (first element addition)
		System.out.println(b++  +  b++); //12,13 + 13 , 14 =25 (first element addition)
		System.out.println(b);//14
		System.out.println(a++  +  b++); // 13,14 + 14, 15 =27
		
}
}
