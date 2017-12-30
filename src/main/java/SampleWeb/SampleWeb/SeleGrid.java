package SampleWeb.SampleWeb;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SeleGrid {
	public static void main (String[]args) throws MalformedURLException{
		WebDriver driver;
		String nodeUrl;
		String baseUrl;
		
		nodeUrl="http://192.168.2.55:5566/wd/hub";
		
		
		File file = new File("C:\\Users\\Rajesh\\workspace\\webdriver_Gmail\\src\test\\java\\webdriver_Gmail\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver",file.getAbsolutePath());
		    new DesiredCapabilities();
		//System.setProperty("webdriver.chrome.driver","E:\\Google Drive\\chromedriver.exe");
		//WebDriver wd =new ChromeDriver();
		//baseUrl = "https://www.google.com";
		
		
		  DesiredCapabilities capa = DesiredCapabilities.firefox();
		  capa.setCapability(FirefoxDriver.BINARY,new File("C:\\Test\\chromedriver_win32\\chromedriver.exe").getAbsolutePath());
		capa.setJavascriptEnabled(true);
		//wd= new RemoteWebDriver(new URL("http://192.168.2.41:5566/wd/hub"),capa);
		capa.setBrowserName("chrome");
	    capa.setPlatform(Platform.ANY);
	    driver=new RemoteWebDriver(new URL(nodeUrl),capa);
		driver.get("http://google.co.in");
	}

}
