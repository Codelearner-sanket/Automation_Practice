//21
package javapackage;

public class Array1 {

	public static void main(String[] args) {
	     // Declaring an array 
		int a[]= new int[5];
	
		System.out.println(a.length);
		
		for(int i:a) {
			System.out.println(i);
		}
		
//		for(int i =0 ; i<a.length;i++) {
//			System.out.println(a[i]);
//		}
		
		// asigning value to an array 
		
		a[0]=65;
		a[1]=67;
		a[2]=99;
		a[3]=86;
		a[4]=62;
		
		for(int i:a) {
			System.out.println(i);
		}
		
		a[4]=77;  // modifying the value  using index 
		System.out.println(a[4]);
	}
	

}
