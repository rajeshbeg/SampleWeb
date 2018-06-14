package com.qatools.com;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadMyExcel {
	public static ArrayList<String> main(String args[]) throws IOException {
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
		ArrayList<String> executeTC = new ArrayList<String>();

		System.out.println(sh.getLastRowNum());
		System.out.println(sh.getRow(0).getLastCellNum());
		int maxcol=sh.getLastRowNum();
		for (int rowIndex = 0; rowIndex < maxcol; rowIndex++){
			System.out.println("Going from " + rowIndex + " to " + maxcol);
			System.out.println(sh.getRow(rowIndex).getCell(1).toString());
			
			if((sh.getRow(rowIndex).getCell(1).toString().equals("Y"))){
				System.out.println("Case is executing "+sh.getRow(rowIndex).getCell(0).toString());
				
			
				executeTC.add(sh.getRow(rowIndex).getCell(0).toString());
			}
		
		}
		// Read Excel Column 
	return executeTC;
	}
	
}


