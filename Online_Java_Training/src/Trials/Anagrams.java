package Trials;

import java.util.Arrays;

public class Anagrams {

	public static void main(String[] args) {
		
		String s1="BAT";
		String s2="TAB";
		
		char c1[]=s1.toCharArray();
		char c2[]=s2.toCharArray();
		
		System.out.println(Arrays.toString(c1));
		System.out.println(Arrays.toString(c2));
		
		Arrays.sort(c1);
		Arrays.sort(c2);
		
		System.out.println(Arrays.toString(c1));
		System.out.println(Arrays.toString(c2));
		
		boolean b = Arrays.equals(c1, c2);
		if(b==true) {
			System.out.println("these are anagrams");
		}
		else {
			System.out.println("not anagrms ");
		}
		

	}

}
