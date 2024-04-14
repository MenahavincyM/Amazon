package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cssselect {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\java\\Selinium\\webdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/accounts/login/");
		// css selector using prefix
		Thread.sleep(2000);
		WebElement a = driver.findElement(By.cssSelector("[aria-label^='Phone number']"));
		a.sendKeys("Menahavincy");
		//css seelectors using any attr
		WebElement b = driver.findElement(By.cssSelector("[aria-label='Password']"));
		b.sendKeys("menahavincy");
		WebElement c = driver.findElement(By.cssSelector("[type='submit']"));
		c.click();
		
		
		
		
	}
}
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


