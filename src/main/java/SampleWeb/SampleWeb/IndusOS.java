package SampleWeb.SampleWeb;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class IndusOS {
	private WebDriver driver;
	
	@BeforeTest
	// Before Start the Test set the url and Property 
	public void SetProperty(){
		String URL="https://www.facebook.com/";
		System.out.println("I am opening the page ");
		System.setProperty("webdriver.gecko.driver","E:\\automation testing\\Alljars\\New Jar with3.0 Selenium\\geckodriver.exe");
		driver= new FirefoxDriver();
		driver.get(URL);
		driver.manage().timeouts().implicitlyWait(10000,TimeUnit.MILLISECONDS);
	}
	
	@Test(priority=1)
	//Test About page
	public void TestAbout() throws InterruptedException{
	// Write your first name by 
	driver.findElement(By.xpath("//div[@id='reg_form_box']/div[1]/div[1]/div[1]/div/div/input")).sendKeys("Suman");

	
	// Write your Surname
	driver.findElement(By.xpath("//div[@id='reg_form_box']/div[1]/div[1]/div[2]/div[1]/div/input")).sendKeys("Beg");

	String title=driver.getTitle();
	System.out.println(title);
	// Enter the of your birth
	driver.findElement(By.xpath(".//div[@id='reg_form_box']/div[6]/div[2]/span/span/select[1]/option[5]")).click();
	
	//if (title.equals("About "))
	}
	
//	@AfterTest
//	// close The Page 
//	public void closeWeb()
//	{
//		System.out.println("All the provided test has been completed. Now you can mail");
//		driver.quit();
//		
//	}
}

