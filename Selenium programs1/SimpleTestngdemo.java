package simpleprograms;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SimpleTestngdemo {

	@AfterSuite
	public void aftersuite()
	{
		System.out.println("After suite");
	}
	@AfterTest
	public void aftertest()
	{
		System.out.println("after test");
	}
	@AfterClass
	public void afterclass()
	{
	System.out.println("after class");	
	}
	@AfterMethod
	public void aftermethod()
	{
		System.out.println("after method");
	}
	@Test
	public void add()
	{
		System.out.println("addition");
	}
	@Test
	public void sub()
	{
		System.out.println("subtraction");
	}
	@BeforeSuite
	public void beforesuite()
	{
		System.out.println("Before suite");
	}
	@BeforeTest
	public void beforetest()
	{
		System.out.println("before test");
	}
	@BeforeClass
	public void beforeclass()
	{
	System.out.println("before class");	
	}
	@BeforeMethod
	public void beforemethod()
	{
		System.out.println("before method");
	}
}
