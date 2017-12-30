package SampleWeb.SampleWeb;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class CookiesHttpcertificate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver","E:\\automation testing\\Alljars\\New Jar with3.0 Selenium\\geckodriver.exe");
	     
		//FirefoxProfile prof= new FirefoxProfile();
		//prof.setAcceptUntrustedCertificates(false);
		
	//	WebDriver driver= new FirefoxDriver(prof);
		WebDriver driver= new FirefoxDriver();
		driver.get("http://google.co.in");
		Set<Cookie>abc=driver.manage().getCookies();
		System.out.println(abc.size());
		driver.manage().deleteAllCookies();
		Set<Cookie>abcd=driver.manage().getCookies();
		System.out.println(abcd.size());
		
		

	}

}
