package org.sample;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {
	
	public static void main(String[] args) throws IOException {
	
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ELCOT\\.eclipse\\movement\\drivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		TakesScreenshot tk=(TakesScreenshot)driver;
		
		File src = tk.getScreenshotAs(OutputType.FILE);
		
		File dest=new File("C:\\Users\\ELCOT\\.eclipse\\movement\\Screeshot\\facebook.png");
		
		FileUtils.copyFile(src, dest);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
