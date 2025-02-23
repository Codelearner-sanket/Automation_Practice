package SelePrograms;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class TestNG4 {
	
	// skip the test case 
	//@Test                           // commenting the test case we can skip 
	public void a() {
		System.out.println("a method called");
	}

	@Test(enabled=false)               /// skip the test case 
	public void b() {
		System.out.println("b method called");
	}
	@Test
	public void c() {
		System.out.println("c method called");
	}
	@Test(invocationCount=2)          // to run multiple time we use invocationCount 
	public void d() {
		System.out.println("d method called");
	}
	@Test(invocationCount=0)          // to run multiple time we use invocationCount=0  skip the test case  
	public void e() {
		System.out.println("d method called");
	}
	
	//conditional skippinhg 
	@Test
	public void f() {
		System.out.println("f test method");
		throw new  SkipException("Skipping f test exception");
	}
	
	@Test(invocationCount=2,priority=-1,enabled=false&true)
	public void g() {
		System.out.println("c method called");
	}
}

