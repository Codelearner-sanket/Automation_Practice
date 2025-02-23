package SelePrograms;

import org.testng.annotations.Test;

public class TestNG3 {
	
	// testng test cases will be executes in alphanumeric order  / dictionary order 
	
	// priority will give lowest value  
	@Test(priority=-10)
	public void a() {
		System.out.println("a method called");
	}

	@Test(priority=2)
	public void b() {
		System.out.println("b method called");
	}
	@Test(priority=0)
	public void c() {
		System.out.println("c method called");
	}
	@Test
	public void d() {
		System.out.println("d method called");
	}
}
