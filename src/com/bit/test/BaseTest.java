package com.bit.test;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest {

	public void targettest() {

		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\Ishra\\Downloads\\geckodriver-v0.27.0-win64\\geckodriver.exe");
		FirefoxDriver dr = new FirefoxDriver();

		//go to any website
		dr.get("https://www.target.com/");
		//print title
		System.out.println(dr.getTitle());
		// print url
		System.out.println(dr.getCurrentUrl());
		// go to my account
		//print title
		System.out.println(dr.getTitle());
		// print url
		System.out.println(dr.getCurrentUrl());

		dr.findElement(By.xpath("//input[@id=\"username\"]")).sendKeys("Ishrak.hossen8@gmail.com");
		dr.findElement(By.xpath("//input[@id=\"firstname\"]")).sendKeys("Ishrak");
		dr.findElement(By.xpath("//input[@id=\"lastname\"]")).sendKeys("Hussain");
		dr.findElement(By.cssSelector("#phone")).sendKeys("3473612618");

		dr.quit();

	}
}