package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Texlocate {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\java\\Selinium\\webdriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		//get
		
		driver.get("https://www.amazon.in/");
		
		//maxi
		
		driver.manage().window().maximize();
		
		//locators
		
		//text
		
		WebElement a = driver.findElement(By.xpath("//a[text()='Best Sellers']"));
		a.click();
		
		//id
		
		WebElement b = driver.findElement(By.id("twotabsearchtextbox"));
		b.sendKeys("books");
		
		//basic x path
		
		WebElement c = driver.findElement(By.xpath("//input[@type='submit']"));
		c.click();
		
		//haltext
		WebElement d = driver.findElement(By.xpath("//span[contains(text(),'Shl')]"));
		d.click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
