///23 

package javapackage;

import java.util.*;

public class Array3 {

	public static void main(String[] args) {
		// defining multi - dimensional array 
		int a[][]= {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
		
		// Total number of rows 
		
		System.out.println(a[0]); // it wil print Hashcode 
		 System.out.println("First row: " + Arrays.toString(a[0]));
		
		int row =a.length;// length is property of an array 
		System.out.println(row);
		
		int column = a[0].length;
		System.out.println(column);
		
		for(int i =0 ; i<row;i++) {
			for(int j =0;j<column;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}

}
}