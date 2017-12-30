package SampleWeb.SampleWeb;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class GoogleApp {
	public static void main (String args[]) throws InterruptedException, IOException{
	
		
		String URL="https://play.google.com/store/apps/dev?id=5700313618786177705";
	    System.setProperty("webdriver.gecko.driver", "E:\\automation testing\\Alljars\\New Jar with3.0 Selenium\\geckodriver.exe");
	     WebDriver driver= new FirefoxDriver();
	     driver.get(URL);

	     //Scroll the page 
	     JavascriptExecutor jse = (JavascriptExecutor)driver;
	     jse.executeScript("window.scrollBy(0,450)", "");

	Thread.sleep(5000);
	List <WebElement> x = driver.findElements(By.xpath(".//*[@class='card-content id-track-click id-track-impression']/div[2]/a[1]"));
    System.out.println(x.size());

    
    File file = new File("C:\\Users\\Rajesh_B\\Desktop\\SQL\\MY.txt");
	  FileWriter fw = new FileWriter(file);
BufferedWriter bw = new BufferedWriter(fw);
for (int j=0;j<50;j++){
    for(int i=0 ; i<=x.size()-1; ++i){
    	
      String Urls=  x.get(i).getAttribute("href");

 	 /* This logic will make sure that the file 
 	  * gets created if it is not present at the
 	  * specified location*/
 	  try{

 	  bw.write(Urls + ",");  
 	  }catch(IOException e){
 		 System.out.println(e);
 	  }
	}
    Thread.sleep(5000);
    driver.findElement(By.xpath(".//button[@class='expand-button expand-next']")).click();
    Thread.sleep(5000);
   
}
	  
	 bw.close();
    System.out.println("File written Successfully");
 
	}
}
