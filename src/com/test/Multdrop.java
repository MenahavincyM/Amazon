package com.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multdrop {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\java\\Selinium\\webdriver\\chromedriver.exe");

		WebDriver drive = new ChromeDriver();
		drive.get("https://demoqa.com/select-menu");
		drive.manage().window().maximize();
		WebElement a = drive.findElement(By.id("oldSelectMenu"));
		Select co = new Select(a);
		co.selectByValue("1");
		co.selectByIndex(4);
		co.selectByVisibleText("White");

		// getoptions

		List<WebElement> b = co.getOptions();
		for (WebElement c : b) {
			String t = c.getText();
			System.out.println(t);
		}
		System.out.println("==================================");

		// getallselcted options

		List<WebElement> d = co.getAllSelectedOptions();
		for (WebElement e : d) {
			String te = e.getText();
			System.out.println(te);
		}
		System.out.println("=================================");
		// getfirstselected

		// multi

		WebElement f = drive.findElement(By.id("cars"));
		Select ca = new Select(f);
		ca.selectByIndex(2);
		ca.selectByValue("audi");
		ca.selectByVisibleText("Volvo");

		// getallselectecd

		List<WebElement> g = ca.getAllSelectedOptions();
		for (WebElement h : g) {
			String tex = h.getText();
			System.out.println(tex);
		}
		System.out.println("===============");

		// getfirstselected

		WebElement fi = ca.getFirstSelectedOption();
		String text = fi.getText();
		System.out.println(text);
		Thread.sleep(2000);
		//deselect
		ca.deselectByIndex(0);
		ca.deselectByValue("opel");
		ca.deselectAll();
		

	}

}
