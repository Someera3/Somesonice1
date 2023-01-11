package TestPackage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class BasicTest {
	
	
	// each test case will be a method
	// we dont need to call the method
	// give detailed report - no sequence but we can set priority!
	
	@Test 
	public void Demo()
	{
		//System.out.println("hello");
		Assert.assertTrue(false);
		
	}
	@Test
	public void getData()
	{
	//System.out.println("Testing");
		Assert.assertTrue(false);
		System.out.println("Testing1234");
	}
	
}

