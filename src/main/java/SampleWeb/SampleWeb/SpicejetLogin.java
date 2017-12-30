package SampleWeb.SampleWeb;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SpicejetLogin{
	public static void main (String args[]) throws InterruptedException{
		
		// setthe browser property
		
		System.setProperty("webdriver.chrome.driver","E:\\Google Drive\\chromedriver.exe");
		ChromeOptions options= new ChromeOptions();
		// Disable to Extension
		options.addArguments("--disable-extensions");
		// Maximize the Page
		options.addArguments("--start-maximized");
		WebDriver driver= new ChromeDriver(options);
		// Set URL
		//driver.get("https://book2.spicejet.com/search.aspx#");
		driver.get("https://www.makemytrip.com/");
		//Wait for loading the page 
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		//Set the journey 
		
		
		
	//	driver.findElement(By.cssSelector("input[id='ControlGroupSearchView_AvailabilitySearchInputSearchVieworiginStation1_CTXT']")).click();
	//	Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='hp-widget__sfrom']")).click();
		
		List<WebElement> CityName = driver.findElements(By.xpath(".//*[@id='js-filterOptins']/div/div[1]/ul[1]"));
		System.out.println(CityName.size());
				
		// set the city name 
	//	driver.findElement(By.cssSelector("a[value='DEL']")).click();
//		
//		// click on Destination city
  //  	driver.findElement(By.xpath("(//a [@value='CCU'])[2]")).click();
//		// Set the Destination city 
//		driver.findElement(By.xpath(".//*[@id='ui-id-677']/div/p[1]/span[1]")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
