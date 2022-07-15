package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Draganddrop {
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ELCOT\\.eclipse\\movement\\drivers\\chromedriver.exe");
		
		
		WebDriver driver=new ChromeDriver();
		
		
	   driver.get("https://demo.guru99.com/test/drag_drop.html");
	   
	   driver.manage().window().maximize();
	   
	   Actions a=new Actions(driver);
	   
	   
	   WebElement src = driver.findElement(By.xpath("//a[text()=' BANK ']"));
	   
	   WebElement dest = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
	   
	   a.dragAndDrop(src, dest).perform(); 
	   
	  
	   
	  
	}

}
