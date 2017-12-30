package SampleWeb.SampleWeb;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.os.WindowsUtils;

import com.sun.jna.platform.FileUtils;

public class KillNotepad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirefoxDriver driver = new FirefoxDriver();
   WindowsUtils.tryToKillByName("excel.exe");
   
   // How tp get screenshot 
   File srcfile= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
   //FileUtils.copyFile(srcfile,new File (""));
	}

}
