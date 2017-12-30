package com.qatools.com;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class GenderSelect extends Entername {
	@Test(priority=1)
	public void SelectMale()
	 {
	 System.out.println("I am selecting Male option: ");	
	 driver.findElement(By.xpath(".//input[@id='sex-0']")).click();
	 }
	@Test(priority=2)
	public void SelectFemale()
	 {
	 System.out.println("I am selecting Female option:  ");
	 driver.findElement(By.xpath(".//input[@id='sex-1']")).click();
	 }
	@Test(priority=3)
	public void Deselect()
	 {
	  System.out.println("I am Deselecting all option and verify any option is selected or not:      ");
	 List<WebElement> count= driver.findElements(By.xpath(".//input[@name='sex']"));
	 count.size();
	 System.out.println(count.size());
	  for (int x=0;x<count.size();x++)
	  {
		if (((WebElement) count).getText().equals("Male"))
		{
			System.out.println("Pass");
		}  
		else
		{
			System.out.println("Fail");
		}
	  }
   
}
}
