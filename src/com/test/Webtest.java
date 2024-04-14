package com.test;

import java.awt.Dimension;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//webdriver methods

public class Webtest {

	public static void main(String[] args) {
		
		
System.setProperty("webdriver.chrome.driver","C:\\java\\Selinium\\webdriver\\chromedriver.exe");

//webdriver refname=new chromedriver();

  WebDriver driver = new ChromeDriver();
  
  //GET
  
  driver.get("https://www.facebook.com/");
  
  //maxi
  
  driver.manage().window().maximize();
  
  //NAVIGATION
  
 //navigateto
  
  driver.navigate().to("https://www.nykaa.com/");
  
  //navigateback
  
  driver.navigate().back();
  
  //navigateforward
  
  driver.navigate().forward();
  
  //navigaterefresh
  
  driver.navigate().refresh();
  
  //geturl
  
  String c = driver.getCurrentUrl();
  System.out.println(c);
  
  //gettitle
  
  String b = driver.getTitle();
  System.out.println(b);
  
//getpagesource
  
  String a = driver.getPageSource();
  System.out.println(a);
  
  
 
  
  
  
  

  

  
  
  
  
  
  
  
  
  
  


		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	

}
