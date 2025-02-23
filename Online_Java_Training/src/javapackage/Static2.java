//8

package javapackage;

public class Static2 {

	int x =10;
	static int y=5;
	
	
	public void a(){
		int z =10 ;
		System.out.println(z);
	}
	static int b=6;
	
	public static void b() {
		int a =5;
		System.out.println(a);
	}
	
	
	public static void main(String[] args) {
		Static2 s1=new Static2();
		s1.a();
		
		System.out.print(Static2.b);   // directly access through class name 2nd approach is is the 
		// if we want to access in different class then use this approach 

	}

}
