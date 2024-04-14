package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerttt {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\java\\Selinium\\webdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/alert");
	
		//simple alert
		WebElement a = driver.findElement(By.id("accept"));
		a.click();
		driver.switchTo().alert().accept();
		WebElement b = driver.findElement(By.id("confirm"));
		b.click();
		driver.switchTo().alert().dismiss();
		WebElement c = driver.findElement(By.id("prompt"));
		c.click();
		driver.switchTo().alert().sendKeys("java");
		driver.switchTo().alert().accept();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		
		
		
		
		
		
		
		
		
		
		
	}
	
	

}
