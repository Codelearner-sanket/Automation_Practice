
// 22
package javapackage;

public class Array2 {
	
	static int c[]= {22,2,44,5};

	public static void main(String[] args) {
		
	int b =c[0];  //22  
//	System.out.println(b);
	
//	for (int i =0; i<c.length ; i++) {
//		if (b>=c[i]) {
//			System.out.println(b);
//		}
//		else {
//			System.out.println("ABCD");
//		}
//	}

  for (int i : c) {
	  if(b>=i) {
		  System.out.println(b);
	  }
	  else {
		  System.out.println("ABCD");
	  }
  }

	}

}
