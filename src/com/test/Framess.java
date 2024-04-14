package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Framess {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\java\\Selinium\\webdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Frames.html");
		WebElement fr = driver.findElement(By.id("singleframe"));
		driver.switchTo().frame(fr);
		WebElement fra = driver.findElement(By.xpath("//input[@type='text']"));
		fra.sendKeys("vincy");
		driver.switchTo().defaultContent();
		WebElement mu = driver.findElement(By.xpath("//a[text()='Iframe with in an Iframe']"));
        mu.click();
       driver.switchTo().frame(1);
       driver.switchTo().frame(0);
      WebElement element = driver.findElement(By.xpath("//input[@type='text']"));        
      element.sendKeys("vin");
	}

}
