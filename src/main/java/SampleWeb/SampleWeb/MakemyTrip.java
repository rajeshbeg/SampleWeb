package SampleWeb.SampleWeb;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MakemyTrip {
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
		driver.get("https://www.makemytrip.com");
		//Wait for loading the page 
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		//Set the journey date 
		driver.findElement(By.cssSelector("input[class='input_fromto ui-autocomplete-input']")).click();
		Thread.sleep(3000);
		
		// set the city name 
		driver.findElement(By.xpath("//div[@id='js-filterOptins']/div/div[1]/ul[1]/li[8]")).click();
//		
//		// click on Destination city
//		driver.findElement(By.xpath("//input[@id='hp-widget__sTo']")).click();
//		// Set the Destination city 
		driver.findElement(By.xpath("(//div[@id='js-filterOptins']/div/div[2]/ul[1]/li[4])")).click();
		
		// Set the Date as 28th October
		
		driver.findElement(By.xpath("//Input[@id='hp-widget__depart']")).click();
		List<WebElement> MonthsName= driver.findElements(By.xpath(".//*[@class='ui-datepicker-month']"));
		//print the size of months name 
		
		System.out.println(MonthsName.size());
//		for (int i=1;i<=MonthsName.size();i++)
//		if (MonthsName.equals("October")){
//			driver.findElement(By.xpath(""))
//		}
		
		
	}

}
