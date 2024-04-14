package com.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Sdrop {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\java\\Selinium\\webdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/dropdowns");

		WebElement single = driver.findElement(By.id("fruits"));
		// singledropdown
		Select a = new Select(single);
		a.selectByVisibleText("Banana");

		// getoptions
		List<WebElement> op = a.getOptions();
		for (WebElement A : op) {
			String t = A.getText();
			System.out.println(t);

		}
		// multiple dropdown
		WebElement multi = driver.findElement(By.id("superheros"));
		Select b = new Select(multi);
		b.selectByValue("ca");
		b.selectByVisibleText("Batman");
		b.selectByIndex(8);

		// getallselected

		List<WebElement> opt = b.getAllSelectedOptions();
		for (WebElement B : opt) {
			String t1 = B.getText();
			System.out.println(t1);

		}
		
	b.deselectByIndex(3);
	b.deselectAll();

		WebElement mul = driver.findElement(By.id("lang"));
		Select c = new Select(mul);
		
		c.selectByValue("swift");

		// getfirstselected

		WebElement f = c.getFirstSelectedOption();
		String t2 = f.getText();
		System.out.println(t2);

	}
}