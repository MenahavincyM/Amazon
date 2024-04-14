package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linkedamazon {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\java\\Selinium\\webdriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		WebElement a = driver.findElement(By.cssSelector("#twotabsearchtextbox"));
		a.sendKeys("storybook");
		WebElement b = driver.findElement(By.cssSelector("input[type='submit']"));
		b.click();
		driver.findElement(By.linkText("Pandit Vishnu Sharma's Panchatantra: Illustrated Tales From Ancient India (Hardback, Special edition) [Hardcover] Shubha Vilas"));
		a.click();
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	

}
