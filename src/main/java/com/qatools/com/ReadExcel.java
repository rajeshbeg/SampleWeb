package com.qatools.com;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.TestListenerAdapter;
import org.testng.TestNG;
import org.testng.annotations.Test;

public class ReadExcel {
	@Test
	public static ArrayList<String> Readfile()throws IOException, ClassNotFoundException,SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException 
	{
		// create File Object 
		String path="C:\\Users\\Rajesh_B\\Desktop\\Automation\\testcase.xlsx";
		File src= new File(path);
		//
		FileInputStream fis = new FileInputStream(src);
		// used a work book 
		XSSFWorkbook wb= new XSSFWorkbook(fis);
		XSSFSheet sh = wb.getSheetAt(0);
		String name = sh.getRow(2).getCell(1).getStringCellValue();
		System.out.println(name);
		ArrayList <String> excuteTC = new ArrayList<String>();
		System.out.println(sh.getLastRowNum());
		System.out.println(sh.getRow(1).getLastCellNum());

		int maxcol=sh.getLastRowNum();
		for (int rowIndex = 0; rowIndex < maxcol; rowIndex++){
			System.out.println("Going from " + rowIndex + " to " + maxcol);
			System.out.println(sh.getRow(rowIndex).getCell(1).toString());

			if((sh.getRow(rowIndex).getCell(1).toString().equals("Y"))){
				System.out.println("Case is executing "+sh.getRow(rowIndex).getCell(0).toString());
				String execls=	sh.getRow(rowIndex).getCell(2).toString();

				//Update TestNg
				String clasname = "com.qatools.com."+execls;
				Class c2 = Class.forName(clasname);

				//		Class<?> cls = Class.forName(classname);

				TestListenerAdapter tla = new TestListenerAdapter();
				TestNG testng = new TestNG();
				testng.setTestClasses(new Class[] {c2});
				//testng.setTestClasses(new Class[] {com.qatools.com.QAServent.class});
				testng.addListener(tla); 
				testng.run();

				excuteTC.add(sh.getRow(rowIndex).getCell(0).toString());
			}

		}

		wb.close();
		return excuteTC;

	}
	
	public static ChromeDriver getChromeDriverInstance() {
		return new ChromeDriver();
	}
}