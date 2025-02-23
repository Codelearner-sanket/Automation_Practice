
//20 
package javapackage;

public class Break4 {

	public static void main(String[] args) {

		
		int i = 1;// local variable
		
		do {
			if(i==3) {
				break;
			}
			System.out.println(i);
			i++;
		}while(i<5);

	}

}
