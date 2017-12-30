package com.qatools.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class QAToolsCode {
	
	public void  EnetrName(ChromeDriver driver){
		 // set the first na
			//Test case :1
		Actions action = new Actions(driver);
		
		WebElement element= driver.findElement(By.xpath(".//*[@name='firstname']"));
	  
		action.moveToElement(element).sendKeys("Hello").doubleClick().build().perform();
			// Test case :2		
		}
	
	// Set the Last Name
	public void EnterLast(ChromeDriver driver){
				driver.findElement(By.xpath(".//*[@name='lastname']")).sendKeys("Beg");

}
	// Enetr the Gender 
	
	public void Gender (ChromeDriver driver){
		
		driver.findElement(By.xpath(""));
	}
	
}