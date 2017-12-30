package SampleWeb.SampleWeb;

import org.testng.DependencyMap;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Framework {
	@BeforeMethod
	public void Restart()
	{
		System.out.println("Restart the browser before everymethod");
	}
	@BeforeTest
	public void Deletecookie()
	{
	System.out.println("Deleted all cookies");
	}
	@AfterTest
	public void Delecookieaftertest()
	{
		System.out.println("Deleting all cookies after test");
	}
	@AfterMethod
	public void ReportTest()
	{
		System.out.println("Repot test report after every method");
	}
	
	@Test
	public void first()
	{
	System.out.println("first test");	
	}
	@Test
	public void second()
	{
	System.out.println("Second Test");	
	}
	@Test(dependsOnMethods={"first"} )
	public void Third()
	{
		System.out.println("Test this after First test");
	}

}
