package com.test;

import java.io.File;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

//Single dropdown

public class Facebook {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\java\\Selinium\\webdriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		// get

		driver.get("https://www.facebook.com/");

		// maxi

		driver.manage().window().maximize();

		// locators

		Thread.sleep(2000);

		// basic xpath

		WebElement a = driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
		a.click();

		Thread.sleep(2000);

		WebElement b = driver.findElement(By.name("firstname"));
		b.sendKeys("vincy");

		WebElement c = driver.findElement(By.name("lastname"));
		c.sendKeys("Michael");

		WebElement d = driver.findElement(By.xpath("(//input[@type='text'])[4]"));
		d.sendKeys("vincy@gmail.com");

		WebElement e = driver.findElement(By.xpath("(//input[@data-type='text'])[4]"));
		e.sendKeys("vincy@gmail.com");

		WebElement f = driver.findElement(By.xpath("//input[@data-type='password']"));
		f.sendKeys("narpavi");

		// singledropdown-SELECTBYVALUE

		WebElement g = driver.findElement(By.id("day"));

		Select D = new Select(g);
		D.selectByValue("6");

		// getoptions

		List<WebElement> k = D.getOptions();
		for (WebElement l : k) {
			String m = l.getText();
			System.out.println(m);
		}
		System.out.println("===================================");

		// selectbyindex

		WebElement h = driver.findElement(By.id("month"));

		Select M = new Select(h);
		M.selectByIndex(2);

		// getoptions

		List<WebElement> n = M.getOptions();
		for (WebElement o : n) {
			String p = o.getText();
			System.out.println(p);
		}
		System.out.println("=======================");
		// selectbyvisibletext

		WebElement i = driver.findElement(By.id("year"));

		Select Y = new Select(i);
		Y.selectByVisibleText("1994");

		WebElement j = driver.findElement(By.name("sex"));
		j.click();
		
	
	}

}
