package SampleWeb.SampleWeb;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Framework2 {
	@BeforeSuite
	public void first()
	{
		System.out.println("first");
	}
	@Test
	public void Second()
	{
		System.out.println("second");
	}
	@AfterSuite
	public void Third()
	{
		System.out.println("third");
	}
}
