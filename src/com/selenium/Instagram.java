package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//locators

public class Instagram {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\java\\Selinium\\webdriver\\chromedriver.exe");
		WebDriver drive = new ChromeDriver();

		drive.get("https://www.instagram.com/");

		drive.manage().window().maximize();

		// locators

		// id
		Thread.sleep(2000);

		WebElement a = drive.findElement(By.name("username"));
		a.sendKeys("Menahavincy");

		// name

		WebElement b = drive.findElement(By.name("password"));
		b.sendKeys("vincy");
		
		// basic xpath
		Thread.sleep(3000);
		WebElement lo = drive.findElement(By.xpath("//button[@type='submit']"));
		lo.click();
	}

}
