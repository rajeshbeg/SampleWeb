package SampleWeb.SampleWeb;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableGrid {
			
		public static void main (String args[]){
			// How to grabe the data from table 
			System.setProperty("webdriver.chrome.driver","E:\\Google Drive\\chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();
			
			driver.get("http://www.espncricinfo.com/series/18029/game/1120091/India-vs-New-Zealand-2nd-ODI-nz-in-ind-2017-18-2017-18/");

			// Grab the data from Table 

		WebElement table=driver.findElement(By.xpath(".//*[@id='main-container']/div/div[2]/div[2]/article[1]/div/table"));
		 List<WebElement>noofrows = table.findElements(By.tagName("tr"));
		System.out.println( "No of Rows "+noofrows.size());
		// Find The column in Each row
		for (WebElement eachrow:noofrows){
			int i=0;
		List<WebElement>noofcol=eachrow.findElements(By.tagName("td"));
		i++;
		System.out.println("No of col is "+i+"th rows " +noofcol.size());
		
		for (WebElement text :noofcol){
			
			System.out.println(text.getText());
		}
			
		}
		
		
			
}
}
