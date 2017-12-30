package SampleWeb.SampleWeb;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class RadioButton {
	// setup the system property and 
	public static void main (String []args) throws InterruptedException{
		// Set the Browser property 
		System.setProperty("webdriver.gecko.driver","E:\\automation testing\\Alljars\\New Jar with3.0 Selenium\\geckodriver.exe");
		// Possible test for Radi Button
		
		// Set the Browser URL
		String url= "http://www.echoecho.com/htmlforms10.htm";
		// make an object of chrome driver
		WebDriver driver= new FirefoxDriver();
		driver.get(url);
		
		//scroll the page 
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
	     jse.executeScript("window.scrollBy(0,1250)", "");
	     
	     Thread.sleep(5000);
	     
	     // Find Element by Xpath 
	     int count =driver.findElements(By.cssSelector("input[name='group1']")).size();

	     for(int i=0;i<count;i++)

	     {

	     //driver.findElements(By.xpath("//input[@name='group1']")).get(i).click();

	     String text=driver.findElements(By.xpath("//input[@name='group1']")).get(i).getAttribute("value");
	     System.out.println(text);

	     if(text.equals("Cheese"))

	     {

	     driver.findElements(By.xpath("//input[@name='group1']")).get(i).click();

	     }
	     }
	     }
	     
	     
		
	}