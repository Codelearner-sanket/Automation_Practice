package SelePrograms;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG5 {
	
	@Test
	public void z() {
		Assert.assertTrue(3<12);
		System.out.println("z test method");
	}

	@Test 
	public void a() {
		Assert.assertTrue(3<12 & 4>5);
		System.out.println("a test method");
	}
	@Test(dependsOnMethods= {"z","a"})
	public void b() {
		System.out.println("b method ");
	}
}
