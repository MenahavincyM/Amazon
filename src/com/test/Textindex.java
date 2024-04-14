package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//webelement and locators

public class Textindex {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\java\\Selinium\\webdriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		//get
		driver.get("https://www.imdb.com/");
		
		//maxi
		
		driver.manage().window().maximize();
		
		//locators x path
		//basic xpath
		
		WebElement a = driver.findElement(By.xpath("//input[@type='text']"));
		a.sendKeys("padikathavan");
		
		WebElement b = driver.findElement(By.xpath("//button[@type='submit']"));
		b.click();
		
		//halftext
		WebElement c = driver.findElement(By.xpath("(//a[text()='Padikkathavan'])[2]"));
		c.click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
