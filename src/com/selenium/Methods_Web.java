package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//webdriver methods

public class Methods_Web {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\java\\Selinium\\webdriver\\chromedriver.exe");

		WebDriver drive = new ChromeDriver();

		// get

		drive.get("https://www.amazon.in/");

		// maxi

		drive.manage().window().maximize();

		// navigateto

		drive.navigate().to("https://www.youtube.com/");

		// navigateback

		drive.navigate().back();

		// navigateforward

		drive.navigate().forward();

		// navigaterefresh

		drive.navigate().refresh();

		// gettitle

		String a = drive.getTitle();
		System.out.println(a);

		// getcureenturl

		String b = drive.getCurrentUrl();
		System.out.println(b);

		// getpagesource

		String c = drive.getPageSource();
		System.out.println(c);

	}

}
