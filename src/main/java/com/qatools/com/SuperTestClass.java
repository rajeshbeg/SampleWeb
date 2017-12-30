package com.qatools.com;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class SuperTestClass {
	protected static ChromeDriver driver;
	
	@BeforeClass
	public static void setup() {
		String url= "http://toolsqa.com/automation-practice-form/";
		driver = new ChromeDriver();
		driver.get(url);
	}
}
