package SelePrograms;

import org.testng.annotations.*;
import org.testng.annotations.Test;

public class TestNG1 {
	
	/*
	 * TestNG :- Test Next Generation
	 * # it is a testing framework . It ia advance version of Junit
	 * In TestNG , we have multiple annotatons as below :
	 * 
	 * M-Method - @BeforeMethod,@AfterMethod
	 * C- Class - @BefoerClass , @AfterClass
	 * G-Group - @BeforeGroup , @AfterGroup
	 * S-Suite - @BeforeSuite , @AfterSuite
	 * T-Test - @BeforeTest , @AfterTest
	 * 
	 * Why TestNG ?
	 * #it reduce the dependecny of java main method 
	 * 
	 * # Java main method is required for program execution . but by the help of TestNG annotations you can run the program 
	 * 
	 * @Test - This annotation will be treated as test cases 
	 * 
	 * Execution sequence of testng annotation
	 * 
	 * S -Suite - @BeforeSuite
	 * T -Test  -@BeforeTest
	 * C- Class -@BeforeClass
	 * M- Method - @BeforeMethod 
	 * @Test  // double asle ki loop madhe after nanter before 
	 * @AfterMethod
	 * @AfterClass
	 * @AfterTest
	 * @AfterSuite
	 * 
	 *
	 */
	
	@Test
	public void a2() {
		System.out.println("Hello a2 test method");
	}
	
	@BeforeTest
	public void b() {
		System.out.println("Hello b Method ");
	}
	
	@BeforeSuite
	public void c() {
		System.out.println("Hello c method");
	}
	
	@AfterMethod
	public void d() {
		System.out.println("Hello d method");
	}
	
	@BeforeClass
	public void e() {
		System.out.println("Hello e method ");
	}
	
	@AfterTest
	public void f() {
		System.out.println("Hello f method");
	}
	
	@AfterClass
	public void g() {
		System.out.println("hello g method");
	}
	
	@BeforeMethod
	public void h() {
		System.out.println("Hello h method ");
	}

	@AfterSuite
	public void i() {
		System.out.println("hello i method");
	}
	@Test
	public void A1() {
		System.out.println("Hello A1 test method");
	}
	@Test
	public void a1() {
		System.out.println("Hello a1 test method");
	}
}
