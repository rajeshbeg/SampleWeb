package com.qatools.com;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Driver {	
	public static WebDriver driver;
		@Test     
	    public void setup ()
	    {          
		System.setProperty("webdriver.chrome.driver","E:\\Google Drive\\chromedriver.exe");
	    driver = new ChromeDriver();
	   driver.get("https://play.google.com/store/search?q=bengali%20apps&c=apps");
	   
	   
	   
	   java.util.List<WebElement> links = driver.findElements(By.tagName("a"));
       
       System.out.println(links.size());

       for (int i = 1; i<=links.size(); i=i+1)

       {

           System.out.println(links.get(i).getText());

       }
	   
	   
	   
	   
	   
	  /*  
	    options.addArguments("test-type");
	    options.addArguments("start-maximized");
	    options.addArguments("--js-flags=--expose-gc");  
	    options.addArguments("--enable-precise-memory-info"); 
	    options.addArguments("--disable-popup-blocking");
	    options.addArguments("--disable-default-apps");
	    options.addArguments("test-type=browser");
	    options.addArguments("disable-infobars");
	*/	
	}
      
		/*
		@Test(priority=1)
		public void SetURL() throws IOException, ClassNotFoundException, NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
			// TODO Auto-generated method stub
			// Set the browser property
			
//			System.setProperty("webdriver.chrome.driver","E:\\Google Drive\\chromedriver.exe");
//			
//			ChromeOptions options= new ChromeOptions();
//			//Disable Extensions
//			options.addArguments("--disable-extensions");
//			// Maximize window 
		
			// Url
			String url= "http://toolsqa.com/automation-practice-form/";
			//Set the Driver
			WebDriver driver = new ChromeDriver();
			// Manage Cookies 
			driver.manage().deleteAllCookies();
			driver.get(url);
			// Maximize the Window
			driver.manage().window().maximize();
			// Using of Explicit Wait 
			WebDriverWait wbw= new WebDriverWait(driver,2);
			WebElement element= wbw.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='firstname']")));
			
			ArrayList<String> excuteTestList = new  ArrayList<String>();
			ReadExcel re= new ReadExcel();
			excuteTestList = ReadExcel.Readfile();
}
      @Test(priority=2)
      public void Entername(){
    	
 
      
      }
      
      */
}
	