package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ELCOT\\.eclipse\\movement\\drivers\\chromedriver.exe");
		
		
		WebDriver driver=new ChromeDriver();
		
		
	   driver.get("https://www.facebook.com/");
	   
	   driver.manage().window().maximize();
	   
	   driver.findElement(By.xpath("//input[@name='email']")).sendKeys("raocky");
	   
	   
	 driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("rannjith");
	 
	 driver.findElement(By.xpath("//button[text()='Log In']")).click();
	   
	   
	}
	

}
