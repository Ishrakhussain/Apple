package com.bit.test;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Scenario {
	public void targettest () {

	
		
	Shared s = new Shared();

		s.gotoAnyWebsite("https://www.facebook.com/");
		s.clickonAnyElement(By.xpath("//input[@id=\"username\"]"));
		s.typeonAnyElement(By.xpath("//input[@id='search']"), "Hussain");

		s.closeBrowser();
	}
	}
