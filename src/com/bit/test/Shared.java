package com.bit.test;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Shared {

	FirefoxDriver dr;

	public void openBrowser() {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\Ishra\\Downloads\\geckodriver-v0.27.0-win64\\geckodriver.exe");
		FirefoxDriver dr = new FirefoxDriver();
		dr = new FirefoxDriver();

	}

	public void closeBrowser() {
		dr.quit();
	}

	public void gotoAnyWebsite(String url) {
		dr.get(url);
	}

	public void clickonAnyElement(By locator) {
		dr.findElement(locator).click();
	}

	public void typeonAnyElement(By by, String value) {
		
		dr.findElement(by).sendKeys(value);
	}

	public void printTitle() {
		String t = dr.getTitle();
		System.out.println(t);
	}

	public void printUrl() {
		String t = dr.getCurrentUrl();
		System.out.println(t);
	}

}
