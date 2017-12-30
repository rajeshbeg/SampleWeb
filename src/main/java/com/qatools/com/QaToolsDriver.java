package com.qatools.com;

import java.io.IOException;
import java.lang.reflect.Executable;
import java.lang.reflect.InvocationTargetException;
import java.sql.Driver;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class QaToolsDriver{

	public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		// TODO Auto-generated method stub
		// Set the browser property
		
		System.setProperty("webdriver.chrome.driver","E:\\Google Drive\\chromedriver.exe");
		
		ChromeOptions options= new ChromeOptions();
		//Disable Extensions
		options.addArguments("--disable-extensions");
		// Maximize window 
	
		// Url
//		String url= "http://toolsqa.com/automation-practice-form/";
//		//Set the Driver
//		WebDriver driver = new ChromeDriver();
//		driver.get(url);
		// Maximize the Window
	//	driver.manage().window().maximize();
		// Using of Explicit Wait 
//		WebDriverWait wbw= new WebDriverWait(driver,2);
//		WebElement element= wbw.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='firstname']")));
//		
		ArrayList<String> excuteTestList = new  ArrayList<String>();
		ReadExcel re= new ReadExcel();
		excuteTestList = ReadExcel.Readfile();
//		 QAServent qs= new QAServent();
//		 excuteTestList.size();
//		 for(String x : excuteTestList){
//			 System.out.println(x.toString());
//		 }

//		QAToolsCode qc = new QAToolsCode();
//		
//		System.out.println(re.Readfile());
//		qc.EnetrName((ChromeDriver) driver);
		
	}
	
//
//	public void SelectGender(ChromeDriver driver){
//		
//		// Xpath of parent
//		String text=driver.findElement(By.xpath(".//*[@id='content']/form/fieldset/div[2]")).getAttribute("Value");
//		System.out.println(text);
		
		// Xpath of child for male .//*[@id='sex-0']
		
		
		//Xpath of child Female.//*[@id='sex-1']
		
		
		// Year of Experience parent.//*[@id='content']/form/fieldset/div[3]
		
		// child   .//*[@id='exp-0']
		
		//Date .//*[@id='datepicker']
		
		
		// Profession parent .//*[@id='content']/form/fieldset/div[4]
		
		// Child .//*[@id='profession-0']
		
		
		//Profile Pic .//*[@id='photo']
		//Use Robot to pic File 
		
		//Automation tools parent .//*[@id='content']/form/fieldset/div[11]
		
		// Continents Use Select class by using this xpath - .//*[@id='continents']
		
		// Selenium command : .//*[@id='selenium_commands']
		
		
		
		
		
		
		
	}
	


