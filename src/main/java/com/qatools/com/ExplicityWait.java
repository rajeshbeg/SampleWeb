package com.qatools.com;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.server.handler.FindElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicityWait {
	
	public static void main(String args[]) throws InterruptedException{
		//using of explicity wait
		
		System.setProperty("webdriver.chrome.driver","E:\\Google Drive\\chromedriver.exe");
		ChromeOptions options= new ChromeOptions();
		//Disable Extensions
		options.addArguments("--disable-extensions");
		// Maximize window 
		options.addArguments("--start-maximized");
		
		
		WebDriver driver = new ChromeDriver();
		// Set the URL and wit for element 
		driver.get("https://accounts.google.com/SignUp?hl=en");
		
		driver.findElement(By.xpath(".//*[@id='wrapper']/div[2]/div/div[1]/p/a")).click();
		WebDriverWait ww= new WebDriverWait(driver, 5);
		WebElement element = ww.until(ExpectedConditions.elementToBeClickable(By.xpath("// a[@target='_blank']")));
		element.click();
		Set<String> ids= driver.getWindowHandles();
		Iterator<String>itr = ids.iterator();
		String Parentid= itr.next();
		System.out.println(Parentid);
		String Childid1= itr.next();
		System.out.println(Childid1);
		String Child2=itr.next();
		// Click on Name
		//driver.findElement(By.xpath("//a[@name='name']")).click();
		String Title=driver.getTitle();
		System.out.println(Title);
		//Switch back to the Parent Window:
		driver.switchTo().window(Childid1);
		String Titlechild= driver.getTitle();
		System.out.println(Titlechild);
		
		driver.switchTo().window(Child2);
		driver.getTitle();
		driver.switchTo().window(Parentid);
		
		driver.getTitle();
		
		
	
		
		
	}

}
