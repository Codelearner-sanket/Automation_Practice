//18
package javapackage;

public class Break2 {
	
	public static void main(String[] args) {
		// outer loop
		for(int i=1;i<3;i++) {
			// inner loop
			for(int j=1;j<3;j++) {
				// condition 
				if(i==2 && j==2) {
					break;
				}
				System.out.println(i + " "+ j);
			}
		System.out.println("come out of inner loop");
		}
		System.out.println("Came out of outer loop");
	}

}
