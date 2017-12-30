package SampleWeb.SampleWeb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.FindElement;

public class Iframe {
	public static void main (String []args){
	System.setProperty("webdriver.chrome.driver","E:\\Google Drive\\chromedriver.exe");
	
	ChromeOptions options= new ChromeOptions();
	//Disable Extensions
	options.addArguments("--disable-extensions");
	// Maximize window 

	// Url
	String url= "http://jqueryui.com/droppable/";
	//Set the Driver
	WebDriver driver = new ChromeDriver();
	driver.get(url);
	// Maximize the Window
	driver.manage().window().maximize();
	//How to get the Frame number
     System.out.println(driver.findElements(By.tagName("iframe")).size());
	
	//Switch to the frame 
	driver.switchTo().frame(driver.findElement(By.cssSelector("iframe.demo-frame")));
	driver.findElement(By.id("draggable")).click();
	Actions action = new Actions(driver);
	WebElement source =driver.findElement(By.id("draggable"));
	WebElement target=driver.findElement(By.id("droppable"));
	action.dragAndDrop(source, target).build().perform();
	

}
}