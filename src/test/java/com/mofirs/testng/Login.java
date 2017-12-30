package com.mofirs.testng;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Properties;

import org.omg.Messaging.SyncScopeHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Login {

	WebDriver driver; 

	@Test(priority=1)
	public void setUrl() throws IOException
	{
		System.setProperty("webdriver.chrome.driver","E:\\Google Drive\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("http://www.moneycontrol.com/");
	}
	@Test(priority=2)
	public void Loginclick() throws IOException, InterruptedException
	{
		driver.findElement(By.xpath("//a[@title='Log In']")).click();
		Thread.sleep(5000);
				driver.switchTo().frame("myframe");

		//enter user name and password
		//		WebElement x = driver.findElement(By.xpath("html/body/div[7]/div/div/div/button"));
		//		x.click();

//		new WebDriverWait(driver, 10).until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("//iframe[@src='https://accounts.moneycontrol.com/mclogin/?d=2']")));
		driver.findElement(By.xpath("//form[@id='login_form']//input[@class='textfield' and @id='email']")).sendKeys("xyz@gmail.com");
		driver.findElement(By.xpath("//form[@id='login_form']//input[@class='textfield' and @id='pwd']")).sendKeys("Abc@92");



		List<WebElement> ele2 = driver.findElements(By.tagName("iframe"));
		System.out.println("Number of frames in a page :" + ele2.size());
		for(WebElement el : ele2){

			//	    	for (int i=0;i<=ele2.size();i++)
			//	    	{
			//Returns the Id of a frame.
			System.out.println("Frame Id :" + el.getAttribute("id"));
//			if(el.getAttribute("id").equals("")) {
//				continue;
//			}
//			driver.switchTo().frame(driver.findElement(By.id(el.getAttribute("id"))));
//			try
//			{
//				driver.findElement(By.id("email")).sendKeys("xyz@gmail.com");
//				break;
//			}catch(Exception e)
//			{
//				System.out.println("element not found for"+e);
//			}
//
//			driver.switchTo().defaultContent();
			//Returns the Name of a frame.
			System.out.println("Frame name :" + el.getAttribute("name"));
		}
		//	    }




		//		List<WebElement> framecount=driver.findElements(By.tagName("iframe"));
		//		System.out.println(framecount.size());
		//	
		//		for (int i=0;i<=framecount.size();i++)
		//			
		//		{
		//			String framename=framecount.get(i).toString();
		//			System.out.println(framename);
		//			System.out.println(framecount.get(i).getText());

		//		if (driver.findElement(By.id("email")).isDisplayed())
		//			{
		//			driver.findElement(By.id("email")).sendKeys("rajesh");
		//			};
		// driver.findElement(By.id("pwd")).sendKeys("abc");
	}
	//		}


	//	driver.findElement(By.cssSelector("input[id='email'][class='textfield']")).sendKeys("rajesh");
	//		driver.findElement(By.xpath("//div[@class='formbox']/div[1]/form/div[1]")).sendKeys("mirjarajesh@gmail.com");
	//		driver.findElement(By.xpath("//input[@id='pwd']")).sendKeys("Rajesh@1992");
	//		//click on Login 
	//		driver.findElement(By.xpath("//button[@onclick='api_call('/login/index/', 'login_form')']")).click();


	//  @DataProvider
	//  public Object[][]getData()
	//  {  
	////		  Object[][]data=new Object[2][2];
	////		  data[0][0]="rajesh@indusos.com";
	////		  data[0][1]="12345";
	////		  
	////		  data[1][0]="rajesh@indusos.com";
	////		  data[1][1]="12345";
	//		  
	//return dataMap;
	//		  
}



