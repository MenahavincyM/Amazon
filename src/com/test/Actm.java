package com.test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actm {
	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\java\\Selinium\\webdriver\\chromedriver.exe");
		WebDriver drive = new ChromeDriver();
		drive.manage().window().maximize();
		drive.get("https://www.amazon.in/");
		WebElement sel = drive.findElement(By.xpath("//a[text()='Sell']"));
		// MOUSEBASED
		Actions a = new Actions(drive);
		a.contextClick(sel).build().perform();
		// ROBOTBASED
		Robot b = new Robot();
		b.keyPress(KeyEvent.VK_DOWN);
		b.keyRelease(KeyEvent.VK_DOWN);
		b.keyPress(KeyEvent.VK_DOWN);
		b.keyRelease(KeyEvent.VK_DOWN);
		b.keyPress(KeyEvent.VK_DOWN);
		b.keyRelease(KeyEvent.VK_DOWN);
		b.keyPress(KeyEvent.VK_ENTER);
		b.keyRelease(KeyEvent.VK_ENTER);
		

	}

}
