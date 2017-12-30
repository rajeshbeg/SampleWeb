package SampleWeb.SampleWeb;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FrameDetection {
	// user can detect the frame from iframe id ;
	
		// by Frame element 
		
		// Select from Dynamic element 
		
	public static void main (String args[]){
		// detecting by iframe
		System.setProperty("webdriver.chrome.driver","E:\\Google Drive\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://fantasycricket.dream11.com/IN/");
		
		int frmcount= driver.findElements(By.tagName("iframe")).size();
		System.out.println("Number of frmae: "+frmcount);
		for (int i=0;i<frmcount;i++){
			driver.switchTo().frame(i);
			int count =driver.findElements(By.cssSelector("p[class='chkbox']")).size();
			System.out.println(count);
			if (count>0){
				driver.findElement(By.cssSelector("p.chkbox")).click();
				break;
			}
			else
			{
				System.out.println("Frame is not present so continue looping ");
			}
		}
		
		
	}

	
	
	
}
