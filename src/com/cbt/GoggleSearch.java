package com.cbt;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoggleSearch {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", 
			"C:\\Users\\keyko\\Documents\\Selenium Dependencies\\Drivers\\chromedriver.exe");
	  WebDriver driver= new ChromeDriver();
	 
	  driver.get("https://etsy.com");
	 
}
}