package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//JAVASCRIPTEXECUTOR

public class Javaexe {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\java\\Selinium\\webdriver\\chromedriver.exe");
		WebDriver drive = new ChromeDriver();
		drive.get("https://www.amazon.in/");
		drive.manage().window().maximize();
		WebElement a = drive.findElement(By.id("twotabsearchtextbox"));
		a.sendKeys("books");
		WebElement b = drive.findElement(By.id("nav-search-submit-button"));
		b.click();

		// specific element
		//WebElement c = drive.findElement(By.xpath("(//span[text()='119'])[1]"));
		JavascriptExecutor ja = (JavascriptExecutor) drive;
		//ja.executeScript("arguments[0].scrollIntoView();", c);

		// scrollup and down
		ja.executeScript("window.scrollBy(0,1000)");
		ja.executeScript("window.scrollBy(0,-250)");

	}

}
