package TestPackage;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day2 {
	
	@Test
	public void login()
	{
		System.out.println("Day 2 Login Success");
	}
	
	@Test
	public void HighRisk()
	{
		System.out.println("Day 2 High risk checked");
	}
	
	@BeforeTest
	public void before()
	{
		System.out.println("Before");
	}
}
