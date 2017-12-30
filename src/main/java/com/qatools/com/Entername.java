package com.qatools.com;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Entername extends SuperTestClass
  {

	@Test(priority=1)
	   public void Enterfname()
       {
		System.out.println("************Enter your fname********" );
		 try
		    {
		     System.out.println("I am Entering First Name");
		     driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Rajesh");
		     
		    }   
		      catch(Exception e)
		    {
			  System.out.println(e);
            }
      //		return false;
	     }
	@Test(priority=2)
	public void Enterlname()
	  {
		System.out.println("*****************Enter your Last Name*******");
		try
		{
		 System.out.println("I am Entering Last name  ");
		 driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Beg");;
		}
		 catch(Exception e)
		  {
		   System.out.println(e);
		  }
    //return false;
	 }
}
