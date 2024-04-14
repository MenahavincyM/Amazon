package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//Locators

public class Locate {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\java\\Selinium\\webdriver\\chromedriver.exe");
		
		WebDriver drive = new ChromeDriver();
		
		drive.get("https://www.amazon.com");
		drive.manage().window().maximize();
		
		//locators using id
		
		WebElement a = drive.findElement(By.id("captchacharacters"));
		a.sendKeys("BCPGCA");
		
		WebElement b = drive.findElement(By.id("a-button-text"));
		a.click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	

}
