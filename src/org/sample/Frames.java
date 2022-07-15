package org.sample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ELCOT\\.eclipse\\movement\\drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://demo.guru99.com/test/guru99home/");

		driver.manage().window().maximize();
				
							
		List<WebElement> allframe = driver.findElements(By.tagName("iframe"));
		
		int count = allframe.size();
		
		System.out.println("the frame count is"+count);
		
		
		

	}

}
