package SampleWeb.SampleWeb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Ebye {
	public static void main (String args[]){
		// Set the browser property
		
				System.setProperty("webdriver.chrome.driver","E:\\Google Drive\\chromedriver.exe");
				
				ChromeOptions options= new ChromeOptions();
				//Disable Extensions
				options.addArguments("--disable-extensions");
				// Maximize window 
			
				// Url
				String url= "https://www.ebay.in/";
				//Set the Driver
				WebDriver driver = new ChromeDriver();
				driver.get(url);
				
				// How many link is present in home page
				System.out.println("Number of link :"+driver.findElements(By.tagName("a")).size());
				
				//Count of links in the footer section of the page
				WebElement footer=driver.findElement(By.xpath(".//*[@id='glbfooter']"));
				//System.out.println("Links in the footer section");
				System.out.println(footer.findElements(By.tagName("a")).size());
				WebElement col=driver.findElement(By.xpath(".//*[@id='gf-BIG']/table/tbody/tr/td[2]/ul"));
				//System.out.println("Links in the 2nd coloumn of the section");
				System.out.println(col.findElements(By.tagName("a")).size());
				String BeforeClicking = null;
				String AfterClicking;
				for(int i=0;i<col.findElements(By.tagName("a")).size();i++)
				{
				
					
					if(col.findElements(By.tagName("a")).get(i).getText().contains(" Seller Tools"))
					{
						BeforeClicking = driver.getTitle();
					
						col.findElements(By.tagName("a")).get(i).click();
						break;
						}
				}
				AfterClicking =driver.getTitle();
				System.out.println(AfterClicking);
				if(BeforeClicking!=AfterClicking)
				{
					if(driver.getPageSource().contains(" Seller Tools"))
				
						System.out.println("PASS");
				}
				else
				{
					System.out.println("FAIL");
				}
					
			}
				
				
		
	}


