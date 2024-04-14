package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



//https://letcode.in/alert
https://letcode.in/dropdowns
public class Dragact {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\java\\Selinium\\webdriver\\chromedriver.exe");
		WebDriver drive = new ChromeDriver();
		drive.manage().window().maximize();
		drive.get("https://demoqa.com/droppable");
		WebElement dra = drive.findElement(By.id("draggable"));
		WebElement drop = drive.findElement(By.id("droppable"));
		Actions a = new Actions(drive);
		a.dragAndDrop(dra, drop).build().perform();

	}

}
