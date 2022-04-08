package TestPackage;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day1 {
	
	@AfterTest
	public void After()
	{
		System.out.println("After test");
	}
	
	@Test
	public void login()
	{
		System.out.println("Login Success");
	}
	
	@Test
	public void HighRisk()
	{
		System.out.println("High risk checked");
	}
	
	@AfterSuite
	public void BeforeMethod()
	{
		System.out.println("I run before every method");
		
	}
}
