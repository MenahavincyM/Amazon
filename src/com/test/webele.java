package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//webelements using locators

public class webele {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\java\\Selinium\\webdriver\\chromedriver.exe");

		WebDriver test = new ChromeDriver();

		// get

		test.get("https://www.facebook.com/");

		// maxi

		test.manage().window().maximize();

		// locators
		// id and name

		WebElement a = test.findElement(By.id("email"));
		a.sendKeys("johnvincy@gmail.com");
		
		WebElement b = test.findElement(By.id("pass"));
		b.sendKeys("vincy");
		
		//basic x path
		
		WebElement c = test.findElement(By.xpath("//button[@type='submit']"));
		c.click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
