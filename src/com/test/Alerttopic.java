package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//Alert

public class Alerttopic {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\java\\Selinium\\webdriver\\chromedriver.exe");
		WebDriver drive = new ChromeDriver();
		drive.manage().window().maximize();
		drive.get("https://demo.automationtesting.in/Alerts.html");
		WebElement a = drive.findElement(By.xpath("//button[@onclick='alertbox()']"));
		a.click();
		// simple alert
		drive.switchTo().alert().accept();
		// confirm alert
		WebElement b = drive.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']"));
		b.click();
		WebElement c = drive.findElement(By.xpath("//button[@onclick='confirmbox()']"));
		c.click();
		drive.switchTo().alert().dismiss();
		WebElement d = drive.findElement(By.xpath("//a[text()='Alert with Textbox ']"));
		d.click();
		WebElement e = drive.findElement(By.xpath("//button[@onclick='promptbox()']"));
		e.click();
		drive.switchTo().alert().sendKeys("vincy");
		drive.switchTo().alert().accept();
		

	}

}
