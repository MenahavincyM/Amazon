package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//Sceenshot

public class Amazon {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\java\\Selinium\\webdriver\\chromedriver.exe");

		WebDriver shot = new ChromeDriver();
		// get
		shot.get("https://www.amazon.in/");
		// maxi
		shot.manage().window().maximize();

		// locators
		// text
		WebElement a = shot.findElement(By.xpath("//a[text()='Amazon miniTV']"));
		a.click();

		// text

		WebElement b = shot.findElement(By.xpath("//span[text()='Movies']"));
		b.click();

		// index
		Thread.sleep(2000);
		WebElement c = shot.findElement(By.xpath("(//img[@style='animation-play-state: running; opacity: 1;'])[10]"));
		c.click();
		
		

	}

}
